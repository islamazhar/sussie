package examples.AllCodeSnippets; 
public class class_699{ 
 public static void main() { 
public static String sStringToHMACMD5(String s, String keyString)
    {
        String sEncodedString = null;
        try
        {
            SecretKeySpec key = new SecretKeySpec((keyString).getBytes("UTF-8"), "HmacMD5");
            Mac mac = Mac.getInstance("HmacMD5");
            mac.init(key);

            byte[] bytes = mac.doFinal(s.getBytes("ASCII"));

            StringBuffer hash = new StringBuffer();

            for (int i=0; i<bytes.length; i++) {
                String hex = Integer.toHexString(0xFF &  bytes[i]);
                if (hex.length() == 1) {
                    hash.append('0');
                }
                hash.append(hex);
            }
            sEncodedString = hash.toString();
        }
        catch (UnsupportedEncodingException e) {}
        catch(InvalidKeyException e){}
        catch (NoSuchAlgorithmException e) {}
        return sEncodedString ;
    }
  }
}
