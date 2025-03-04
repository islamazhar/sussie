package examples.AllCodeSnippets; 
public class class_1227 extends AppCompatActivity {

private TextView mTextView;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mTextView = (TextView) findViewById(R.id.textView);

    String url = "https://192.168.1.100/testvolley";

    HurlStack hurlStack = new HurlStack() {
        @Override
        protected HttpURLConnection createConnection(URL url) throws IOException {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) super.createConnection(url);
            try {
                httpsURLConnection.setSSLSocketFactory(getSSLSocketFactory());
                httpsURLConnection.setHostnameVerifier(getHostnameVerifier());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return httpsURLConnection;
        }
    };

    final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {
            try {
                mTextView.setText(response.toString(5));
            } catch (JSONException e) {
                mTextView.setText(e.toString());
            }
        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            mTextView.setText(error.toString());
        }
    });

    final RequestQueue requestQueue = Volley.newRequestQueue(this, hurlStack);

    requestQueue.add(jsonObjectRequest);
}

// Let's assume your server app is hosting inside a server machine
// which has a server certificate in which "Issued to" is "localhost",for example.
// Then, inside verify method you can verify "localhost". 
// If not, you can temporarily return true
private HostnameVerifier getHostnameVerifier() {
    return new HostnameVerifier() {
        @Override
        public boolean verify(String hostname, SSLSession session) {
            //return true;
            HostnameVerifier hv = HttpsURLConnection.getDefaultHostnameVerifier();
            return hv.verify("localhost", session);
        }
    };
}

private TrustManager[] getWrappedTrustManagers(TrustManager[] trustManagers) {
    final X509TrustManager originalTrustManager = (X509TrustManager) trustManagers[0];
    return new TrustManager[]{
            new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {
                    return originalTrustManager.getAcceptedIssuers();
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                    try {
                        originalTrustManager.checkClientTrusted(certs, authType);
                    } catch (CertificateException ignored) {
                    }
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                    try {
                        originalTrustManager.checkServerTrusted(certs, authType);
                    } catch (CertificateException ignored) {
                    }
                }
            }
    };
}

private SSLSocketFactory getSSLSocketFactory()
        throws CertificateException, KeyStoreException, IOException, NoSuchAlgorithmException, KeyManagementException {
    CertificateFactory cf = CertificateFactory.getInstance("X.509");
    InputStream caInput = getResources().openRawResource(R.raw.my_cert); // this cert file stored in \app\src\main\res\raw folder path

    Certificate ca = cf.generateCertificate(caInput);
    caInput.close();

    KeyStore keyStore = KeyStore.getInstance("BKS");
    keyStore.load(null, null);
    keyStore.setCertificateEntry("ca", ca);

    String tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
    TrustManagerFactory tmf = TrustManagerFactory.getInstance(tmfAlgorithm);
    tmf.init(keyStore);

    TrustManager[] wrappedTrustManagers = getWrappedTrustManagers(tmf.getTrustManagers());

    SSLContext sslContext = SSLContext.getInstance("TLS");
    sslContext.init(null, wrappedTrustManagers, null);

    return sslContext.getSocketFactory();
}
}
