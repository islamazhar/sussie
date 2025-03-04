package examples.AllCodeSnippets; 
import android.content.Context;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

/**
 * Created by Rinomancer on 20.08.2015.
 */
public class class_823 {
    private static SSLSocketFactory sslSocketFactory;
    private Context context;
    private URL url;
    private String parameters = ";
    private String response;
    private HttpsURLConnection connection;

    public ConnectionBuilder() {

    }

    public ConnectionBuilder(Context context, URL url) {
        this.context = context;
        this.url = url;
    }

    private SSLSocketFactory getSSLSocketFactory() throws Exception {
        if (sslSocketFactory == null) {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            InputStream caInput = new BufferedInputStream(context.getAssets().open("my_certificate.crt"));
            Certificate ca = cf.generateCertificate(caInput);

            // Create a KeyStore containing our trusted CAs
            String keyStoreType = KeyStore.getDefaultType();
            KeyStore keyStore = KeyStore.getInstance(keyStoreType);
            keyStore.load(null, null);
            keyStore.setCertificateEntry("ca", ca);

            // Create a TrustManager that trusts the CAs in our KeyStore
            String tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
            TrustManagerFactory tmf = TrustManagerFactory.getInstance(tmfAlgorithm);
            tmf.init(keyStore);

            // Create an SSLContext that uses our TrustManager
            SSLContext context = SSLContext.getInstance("TLS");
            context.init(null, tmf.getTrustManagers(), null);

            sslSocketFactory = context.getSocketFactory();
        }
        return sslSocketFactory;
    }

    public ConnectionBuilder connect() throws Exception {
        connection = null;
        try {
            connection = (HttpsURLConnection) url.openConnection();
            connection.setSSLSocketFactory(getSSLSocketFactory());
            connection.setConnectTimeout(5000);

            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            connection.setRequestMethod("POST");
            connection.setFixedLengthStreamingMode(parameters.getBytes().length);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            if (sessionId != null && !sessionId.isEmpty()) {
                connection.setRequestProperty("Session-Id", sessionId);
            }

            PrintWriter out = new PrintWriter(connection.getOutputStream());
            out.print(parameters);
            out.close();

            String response = ";
            Scanner inStream = new Scanner(connection.getInputStream());
            while (inStream.hasNextLine()) {
                response += inStream.nextLine();
            }
            this.response = response;

            return this;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public ConnectionBuilder context(Context context) {
        this.context = context;
        return this;
    }

    public ConnectionBuilder url(URL url) {
        this.url = url;
        return this;
    }

    public ConnectionBuilder url(String url) throws MalformedURLException {
        this.url = new URL(url);
        return this;
    }

    public ConnectionBuilder parameter(String parameter, String value) throws UnsupportedEncodingException {
        if (parameters.isEmpty()) {
            parameters = parameter + "=" + URLEncoder.encode(value, "UTF-8");
        } else {
            parameters += "&" + parameter + "=" + URLEncoder.encode(value, "UTF-8");
        }
        return this;
    }

    public String getResponse() {
        return response;
    }

    public String getHeader(String headerName) {
        return connection.getHeaderField(headerName);
    }

    public int getStatusCode() throws IOException{
        return connection.getResponseCode();
    }
}
