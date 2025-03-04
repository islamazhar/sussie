package examples.AllCodeSnippets; 
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class class_758 {

Cipher ecipher;
Cipher dcipher;

StringEncrypter(String password) {

    // 8-bytes Salt
    byte[] salt = {
        (byte)0xA9, (byte)0x9B, (byte)0xC8, (byte)0x32,
        (byte)0x56, (byte)0x34, (byte)0xE3, (byte)0x03
    };

    // Iteration count
    int iterationCount = 19;

    try {

        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, iterationCount);
        SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);

        ecipher = Cipher.getInstance(key.getAlgorithm());
        dcipher = Cipher.getInstance(key.getAlgorithm());

        // Prepare the parameters to the cipthers
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt, iterationCount);

        ecipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);
        dcipher.init(Cipher.DECRYPT_MODE, key, paramSpec);

    } catch (InvalidAlgorithmParameterException e) {
        System.out.println("EXCEPTION: InvalidAlgorithmParameterException");
    } catch (InvalidKeySpecException e) {
        System.out.println("EXCEPTION: InvalidKeySpecException");
    } catch (NoSuchPaddingException e) {
        System.out.println("EXCEPTION: NoSuchPaddingException");
    } catch (NoSuchAlgorithmException e) {
        System.out.println("EXCEPTION: NoSuchAlgorithmException");
    } catch (InvalidKeyException e) {
        System.out.println("EXCEPTION: InvalidKeyException");
    }
}


/**
 * Takes a single String as an argument and returns an Encrypted version
 * of that String.
 * @param str String to be encrypted
 * @return <code>String</code> Encrypted version of the provided String
 */
public byte[] encrypt(String str) {
    try {
        // Encode the string into bytes using utf-8
        byte[] utf8 = str.getBytes("UTF8");

        // Encrypt
        byte[] enc = ecipher.doFinal(utf8);

        // Encode bytes to base64 to get a string
        //return new sun.misc.BASE64Encoder().encode(enc);
        return enc;

    } catch (BadPaddingException e) {
    } catch (IllegalBlockSizeException e) {
    } catch (UnsupportedEncodingException e) {
    }
    return null;
}


/**
 * Takes a encrypted String as an argument, decrypts and returns the
 * decrypted String.
 * @param str Encrypted String to be decrypted
 * @return <code>String</code> Decrypted version of the provided String
 */
public String decrypt(byte[] dec) {

    try {

        // Decode base64 to get bytes
        //byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);
        //byte[] dec = Base64Coder.decode(str);

        // Decrypt
        byte[] utf8 = dcipher.doFinal(dec);

        // Decode using utf-8
        return new String(utf8, "UTF8");

    } catch (BadPaddingException e) {
    } catch (IllegalBlockSizeException e) {
    } catch (UnsupportedEncodingException e) {
    }
    return null;
}
