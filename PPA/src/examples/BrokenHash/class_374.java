package examples.BrokenHash; 
public class class_374 { 
import sun.misc.BASE64Encoder;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

String policy = (new BASE64Encoder()).encode(
    policy_document.getBytes("UTF-8")).replaceAll("\n",").replaceAll("\r",");

Mac hmac = Mac.getInstance("HmacSHA1");
hmac.init(new SecretKeySpec(
    aws_secret_key.getBytes("UTF-8"), "HmacSHA1"));
String signature = (new BASE64Encoder()).encode(
    hmac.doFinal(policy.getBytes("UTF-8")))
    .replaceAll("\n", ");

}