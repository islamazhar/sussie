package examples.AllCodeSnippets; 
public class class_581{ 
 public static void main() { 
 /**
 * Generates a PublicKey instance from a string containing the
 * Base64-encoded public key.
 *
 * @param encodedPublicKey Base64-encoded public key
 * @throws IllegalArgumentException if encodedPublicKey is invalid
 */
public static PublicKey generatePublicKey(String encodedPublicKey) {
    try {
        String str = new String(Base64.decode(encodedPublicKey));
        byte[] decodedKey = Base64.decode(str);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_FACTORY_ALGORITHM);
        return keyFactory.generatePublic(new X509EncodedKeySpec(decodedKey));
    } catch (NoSuchAlgorithmException e) {
        throw new RuntimeException(e);
    } catch (InvalidKeySpecException e) {
        e.printStackTrace();
        Log.e(TAG, "Invalid key specification.");
        throw new IllegalArgumentException(e);
    } catch (Base64DecoderException e) {
        Log.e(TAG, "Base64 decoding failed.");
        throw new IllegalArgumentException(e);
    }
}
  }
}
