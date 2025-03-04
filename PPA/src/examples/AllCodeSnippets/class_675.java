package examples.AllCodeSnippets; 
public final class class_675 implements X509TrustManager
{
  private static String PUB_KEY = "30820122300d06092a864886f70d0101" +
    "0105000382010f003082010a0282010100b35ea8adaf4cb6db86068a836f3c85" +
    "5a545b1f0cc8afb19e38213bac4d55c3f2f19df6dee82ead67f70a990131b6bc" +
    "ac1a9116acc883862f00593199df19ce027c8eaaae8e3121f7f329219464e657" +
    "2cbf66e8e229eac2992dd795c4f23df0fe72b6ceef457eba0b9029619e0395b8" +
    "609851849dd6214589a2ceba4f7a7dcceb7ab2a6b60c27c69317bd7ab2135f50" +
    "c6317e5dbfb9d1e55936e4109b7b911450c746fe0d5d07165b6b23ada7700b00" +
    "33238c858ad179a82459c4718019c111b4ef7be53e5972e06ca68a112406da38" +
    "cf60d2f4fda4d1cd52f1da9fd6104d91a34455cd7b328b02525320a35253147b" +
    "e0b7a5bc860966dc84f10d723ce7eed5430203010001";

  public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException
  {
    if (chain == null) {
      throw new IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
    }

    if (!(chain.length > 0)) {
      throw new IllegalArgumentException("checkServerTrusted: X509Certificate is empty");
    }

    if (!(null != authType && authType.equalsIgnoreCase("RSA"))) {
      throw new CertificateException("checkServerTrusted: AuthType is not RSA");
    }

    // Perform customary SSL/TLS checks
    try {
      TrustManagerFactory tmf = TrustManagerFactory.getInstance("X509");
      tmf.init((KeyStore) null);

      for (TrustManager trustManager : tmf.getTrustManagers()) {
        ((X509TrustManager) trustManager).checkServerTrusted(chain, authType);
      }
    } catch (Exception e) {
      throw new CertificateException(e);
    }

    // Hack ahead: BigInteger and toString(). We know a DER encoded Public Key begins
    // with 0x30 (ASN.1 SEQUENCE and CONSTRUCTED), so there is no leading 0x00 to drop.
    RSAPublicKey pubkey = (RSAPublicKey) chain[0].getPublicKey();
    String encoded = new BigInteger(1 /* positive */, pubkey.getEncoded()).toString(16);

    // Pin it!
    final boolean expected = PUB_KEY.equalsIgnoreCase(encoded);
    if (!expected) {
      throw new CertificateException("checkServerTrusted: Expected public key: "
                + PUB_KEY + ", got public key:" + encoded);
      }
    }
  }
}
