package examples.AllCodeSnippets; 
public class class_517{ 
 public static void main() { 
private HttpClient getHttpClient(){
    RegistryBuilder<ConnectionSocketFactory> registryBuilder = RegistryBuilder.<ConnectionSocketFactory> create();
    ConnectionSocketFactory plainSF = new PlainConnectionSocketFactory();
    registryBuilder.register("http", plainSF);
    try {
        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
        TrustStrategy anyTrustStrategy = new TrustStrategy() {
            @Override
            public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                return true;
            }
        };
        SSLContext sslContext = SSLContexts.custom().useTLS().loadTrustMaterial(trustStore, anyTrustStrategy)
                .build();
        LayeredConnectionSocketFactory sslSF = new SSLConnectionSocketFactory(sslContext,
                SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        registryBuilder.register("https", sslSF);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    Registry<ConnectionSocketFactory> registry = registryBuilder.build();
    PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(registry);
    HttpClient httpclient = HttpClientBuilder.create().setConnectionManager(connManager).build();

    return httpclient;
}
  }
}
