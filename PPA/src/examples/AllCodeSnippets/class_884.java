package examples.AllCodeSnippets; 
public class class_884{ 
 public static void main() { 
 /**
   * Will cause HttpsURLConnection to accept even self-signed certificates.
   * @param conn
   */
  private static void trustEveryone(HttpsURLConnection conn) {
    try {
      conn.setHostnameVerifier(new HostnameVerifier() {
        public boolean verify(String hostname, SSLSession session) {
          return true;
        }
      });
      SSLContext context = SSLContext.getInstance("TLS");
      context.init(null, new X509TrustManager[] { new X509TrustManager() {

        @Override
        public void checkClientTrusted(
            java.security.cert.X509Certificate[] aChain, String aAuthType)
            throws java.security.cert.CertificateException {
        }

        @Override
        public void checkServerTrusted(
            java.security.cert.X509Certificate[] aChain, String aAuthType)
            throws java.security.cert.CertificateException {
        }

        @Override
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
          // TODO Auto-generated method stub
          return new java.security.cert.X509Certificate[0];
        }
      } }, new SecureRandom());
      conn.setSSLSocketFactory(context.getSocketFactory());
    } catch (Exception e) { //handle accordingly
      e.printStackTrace();
    }
  }
  }
}
