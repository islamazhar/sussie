package examples.AllCodeSnippets; 
public class class_267{ 
 public static void main() { 
public static String decrypt(byte[] keyValue, String ivValue, String encryptedData, String macValue) throws Exception {
    Key key = new SecretKeySpec(keyValue, "AES");
    byte[] iv = Base64.decode(ivValue.getBytes("UTF-8"), Base64.DEFAULT);
    byte[] decodedValue = Base64.decode(encryptedData.getBytes("UTF-8"), Base64.DEFAULT);

    SecretKeySpec macKey = new SecretKeySpec(keyValue, "HmacSHA256");
    Mac hmacSha256 = Mac.getInstance("HmacSHA256");
    hmacSha256.init(macKey);
    hmacSha256.update(ivValue.getBytes("UTF-8"));
    byte[] calcMac = hmacSha256.doFinal(encryptedData.getBytes("UTF-8"));
    byte[] mac = Hex.decodeHex(macValue.toCharArray());
    if (!Arrays.equals(calcMac, mac)) // TODO: use time-constant compare
        return null; // or throw exception

    Cipher c = Cipher.getInstance("AES/CBC/PKCS7Padding"); // or PKCS5Padding
    c.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));
    byte[] decValue = c.doFinal(decodedValue);

    int firstQuoteIndex = 0;
    while(decValue[firstQuoteIndex] != (byte)'"') firstQuoteIndex++;
    return new String(Arrays.copyOfRange(decValue, firstQuoteIndex + 1, decValue.length-2));
}
  }
}
