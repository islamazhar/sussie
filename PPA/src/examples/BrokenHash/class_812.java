package examples.BrokenHash; 
public class class_812 { 
public static String md5(String s) 
{
    MessageDigest digest;
    try
    {
        digest = MessageDigest.getInstance("MD5");
        digest.update(s.getBytes(Charset.forName("US-ASCII")),0,s.length());
        byte[] magnitude = digest.digest();
        BigInteger bi = new BigInteger(1, magnitude);
        String hash = String.format("%0" + (magnitude.length << 1) + "x", bi);
        return hash;
    }
    catch (NoSuchAlgorithmException e)
    {
        e.printStackTrace();
    }
    return ";
}

}