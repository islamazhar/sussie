package examples.AllCodeSnippets; 
public class class_505{ 
 public static void main() { 
    private Bitmap getBitmap(String url)
            {
     File f=fileCache.getFile(url);
     //from SD cache
    Bitmap b = decodeFile(f);
    if(b!=null)
        return b;

    //from web
    try {
        Bitmap bitmap=null;
      //  URL imageUrl = new URL(url);

        /***/

        HttpURLConnection conn = null;
        URL imageUrl = new URL(url);
        if (imageUrl.getProtocol().toLowerCase().equals("https")) {
            trustAllHosts();
            HttpsURLConnection https = (HttpsURLConnection) imageUrl.openConnection();
            https.setHostnameVerifier(DO_NOT_VERIFY);
            conn = https;
        } else {
            conn = (HttpURLConnection) imageUrl.openConnection();
        }
        /***/



       // HttpURLConnection conn = (HttpURLConnection)imageUrl.openConnection();
        conn.setConnectTimeout(30000);
        conn.setReadTimeout(30000);
        conn.setInstanceFollowRedirects(true);
        InputStream is=conn.getInputStream();
        OutputStream os = new FileOutputStream(f);
        Utils.CopyStream(is, os);
        os.close();
        bitmap = decodeFile(f);
        return bitmap;
    } catch (Throwable ex){
       ex.printStackTrace();
       if(ex instanceof OutOfMemoryError)
           memoryCache.clear();
       return null;
    }
}
  }
}
