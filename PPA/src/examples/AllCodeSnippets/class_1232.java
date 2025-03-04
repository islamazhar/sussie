package examples.AllCodeSnippets; 
// package com.avilyne.android;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.params.ConnManagerPNames;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class class_1232 extends Activity {

    private static final String SERVICE_URL =
    "https://192.168.2.101:8443/RestWebServiceDemo/rest/person";

    private static final String TAG = "AndroidRESTClientActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void retrieveSampleData(View vw) {

        String sampleURL = SERVICE_URL + "/sample";

        WebServiceTask wst = new WebServiceTask(WebServiceTask.GET_TASK, this,
                "GETting data...");

        wst.execute(new String[] { sampleURL });

    }

    public void clearControls(View vw) {

        EditText edFirstName = (EditText) findViewById(R.id.first_name);
        EditText edLastName = (EditText) findViewById(R.id.last_name);
        EditText edEmail = (EditText) findViewById(R.id.email);

        edFirstName.setText(");
        edLastName.setText(");
        edEmail.setText(");

    }

    public void postData(View vw) {

        EditText edFirstName = (EditText) findViewById(R.id.first_name);
        EditText edLastName = (EditText) findViewById(R.id.last_name);
        EditText edEmail = (EditText) findViewById(R.id.email);

        String firstName = edFirstName.getText().toString();
        String lastName = edLastName.getText().toString();
        String email = edEmail.getText().toString();

        if (firstName.equals(") || lastName.equals(") || email.equals(")) {
            Toast.makeText(this, "Please enter in all required fields.",
                    Toast.LENGTH_LONG).show();
            return;
        }

        WebServiceTask wst = new WebServiceTask(WebServiceTask.POST_TASK, this,
                "Posting data...");

        wst.addNameValuePair("firstName", firstName);
        wst.addNameValuePair("lastName", lastName);
        wst.addNameValuePair("email", email);

        // the passed String is the URL we will POST to
        wst.execute(new String[] { SERVICE_URL });

    }

    public void handleResponse(String response) {

        EditText edFirstName = (EditText) findViewById(R.id.first_name);
        EditText edLastName = (EditText) findViewById(R.id.last_name);
        EditText edEmail = (EditText) findViewById(R.id.email);

        edFirstName.setText(");
        edLastName.setText(");
        edEmail.setText(");

        try {

            JSONObject jso = new JSONObject(response);

            String firstName = jso.getString("firstName");
            String lastName = jso.getString("lastName");
            String email = jso.getString("email");

            edFirstName.setText(firstName);
            edLastName.setText(lastName);
            edEmail.setText(email);

        } catch (Exception e) {
            Log.e(TAG, e.getLocalizedMessage(), e);
        }

    }

    private void hideKeyboard() {

        InputMethodManager inputManager = (InputMethodManager) MainActivity.this
                .getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(MainActivity.this
                .getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    private class WebServiceTask extends AsyncTask<String, Integer, String> {

        public static final int POST_TASK = 1;
        public static final int GET_TASK = 2;

        private static final String TAG = "WebServiceTask";

        // connection timeout, in milliseconds (waiting to connect)
        // private static final int CONN_TIMEOUT = 3000;

        // socket timeout, in milliseconds (waiting for data)
        // private static final int SOCKET_TIMEOUT = 5000;

        private int taskType = GET_TASK;
        private Context mContext = null;
        private String processMessage = "Processing...";

        private ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();

        private ProgressDialog pDlg = null;

        public WebServiceTask(int taskType, Context mContext,
                String processMessage) {

            this.taskType = taskType;
            this.mContext = mContext;
            this.processMessage = processMessage;
        }

        public void addNameValuePair(String name, String value) {

            params.add(new BasicNameValuePair(name, value));
        }

        private void showProgressDialog() {

            pDlg = new ProgressDialog(mContext);
            pDlg.setMessage(processMessage);
            pDlg.setProgressDrawable(mContext.getWallpaper());
            pDlg.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            pDlg.setCancelable(false);
            pDlg.show();

        }

        @Override
        protected void onPreExecute() {

            hideKeyboard();
            showProgressDialog();

        }

        protected String doInBackground(String... urls) {

            String url = urls[0];
            String result = ";

            HttpResponse response = doResponse(url);

            if (response == null) {
                return result;
            } else {

                try {

                    result = inputStreamToString(response.getEntity()
                            .getContent());

                } catch (IllegalStateException e) {
                    Log.e(TAG, e.getLocalizedMessage(), e);

                } catch (IOException e) {
                    Log.e(TAG, e.getLocalizedMessage(), e);
                }

            }

            return result;
        }

        @Override
        protected void onPostExecute(String response) {

            handleResponse(response);
            pDlg.dismiss();

        }

        // Establish connection and socket (data retrieval) timeouts
        /*
         * private HttpParams getHttpParams() {
         * 
         * HttpParams htpp = new BasicHttpParams();
         * 
         * HttpConnectionParams.setConnectionTimeout(htpp, CONN_TIMEOUT);
         * HttpConnectionParams.setSoTimeout(htpp, SOCKET_TIMEOUT);
         * 
         * return htpp; }
         */

        private HttpResponse doResponse(String url) {

            // Use our connection and data timeouts as parameters for our
            // DefaultHttpClient
            // HttpClient httpclient = new DefaultHttpClient(getHttpParams());

            DefaultHttpClient httpsclient = httpsClient();

            HttpResponse response = null;

            try {
                switch (taskType) {

                case POST_TASK:
                    HttpPost httppost = new HttpPost(url);
                    // Add parameters
                    httppost.setEntity(new UrlEncodedFormEntity(params));

                    response = httpsclient.execute(httppost); // httpclient.execute(httppost);
                    break;
                case GET_TASK:
                    HttpGet httpget = new HttpGet(url);
                    response = httpsclient.execute(httpget); // httpclient.execute(httpget);
                    break;
                }
            } catch (Exception e) {

                Log.e(TAG, e.getLocalizedMessage(), e);

            }

            return response;
        }

        private String inputStreamToString(InputStream is) {

            String line = ";
            StringBuilder total = new StringBuilder();

            // Wrap a BufferedReader around the InputStream
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));

            try {
                // Read response until the end
                while ((line = rd.readLine()) != null) {
                    total.append(line);
                }
            } catch (IOException e) {
                Log.e(TAG, e.getLocalizedMessage(), e);
            }

            // Return full string
            return total.toString();
        }

    }

    private DefaultHttpClient httpsClient() {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory
                .getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", new EasySSLSocketFactory(),
                443));

        HttpParams httpParams = new BasicHttpParams();
        httpParams.setParameter(ConnManagerPNames.MAX_TOTAL_CONNECTIONS, 30);
        httpParams.setParameter(ConnManagerPNames.MAX_CONNECTIONS_PER_ROUTE,
                new ConnPerRouteBean(30));
        httpParams.setParameter(HttpProtocolParams.USE_EXPECT_CONTINUE, false);
        HttpProtocolParams.setVersion(httpParams, HttpVersion.HTTP_1_1);

        ClientConnectionManager cm = new SingleClientConnManager(httpParams,
                schemeRegistry);
        return new DefaultHttpClient(cm, httpParams);
    }

    private class EasySSLSocketFactory implements LayeredSocketFactory {
        private SSLContext sslcontext = null;

        private SSLContext createEasySSLContext() throws IOException {
            try {
                SSLContext context = SSLContext.getInstance("TLS");
                context.init(null,
                        new TrustManager[] { new EasyX509TrustManager(null) },
                        null);
                return context;
            } catch (Exception e) {
                throw new IOException(e.getMessage());
            }
        }

        private SSLContext getSSLContext() throws IOException {
            if (this.sslcontext == null) {
                this.sslcontext = createEasySSLContext();
            }
            return this.sslcontext;
        }

        /**
         * @see org.apache.http.conn.scheme.SocketFactory#connectSocket(java.net.Socket,
         *      java.lang.String, int, java.net.InetAddress, int,
         *      org.apache.http.params.HttpParams)
         */
        public Socket connectSocket(Socket sock, String host, int port,
                InetAddress localAddress, int localPort, HttpParams params)
                throws IOException, UnknownHostException,
                ConnectTimeoutException {
            int connTimeout = HttpConnectionParams.getConnectionTimeout(params);
            int soTimeout = HttpConnectionParams.getSoTimeout(params);

            InetSocketAddress remoteAddress = new InetSocketAddress(host, port);
            SSLSocket sslsock = (SSLSocket) ((sock != null) ? sock
                    : createSocket());

            if ((localAddress != null) || (localPort > 0)) {
                // we need to bind explicitly
                if (localPort < 0) {
                    localPort = 0; // indicates "any"
                }
                InetSocketAddress isa = new InetSocketAddress(localAddress,
                        localPort);
                sslsock.bind(isa);
            }

            sslsock.connect(remoteAddress, connTimeout);
            sslsock.setSoTimeout(soTimeout);
            return sslsock;

        }

        /**
         * @see org.apache.http.conn.scheme.SocketFactory#createSocket()
         */
        public Socket createSocket() throws IOException {
            return getSSLContext().getSocketFactory().createSocket();
        }

        /**
         * @see org.apache.http.conn.scheme.SocketFactory#isSecure(java.net.Socket)
         */
        public boolean isSecure(Socket socket) throws IllegalArgumentException {
            return true;
        }

        /**
         * @see org.apache.http.conn.scheme.LayeredSocketFactory#createSocket(java.net.Socket,
         *      java.lang.String, int, boolean)
         */
        public Socket createSocket(Socket socket, String host, int port,
                boolean autoClose) throws IOException, UnknownHostException {
            // return getSSLContext().getSocketFactory().createSocket(socket,
            // host, port, autoClose);
            return getSSLContext().getSocketFactory().createSocket(socket,
                    host, port, autoClose);
        }

        // -------------------------------------------------------------------
        // javadoc in org.apache.http.conn.scheme.SocketFactory says :
        // Both Object.equals() and Object.hashCode() must be overridden
        // for the correct operation of some connection managers
        // -------------------------------------------------------------------

        public boolean equals(Object obj) {
            return ((obj != null) && obj.getClass().equals(
                    EasySSLSocketFactory.class));
        }

        public int hashCode() {
            return EasySSLSocketFactory.class.hashCode();
        }

    }

    private class EasyX509TrustManager implements X509TrustManager {
        private X509TrustManager standardTrustManager = null;

        /**
         * Constructor for EasyX509TrustManager.
         */
        public EasyX509TrustManager(KeyStore keystore)
                throws NoSuchAlgorithmException, KeyStoreException {
            super();
            TrustManagerFactory factory = TrustManagerFactory
                    .getInstance(TrustManagerFactory.getDefaultAlgorithm());
            factory.init(keystore);
            TrustManager[] trustmanagers = factory.getTrustManagers();
            if (trustmanagers.length == 0) {
                throw new NoSuchAlgorithmException("no trust manager found");
            }
            this.standardTrustManager = (X509TrustManager) trustmanagers[0];
        }

        /**
         * @see 
         *      javax.net.ssl.X509TrustManager#checkClientTrusted(X509Certificate
         *      [],String authType)
         */
        public void checkClientTrusted(X509Certificate[] certificates,
                String authType) throws CertificateException {
            standardTrustManager.checkClientTrusted(certificates, authType);
        }

        /**
         * @see 
         *      javax.net.ssl.X509TrustManager#checkServerTrusted(X509Certificate
         *      [],String authType)
         */
        public void checkServerTrusted(X509Certificate[] certificates,
                String authType) throws CertificateException {
            if ((certificates != null) && (certificates.length == 1)) {
                certificates[0].checkValidity();
            } else {
                standardTrustManager.checkServerTrusted(certificates, authType);
            }
        }

        /**
         * @see javax.net.ssl.X509TrustManager#getAcceptedIssuers()
         */
        public X509Certificate[] getAcceptedIssuers() {
            return this.standardTrustManager.getAcceptedIssuers();
        }

    }
}
