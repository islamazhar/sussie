package examples.AES; 
public class class_1198 {

private static final String ME = Cryptos.class.getSimpleName();
private static String strEncoding = "UTF-8";
private static String STATIC_STRING_IV_16 = "1234567890123456";
private String iv;
private String key;
private IvParameterSpec mIvParameterSpec;
private SecretKeySpec mSecretKeySpec;
private Cipher mCipher;

public Cryptos(String key) {
    this(STATIC_STRING_IV_16,key);
}

public Cryptos(String iv, String key) {
    this.iv = cut(iv, 16);
    this.key = key;

    mIvParameterSpec = new IvParameterSpec(this.iv.getBytes());
    mSecretKeySpec = new SecretKeySpec(this.key.getBytes(), "AES");

    try {
        mCipher = Cipher.getInstance("AES/CBC/NoPadding");
    } catch (NoSuchAlgorithmException e) {
        App.log.e(ME, "Got Exception while initializing mCipher: " + e.toString(), e);
    } catch (NoSuchPaddingException e) {
        App.log.e(ME, "Got Exception while initializing mCipher: " + e.toString(), e);
    }
}


public byte[] decryptHex(String hexString) throws Exception {
    if(hexString == null || hexString.length() == 0) {
        throw new Exception("Emtpy string given");
    }
    return byteTrim(decrypt(hexToBytes(hexString)));
}

public byte[] decrypt(byte[] input){
    try {
        mCipher.init(Cipher.DECRYPT_MODE, mSecretKeySpec, mIvParameterSpec);
        byte[] decrypted = new byte[mCipher.getOutputSize(input.length)];
        int dec_len = mCipher.update(input, 0, input.length, decrypted, 0);
        dec_len += mCipher.doFinal(decrypted, dec_len);
        return ARRAY.copyOf(decrypted, dec_len);
    } catch (ShortBufferException e) {
        e.printStackTrace();
    } catch (IllegalBlockSizeException e) {
        e.printStackTrace();
    } catch (BadPaddingException e) {
        e.printStackTrace();
    } catch (InvalidKeyException e) {
        e.printStackTrace();
    } catch (InvalidAlgorithmParameterException e) {
        e.printStackTrace();
    }
    return null;
}



public byte[] encrypt(String text) throws Exception{
    if(text == null || text.length() == 0) throw new Exception("Empty string");
    return encrypt(text.getBytes(strEncoding));
}

public byte[] encrypt(byte[] data){
    if(data==null) return null;

    try {
        int bts = data.length;
        byte[] alignData = ARRAY.copyOf(data, bts+(16-bts%16));
        data = alignData;
        mCipher.init(Cipher.ENCRYPT_MODE, mSecretKeySpec, mIvParameterSpec);
        byte[] encrypted = new byte[mCipher.getOutputSize(data.length)];
        int enc_len = mCipher.update(data, 0, data.length, encrypted, 0);
        enc_len += mCipher.doFinal(encrypted, enc_len);
        return ARRAY.copyOf(encrypted, enc_len);
    } catch (ShortBufferException e) {
        e.printStackTrace();
    } catch (IllegalBlockSizeException e) {
        e.printStackTrace();
    } catch (BadPaddingException e) {
        e.printStackTrace();
    } catch (InvalidKeyException e) {
        e.printStackTrace();
    } catch (InvalidAlgorithmParameterException e) {
        e.printStackTrace();
    }
    return null;
}

public static String bytesToHex(byte[] b){
    StringBuffer buf = new StringBuffer();
    int len = b.length;
    for (int j=0; j<len; j++)
        buf.append(byteToHex(b[j]));
    return buf.toString();
}

public static String byteToHex(byte b){
    char hexDigit[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    char[] a = { hexDigit[(b >> 4) & 0x0f], hexDigit[b & 0x0f] };
    return new String(a);
}

public static byte[] hexToBytes(String str) {
    if (str==null) {
        return null;
    } else if (str.length() < 2) {
        return null;
    } else {
        int len = str.length() / 2;
        byte[] buffer = new byte[len];
        for (int i=0; i<len; i++) {
            buffer[i] = (byte) Integer.parseInt(str.substring(i*2,i*2+2),16);
        }
        return buffer;
    }
}


private byte[] byteTrim(byte[] bytes){
    if( bytes.length > 0){
        int trim = 0;
        for( int i = bytes.length - 1; i >= 0; i-- ){
            if( bytes[i] == 0 ){
                trim++;
            }else{
                break;
            }
        }
        if( trim > 0 ){
            byte[] newArray = new byte[bytes.length - trim];
            System.arraycopy(bytes, 0, newArray, 0, bytes.length - trim);
            return newArray;
        }
    }
    return bytes;
}

private String cut(String s, int n) {
    byte[] sBytes = s.getBytes();
    if(sBytes.length < n) {
        n = sBytes.length;
    }
    boolean extraLong = false;
    int i = 0, n16 = 0;
    while(i < n) {
        n16 += (extraLong) ? 2 : 1;
        extraLong = false;
        if((sBytes[i] & 0x80) == 0) {
            i += 1;
        } else if((sBytes[i] & 0xC0) == 0x80) {
            i += 2;
        } else if((sBytes[i] & 0xE0) == 0xC0) {
            i += 3;
        } else {
            i += 4;
            extraLong = true;
        }
    }
    return s.substring(0, n16);
}

public static String encBase64(byte[] bytes){
    return Base64.encodeToString(bytes, Base64.DEFAULT);
}

public static byte[] decBase64(String data){
    return Base64.decode(data, Base64.DEFAULT);
}   
}
