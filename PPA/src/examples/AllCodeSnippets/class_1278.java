package examples.AllCodeSnippets; 
public class class_1278{ 
 public static void main() { 
public byte[] passwordToHash(String password) {
    if (password == null) {
        return null;
    }
    String algo = null;
    byte[] hashed = null;
    try {
        byte[] saltedPassword = (password + getSalt()).getBytes();
        byte[] sha1 = MessageDigest.getInstance(algo = "SHA-1").digest(saltedPassword);
        byte[] md5 = MessageDigest.getInstance(algo = "MD5").digest(saltedPassword);
        hashed = (toHex(sha1) + toHex(md5)).getBytes();
    } catch (NoSuchAlgorithmException e) {
        Log.w(TAG, "Failed to encode string because of missing algorithm: " + algo);
    }
    return hashed;
}
  }
}
