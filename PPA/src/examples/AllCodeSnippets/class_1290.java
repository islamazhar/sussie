package examples.AllCodeSnippets; 
public class class_1290{ 
 public static void main() { 
zerorize(SecretKey key)
{
    byte[] rawKey = key.getEncoded();
    Arrays.fill(rawKey, (byte) 0xFF);
    Arrays.fill(rawKey, (byte) 0xAA);
    Arrays.fill(rawKey, (byte) 0x55);
    Arrays.fill(rawKey, (byte) 0x00);
}
  }
}
