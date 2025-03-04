package examples.AllCodeSnippets; 
public class class_504{ 
 public static void main() { 
private String getCertificateSHA1Fingerprint() {
    PackageManager pm = mContext.getPackageManager();
    String packageName = mContext.getPackageName();
    int flags = PackageManager.GET_SIGNATURES;
    PackageInfo packageInfo = null;
    try {
        packageInfo = pm.getPackageInfo(packageName, flags);
    } catch (PackageManager.NameNotFoundException e) {
        e.printStackTrace();
    }
    Signature[] signatures = packageInfo.signatures;
    byte[] cert = signatures[0].toByteArray();
    InputStream input = new ByteArrayInputStream(cert);
    CertificateFactory cf = null;
    try {
        cf = CertificateFactory.getInstance("X509");
    } catch (CertificateException e) {
        e.printStackTrace();
    }
    X509Certificate c = null;
    try {
        c = (X509Certificate) cf.generateCertificate(input);
    } catch (CertificateException e) {
        e.printStackTrace();
    }
    String hexString = null;
    try {
        MessageDigest md = MessageDigest.getInstance("SHA1");
        byte[] publicKey = md.digest(c.getEncoded());
        hexString = byte2HexFormatted(publicKey);
    } catch (NoSuchAlgorithmException e1) {
        e1.printStackTrace();
    } catch (CertificateEncodingException e) {
        e.printStackTrace();
    }
    return hexString;
}

public static String byte2HexFormatted(byte[] arr) {
    StringBuilder str = new StringBuilder(arr.length * 2);
    for (int i = 0; i < arr.length; i++) {
        String h = Integer.toHexString(arr[i]);
        int l = h.length();
        if (l == 1) h = "0" + h;
        if (l > 2) h = h.substring(l - 2, l);
        str.append(h.toUpperCase());
        if (i < (arr.length - 1)) str.append(':');
    }
    return str.toString();
}
  }
}
