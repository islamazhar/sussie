package examples.AllCodeSnippets; 
public class class_1160{ 
 public static void main() { 
boolean isCertExist;
    TrustManagerFactory tmf;
    try {
        tmf = TrustManagerFactory.getInstance(TrustManagerFactory
                .getDefaultAlgorithm());

        tmf.init((KeyStore) null);

        X509TrustManager xtm = (X509TrustManager) tmf.getTrustManagers()[0];
        for (X509Certificate cert : xtm.getAcceptedIssuers()) {
            if (cert.getIssuerDN().getName().contains("MyCert")) {
                isCertExist = true;
                break;
            }
        }
    } catch (NoSuchAlgorithmException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (KeyStoreException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
  }
}
