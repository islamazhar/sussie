package examples.X509TrustManager; 
  public class class_119 extends org.apache.http.conn.ssl.SSLSocketFactory {
    private SSLSocketFactory sslFactory = HttpsURLConnection.getDefaultSSLSocketFactory();

    public SimpleSSLSocketFactory(KeyStore truststore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException,
            UnrecoverableKeyException {
        super(null);

        try {
            SSLContext context = SSLContext.getInstance("TLS");

            // Create a trust manager that does not validate certificate chains and simply
            // accept all type of certificates
            TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return new java.security.cert.X509Certificate[] {};
                }

                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }

                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }
            } };

            // Initialize the socket factory
            context.init(null, trustAllCerts, new SecureRandom());
            sslFactory = context.getSocketFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public Socket createSocket(Socket socket, String host, int port, boolean autoClose) throws IOException, UnknownHostException {
        return sslFactory.createSocket(socket, host, port, autoClose);
    }

    
    public Socket createSocket() throws IOException {
        return sslFactory.createSocket();
    }
}
