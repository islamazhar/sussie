package examples.X509TrustManager; 
public class class_296 { 
public static javax.net.ssl.TrustManager getTrustManager()
{
    javax.net.ssl.TrustManager tm = new javax.net.ssl.X509TrustManager() {

        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return null;
        }

        
        public void checkClientTrusted(
                java.security.cert.X509Certificate[] chain, String authType)
                throws java.security.cert.CertificateException {

        }

        
        public void checkServerTrusted(
                java.security.cert.X509Certificate[] chain, String authType)
                throws java.security.cert.CertificateException {        
        }
        };
        return tm;
}



public static DefaultHttpClient getThreadSafeClient() throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException, KeyManagementException, UnrecoverableKeyException {
    DefaultHttpClient client = new DefaultHttpClient();
    ClientConnectionManager mgr = client.getConnectionManager();
    HttpParams cleintParams = client.getParams();

    cleintParams.setBooleanParameter("http.protocol.expect-continue", true);
    cleintParams.setBooleanParameter("http.protocol.warn-extra-input", true);
    // params.setIntParameter("http.socket.receivebuffer", 999999);

    //---->> SSL
    KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
    trustStore.load(null, null);

    SSLSocketFactory sf = new MySSLSocketFactory(trustStore);
    sf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

    HttpParams params = new BasicHttpParams();
    HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
   // HttpProtocolParams.setContentCharset(params, HTTP.UTF_8);

    SchemeRegistry registry = new SchemeRegistry();
    registry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    registry.register(new Scheme("https", sf, 443));

    //<<------


client = new DefaultHttpClient(new ThreadSafeClientConnManager(params, registry), cleintParams);

    return client;
}

}