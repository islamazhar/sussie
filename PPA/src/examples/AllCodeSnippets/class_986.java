package examples.AllCodeSnippets; 
public class class_986{ 
 public static void main() { 
public static HttpClient _getNewHttpClient() {
    try {
        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
        trustStore.load(null, null);

        SSLSocketFactory sf = new MySSLSocketFactory(trustStore);
        sf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

        HttpParams params = new BasicHttpParams();
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(params, HTTP.UTF_8);

        SchemeRegistry registry = new SchemeRegistry();
        registry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        registry.register(new Scheme("https", sf, 443));

        ClientConnectionManager ccm = new ThreadSafeClientConnManager(params, registry);

        DefaultHttpClient http = new DefaultHttpClient(ccm, params);
        UsernamePasswordCredentials credentials = new UsernamePasswordCredentials("jk", "jk");
        AuthScope authScope = new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT);
        http.getCredentialsProvider().setCredentials(authScope, credentials);

        return http;
    } catch (Exception e) {
        return new DefaultHttpClient();
    }
}   
  }
}
