package examples.BrokenHash; 
public class class_822 { 
public static String getMD5(String input) {

 byte[] source;
 try {
     source = input.getBytes("UTF-8");
 } catch (UnsupportedEncodingException e) {
     System.out.println("Error!");
 }

 String result = null;
 char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7',
         '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
 try {
     MessageDigest md = MessageDigest.getInstance("MD5");
     md.update(source);
     byte temp[] = md.digest();
     char str[] = new char[16 * 2];
     int k = 0;
     for (int i = 0; i < 16; i++) {
         byte byte0 = temp[i];
         str[k++] = hexDigits[byte0 >>> 4 & 0xf];
         str[k++] = hexDigits[byte0 & 0xf];
     }
     result = new String(str);
 } catch (Exception e) {
 System.out.println("Error!");
}
return result;
}

}