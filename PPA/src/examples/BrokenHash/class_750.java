package examples.BrokenHash; 
public class class_750 { 
public static String getMd5Hash(String input) {
    try {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageDigest = md.digest(input.getBytes());
        BigInteger number = new BigInteger(1, messageDigest);
        String md5 = number.toString(16);
        while (md5.length() < 32)
           md5 = "0" + md5;
        return md5;
        } catch (NoSuchAlgorithmException e) {
         Log.e("MD5", e.getLocalizedMessage());
      return null;
    }
    }

}