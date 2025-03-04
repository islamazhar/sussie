package examples.AllCodeSnippets; 
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Log;

public class class_221 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            PackageManager pm = this.getPackageManager();
            String packageName = this.getPackageName();
            int flags = PackageManager.GET_SIGNATURES;

            PackageInfo packageInfo = null;

            try {
                    packageInfo = pm.getPackageInfo(packageName, flags);
            } catch (NameNotFoundException e) {
                    e.printStackTrace();
            }
            Signature[] signatures = packageInfo.signatures;

            byte[] cert = signatures[0].toByteArray();

            InputStream input = new ByteArrayInputStream(cert);

            CertificateFactory cf = null;
            try {
                    cf = CertificateFactory.getInstance("X509");


            } catch (CertificateException e) {
                    e.printStackTrace();
            }
            X509Certificate c = null;
            try {
                    c = (X509Certificate) cf.generateCertificate(input);
            } catch (CertificateException e) {
                    e.printStackTrace();
            }


            try {
                MessageDigest md = MessageDigest.getInstance("SHA1");
                byte[] publicKey = md.digest(c.getPublicKey().getEncoded());


                StringBuffer hexString = new StringBuffer();
                for (int i=0;i<publicKey.length;i++) {
                    String appendString = Integer.toHexString(0xFF & publicKey[i]);
                    if(appendString.length()==1)hexString.append("0");
                    hexString.append(appendString);
                    }


                Log.d("Example", "Cer: "+ hexString.toString());

            } catch (NoSuchAlgorithmException e1) {
                e1.printStackTrace();
            } 

    }
}
