package examples.AllCodeSnippets; 
public class class_1053{ 
 public static void main() { 
try {
        PackageInfo info = getPackageManager().getPackageInfo(
                "YOUR PACKAGE NAME HERE", 
                PackageManager.GET_SIGNATURES);
        for (Signature signature : info.signatures) {
            MessageDigest md = MessageDigest.getInstance("SHA");
            md.update(signature.toByteArray());
            Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
    } catch (NameNotFoundException e) {

    } catch (NoSuchAlgorithmException e) {

    }
  }
}
