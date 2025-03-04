package examples.RSA; 
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;

import javax.crypto.Cipher;

import android.util.Log;

/**
 * Generates Sha1withRSA XML signatures.
 */
public final class class_665 {

  /** Log tag. */
  private static final String LOG_TAG = "XmlSigner";

  /**
   * DER encoded ASN.1 identifier for SHA1 digest: "1.3.14.3.2.26".
   */
  private static final byte[] DER_SHA1_DIGEST_IDENTIFIER = new byte[]{48, 33, 48, 9, 6, 5, 43, 14,
      3, 2, 26, 5, 0, 4, 20};

  /** The characters needed for base 64 encoding. */
  private static final char[] CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

  /**
   * Hide constructor.
   */
  private XmlSigner() {

  }

  /**
   * Generates Sha1withRSA XML signature for the specified XML content and
   * private key.
   * 
   * @param xml the XML content
   * @param privateKey the private key to generate the signature
   * @return the whole signature node XML string that should be inserted
   * somewhere in the XML
   * @throws XmlSignerException if the signature XML can not be generated
   */
  public static String generateXmlSignature(String xml, PrivateKey privateKey) throws Throwable {

    try {
      // get canonized XML
      int soapBodyStart = xml.indexOf("<soap:Body>");
      int soapBodyEnd = xml.indexOf("</soap:Body>");
      String bodyXml = xml.substring(soapBodyStart + 12, soapBodyEnd - 1);

      // get bytes from the XML
      byte[] xmlBytes = bodyXml.getBytes("UTF-8");

      // calculate SHA256 digest from the XML bytes
      byte[] xmlDigestBytes = sha1Digest(xmlBytes);

      // encode the XML digest to base64 string
      String base64XmlDigest = base64encode(xmlDigestBytes, false);

      // generate SignedInfo node to be signed with signature
      String signedInfo = "<ds:SignedInfo xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\">"
          + "<ds:CanonicalizationMethod Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\">"
          + "</ds:CanonicalizationMethod><ds:SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\">"
          + "</ds:SignatureMethod><ds:Reference URI=\"\"><ds:Transforms>"
          + "<ds:Transform Algorithm=\"http://www.w3.org/2002/06/xmldsig-filter2\">"
          + "<ds:XPath xmlns:ds=\"http://www.w3.org/2002/06/xmldsig-filter2\" Filter=\"intersect\">"
          + "/soap:Envelope/soap:Body/*</ds:XPath></ds:Transform>"
          + "<ds:Transform xmlns:ds=\"http://www.w3.org/2002/06/xmldsig-filter2\" "
          + "Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"></ds:Transform>"
          + "</ds:Transforms><ds:DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\">"
          + "</ds:DigestMethod><ds:DigestValue>" + base64XmlDigest
          + "</ds:DigestValue></ds:Reference></ds:SignedInfo>";

      // get the bytes from SignedInfo that will be signed
      byte[] signedInfoBytes = signedInfo.getBytes("UTF-8");

      // calculate SHA1 digest of the signed info bytes
      byte[] signedInfoSha1Digest = sha1Digest(signedInfoBytes);

      // encode the digest identifier and the SHA1 digest in DER format
      byte[] signedInfoDerSha1Digest = mergeArrays(DER_SHA1_DIGEST_IDENTIFIER, signedInfoSha1Digest);

      // initialize RSA cipher with the parameters from the private key
      Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
      cipher.init(Cipher.ENCRYPT_MODE, privateKey);

      // encrypt the DER encoded SHA1 digest of signed info
      byte[] signatureBytes = cipher.doFinal(signedInfoDerSha1Digest);

      // encode the signature bytes into base64 string
      String base64RsaSignature = base64encode(signatureBytes, true);

      // generate the whole signature node XML string
      String signature = "<wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis"
          + "-200401-wss-wssecurity-secext-1.0.xsd\">"
          + "<ds:Signature xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\">" + signedInfo
          + "<ds:SignatureValue>" + base64RsaSignature
          + "</ds:SignatureValue></ds:Signature></wsse:Security>";

      return signature;
    } catch (Throwable e) {
      Log.e(LOG_TAG, "Error generating signature for XML", e);
      throw e;
    }
  }

  /**
   * Merges two byte arrays in one.
   * 
   * @param array1 the first array
   * @param array2 the second array
   * @return merged array
   */
  public static byte[] mergeArrays(byte[] array1, byte[] array2) {
    byte[] temp = new byte[array1.length + array2.length];
    System.arraycopy(array1, 0, temp, 0, array1.length);
    System.arraycopy(array2, 0, temp, array1.length, array2.length);
    return temp;
  }

  /**
   * Generates SHA-1 digest of the provided data.
   * 
   * @param data the data to digest
   * @return SHA-1 digest of the provided data.
   */
  public static byte[] sha1Digest(byte[] data) {
    MessageDigest mdSha1 = null;
    try {
      mdSha1 = MessageDigest.getInstance("SHA-1");
    } catch (NoSuchAlgorithmException e1) {
      Log.e(LOG_TAG, "Error initializing SHA1 message digest");
    }
    mdSha1.update(data);
    byte[] sha1hash = mdSha1.digest();
    return sha1hash;
  }


  /**
   * Generates SHA-256 digest of the provided data.
   * 
   * @param data the data to digest
   * @return SHA-256 digest of the provided data.
   */
  public static byte[] sha256Digest(byte[] data) {
    MessageDigest mdSha256 = null;
    try {
      mdSha256 = MessageDigest.getInstance("SHA-256");
    } catch (NoSuchAlgorithmException e1) {
      Log.e(LOG_TAG, "Error initializing SHA1 message digest");
    }
    mdSha256.update(data);
    byte[] sha256hash = mdSha256.digest();
    return sha256hash;
  }

  /**
   * Encoded byte arrays into Base64 strings.
   * 
   * @param data the byte array to encode
   * @param wrapLines <code>true</code> to add \r\n
   * @return base64 encoded string
   */
  public static String base64encode(byte[] data, boolean wrapLines) {
    int length = data.length;
    StringBuilder sb = new StringBuilder(length * 3 / 2);
    int end = length - 3;
    int i = 0;
    int n = 0;

    while (i <= end) {
      int d = ((((int) data[i]) & 0x0ff) << 16) | ((((int) data[i + 1]) & 0x0ff) << 8)
          | (((int) data[i + 2]) & 0x0ff);

      sb.append(CHARS[(d >> 18) & 63]);
      sb.append(CHARS[(d >> 12) & 63]);
      sb.append(CHARS[(d >> 6) & 63]);
      sb.append(CHARS[d & 63]);

      i += 3;

      if (n++ >= 14) {
        n = 0;
        if (wrapLines) {
          sb.append("\r\n");
        }
      }
    }

    if (i == length - 2) {
      int d = ((((int) data[i]) & 0x0ff) << 16) | ((((int) data[i + 1]) & 255) << 8);
      sb.append(CHARS[(d >> 18) & 63]);
      sb.append(CHARS[(d >> 12) & 63]);
      sb.append(CHARS[(d >> 6) & 63]);
      sb.append("=");
    } else if (i == length - 1) {
      int d = (((int) data[i]) & 0x0ff) << 16;

      sb.append(CHARS[(d >> 18) & 63]);
      sb.append(CHARS[(d >> 12) & 63]);
      sb.append("==");
    }

    return sb.toString();
  }
}
