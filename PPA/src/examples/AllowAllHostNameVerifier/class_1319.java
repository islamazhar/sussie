package examples.AllowAllHostNameVerifier; 
public class class_1319 { 
 HostnameVerifier hostnameVerifier = org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;
    DefaultHttpClient defaultclient = new DefaultHttpClient();

    SchemeRegistry registry = new SchemeRegistry();
    SSLSocketFactory socketFactory = SSLSocketFactory.getSocketFactory();
    socketFactory.setHostnameVerifier((X509HostnameVerifier) hostnameVerifier);
    registry.register(new Scheme("https", socketFactory, 443));

    cm = new ThreadSafeClientConnManager(defaultclient.getParams(), registry);
    client = new DefaultHttpClient(cm, defaultclient.getParams());

    // Set verifier     
    HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);             
    post = new HttpPost("https://my-app.herokuapp.com/api/player"); 

}