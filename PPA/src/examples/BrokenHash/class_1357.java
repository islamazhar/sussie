package examples.X509TrustManager; 
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.AsyncTask;
import android.util.Log;
import android.view.Gravity;
import android.widget.TextView;
public class class_1357
    {
            public static void createDir(String path,String dirName)
            {
                  String newFolder = "/"+dirName;
                  File myNewFolder = new File(path + newFolder);
                  myNewFolder.mkdir();
            }

            public void downloadEventData(Context context,String zipFile,String unzipLocation,String url) throws IOException
            {
                try {
                        new DownloadMapAsync(context,zipFile,unzipLocation).execute(url);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
                private class DownloadMapAsync extends AsyncTask<String, String, String> {
                    String result =";
                    Context context;
                    String zipFile;
                    String unzipLocation;
                    private ProgressDialog progressDialog;
                    String string;
                    public DownloadMapAsync(Context context,String zipFile,String unzipLocation) {
                        // TODO Auto-generated constructor stub
                        this.context=context;
                        this.zipFile=zipFile;
                        this.unzipLocation=unzipLocation;
                    }
                    
                    protected void onPreExecute() {
                        super.onPreExecute();
                        progressDialog = new ProgressDialog(context);
                        progressDialog.setMessage("Downloading Zip File..");
                        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                        progressDialog.setCancelable(false);
                        progressDialog.show();
                    }

                    
                    protected String doInBackground(String... aurl) {
                        int count;
                        HttpURLConnection http = null;
                    try {
                        URL url = new URL(aurl[0]);
                        if (url.getProtocol().toLowerCase().equals("https")) {
                            trustAllHosts();
                            HttpsURLConnection https = (HttpsURLConnection) url.openConnection();
                            https.setHostnameVerifier(DO_NOT_VERIFY);
                            http = https;
                        } else {
                            http = (HttpURLConnection) url.openConnection();
                        }
                    http.connect();
                    if (http.getResponseCode()==200)
                    {
                        int lenghtOfFile = http.getContentLength();
                        InputStream input = new BufferedInputStream(url.openStream());

                        OutputStream output = new FileOutputStream(zipFile);

                        byte data[] = new byte[1024];
                        long total = 0;

                            while ((count = input.read(data)) != -1) {
                                total += count;
                                publishProgress("+(int)((total*100)/lenghtOfFile));
                                output.write(data, 0, count);
                            }
                            output.close();
                            input.close();
                            result = "true";
                    } 
                    else if (http.getResponseCode()==401)
                    {
                        result = "false";
                        string= "Download Limit exceed.";   
                    }  
                    else 
                    {
                        result = "false";
                        string=http.getResponseMessage();
                    }

                    } catch (Exception e) {
                        e.printStackTrace();
                        result = "false";
                        try {
                            if (http.getResponseCode()==401)
                            {
                                string= "Download Failed";  
                            } else {
                                string=e.toString();
                            }

                        } catch (IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    }
                    return result;

                    }
                    protected void onProgressUpdate(String... progress) {
                         Log.d("ANDRO_ASYNC",progress[0]);
                         progressDialog.setProgress(Integer.parseInt(progress[0]));
                    }

                    
                    protected void onPostExecute(String unused) {
                        progressDialog.dismiss();
                        if(result.equalsIgnoreCase("true"))
                        {
                        try {
                            unzip(context,zipFile,unzipLocation);
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        }
                        else
                        {
                            customAlert(context, string);
                        }
                    }
                }
                @SuppressLint("NewApi")
                public void customAlert(Context context,String msgString)
                {
                    AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(context,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
                    TextView title = new TextView(context);
                    title.setText("Message");
                    title.setPadding(10, 10, 10, 10);
                    title.setGravity(Gravity.CENTER);
                    title.setTextColor(Color.BLACK);
                    title.setTextSize(20);
                    alertDialog2.setCustomTitle(title);
                    TextView msg = new TextView(context);
                    msg.setText(msgString);
                    msg.setPadding(10, 10, 10, 10);
                    msg.setGravity(Gravity.CENTER);
                    msg.setTextSize(18);
                    msg.setTextColor(Color.BLACK);
                    alertDialog2.setView(msg);
                    alertDialog2.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                    alertDialog2.show();
                }
                  public void unzip(Context context,String zipFile,String unzipLocation) throws IOException 
                  {
                        new UnZipTask(context,zipFile).execute(unzipLocation);
                  }

                private class UnZipTask extends AsyncTask<String, Void, Boolean> {
                    Context context;
                    String zipFile;
                    ProgressDialog progressDialog;

                 public UnZipTask(Context context,String zipFile) {
                    // TODO Auto-generated constructor stub
                     this.context=context;
                     this.zipFile=zipFile;
                    }
                  
                    protected void onPreExecute() {
                        super.onPreExecute();
                        progressDialog = new ProgressDialog(context);
                        progressDialog.setMessage("Please Wait...Extracting zip file ... ");
                        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                        progressDialog.setCancelable(false);
                        progressDialog.show();

                    }
                  protected Boolean doInBackground(String... params) 
                  {
                      String filePath = zipFile;
                      String destinationPath = params[0];

                      File archive = new File(filePath);
                      try {


                         ZipFile zipfile = new ZipFile(archive);
                          for (@SuppressWarnings("rawtypes")
                        Enumeration e = zipfile.entries(); e.hasMoreElements();) {
                              ZipEntry entry = (ZipEntry) e.nextElement();
                              unzipEntry(zipfile, entry, destinationPath);
                          }


                            UnzipUtil d = new UnzipUtil(zipFile,params[0]); 
                            d.unzip();

                      } catch (Exception e) {
                          e.printStackTrace();
                          return false;
                      }

                      return true;
                  }

                  
                  protected void onPostExecute(Boolean result)
                  {
                      progressDialog.dismiss();
                      File file=new File(zipFile);
                      file.delete();
                      customAlert(context,"Unzipping completed");
                  }

                  private void unzipEntry(ZipFile zipfile, ZipEntry entry,String outputDir) throws IOException 
                    {

                      if (entry.isDirectory()) {
                          createDir(new File(outputDir, entry.getName()));
                          return;
                      }

                      File outputFile = new File(outputDir, entry.getName());
                      if (!outputFile.getParentFile().exists()) {
                          createDir(outputFile.getParentFile());
                      }

                      BufferedInputStream inputStream = new BufferedInputStream(zipfile.getInputStream(entry));
                      BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile));

                      try {

                      } finally {
                        outputStream.flush();
                        outputStream.close();
                        inputStream.close();


                      }
                  }

                  public void createDir(File dir)
                  {
                      if (dir.exists()) {
                          return;
                      }
                      if (!dir.mkdirs()) {
                          throw new RuntimeException("Can not create dir " + dir);
                      }
                  }

                  }

                 final static HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier()
                 {
                        public boolean verify(String hostname, SSLSession session) {
                            return true;
                        }
                };
                private static void trustAllHosts() {
                    // Create a trust manager that does not validate certificate chains
                    TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[] {};
                        }

                        public void checkClientTrusted(X509Certificate[] chain,
                                String authType) throws CertificateException {
                        }

                        public void checkServerTrusted(X509Certificate[] chain,
                                String authType) throws CertificateException {
                        }
                    } };

                    // Install the all-trusting trust manager
                    try {
                        SSLContext sc = SSLContext.getInstance("TLS");
                        sc.init(null, trustAllCerts, new java.security.SecureRandom());
                        HttpsURLConnection
                                .setDefaultSSLSocketFactory(sc.getSocketFactory());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }   
}
