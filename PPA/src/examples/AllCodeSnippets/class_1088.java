package examples.AllCodeSnippets; 
(...)
public static class class_1088 extends AsyncTask<Void, Integer, AsyncResponse> {

    protected String jsonData;

    protected IGetJsonListener listener;
    protected Context context = null;
    protected String strUrl;

    public GetJsonTask(Context c, IGetJsonListener l, String strUrl) {
        super();
        listener = l;
        context = c;
        this.strUrl = strUrl;
    }

    @Override
    protected AsyncResponse doInBackground(Void... Void) {

        JsonObject jsonObjectResult = new JsonObject();
        APIStatus status;

        if (isConnected(context)) {
            HttpsURLConnection httpsURLConnection=null;
            try {
                //THIS IS KEY: context contains only our CA cert
                SSLContext sslContext = getSSLContext(context);
                if (sslContext != null) {
                    //for HTTP BASIC AUTH if your server implements this
                    //String encoded = Base64.encodeToString(
                    //        ("your_user_name" + ":" + "your_pwd").getBytes(),
                    //        Base64.DEFAULT);
                    URL url = new URL(strUrl);
                    httpsURLConnection = (HttpsURLConnection) url.openConnection();
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Content-length", "0");
                    httpsURLConnection.setUseCaches(false);
                    httpsURLConnection.setAllowUserInteraction(false);
                    //FOR HTTP BASIC AUTH
                    //httpsURLConnection.setRequestProperty("Authorization", "Basic " + encoded);
                    //THIS IS KEY: Set connection to use custom socket factory
                    httpsURLConnection.setSSLSocketFactory(sslContext.getSocketFactory());
                    //httpsURLConnection.setConnectTimeout(timeout);
                    //httpsURLConnection.setReadTimeout(timeout);
                    httpsURLConnection.connect();
                    status = getStatusFromCode(httpsURLConnection.getResponseCode());


                    listener.getJsonShowProgress(90);

                    if (status == APIStatus.OK) {

                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
                        StringBuilder stringBuilder = new StringBuilder();

                        String line;
                        while ((line = bufferedReader.readLine()) != null) {
                            stringBuilder.append(line);
                        }
                        bufferedReader.close();
                        JsonParser parser = new JsonParser();
                        String s = stringBuilder.toString();
                        jsonObjectResult = (JsonObject) parser.parse(s);
                    }
                } else
                    status = APIStatus.AUTH_ERROR;
                listener.getJsonShowProgress(99);
            //THIS IS KEY: this exception is thrown if the certificate
            //is signed by a CA that is not our CA
            } catch (SSLHandshakeException e) {
                status = APIStatus.AUTH_ERROR;
                //React to what is probably a man-in-the-middle attack
            } catch (IOException e) {
                status = APIStatus.NET_ERROR;
            } catch (JsonParseException e) {
                status = APIStatus.JSON_ERROR;
            } catch (Exception e) {
                status = APIStatus.UNKNOWN_ERROR;
            } finally {
                if (httpsURLConnection != null)
                    httpsURLConnection.disconnect();
            }
        } else {
            status = APIStatus.NET_ERROR;
        }
        // if not successful issue another call for the next hour.
        AsyncResponse response = new AsyncResponse();
        response.jsonData = jsonObjectResult;
        response.opStatus = status;

        return response;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        if (listener != null)
            listener.getJsonStartProgress();
    }

    @Override
    protected void onProgressUpdate(Integer... progress) {
        listener.getJsonShowProgress(progress[0]);
    }

    @Override
    protected void onPostExecute(AsyncResponse result) {
        listener.getJsonFinished(result.jsonData, result.opStatus);
    }

    public  interface IGetJsonListener {
        void getJsonStartProgress();
        void getJsonShowProgress(int percent);
        void getJsonFinished(JsonObject resJson, APIStatus status);
    }
}
private static SSLContext getSSLContext(Context context){
    //Mostly taken from the Google code link in the question.
    try {
        CertificateFactory cf = CertificateFactory.getInstance("X.509");

        AssetManager am = context.getAssets();
        //THIS IS KEY: Your CA's cert stored in /assets/
        InputStream caInput = new BufferedInputStream(am.open("RootCA.crt"));
        Certificate ca;
        try {
            ca = cf.generateCertificate(caInput);
            //System.out.println("ca=" + ((X509Certificate) ca).getSubjectDN());
        } finally {
            caInput.close();
        }

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
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, tmf.getTrustManagers(), null);
        return sslContext;
    } catch (Exception e){
        return null;
    }

}

public enum APIStatus {
    OK("OK.", 200), //all went well
    JSON_ERROR("Error parsing response.", 1),
    NET_ERROR("Network error.", 2), //we couldn't reach the server
    UNKNOWN_ERROR("Unknown error.", 3), //some sh*t went down

    AUTH_ERROR("Authentication error.", 401), //credentials where wrong
    SERVER_ERROR("Internal server error.", 500), //server code crashed
    TIMEOUT("Operation timed out.", 408); //network too slow or server overloaded

    private String stringValue;
    private int intValue;

    private APIStatus(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}

private static APIStatus getStatusFromCode(int code) {

    if (code==200 || code==201) {
        return APIStatus.OK;
    }else if (code == 401) {
        return APIStatus.AUTH_ERROR;
    } else if (code == 500) {
        return APIStatus.SERVER_ERROR;
    } else if (code == 408) {
        return APIStatus.TIMEOUT;
    } else {
        return APIStatus.UNKNOWN_ERROR;
    }

}

private static class AsyncResponse {
    public APIStatus opStatus;
    public JsonObject jsonData;
}
(...)
