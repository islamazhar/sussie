package examples.AllCodeSnippets; 
public class class_665{ 
 public static void main() { 
protected org.apache.http.conn.ssl.SSLSocketFactory createAdditionalCertsSSLSocketFactory() {
try {
    final KeyStore ks = KeyStore.getInstance("BKS");

    // the bks file we generated above
    final InputStream in = context.getResources().openRawResource( R.raw.mystore);  
    try {
        // don't forget to put the password used above in strings.xml/mystore_password
        ks.load(in, context.getString( R.string.mystore_password ).toCharArray());
    } finally {
        in.close();
    }

    return new AdditionalKeyStoresSSLSocketFactory(ks);

} catch( Exception e ) {
    throw new RuntimeException(e);
}
}
  }
}
