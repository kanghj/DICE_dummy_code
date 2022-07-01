package tutorial;

import java.security.Signature;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

public class SignatureHelper {
	public static Signature getSig() throws Exception {
		Signature siggy= Signature.getInstance("SHA1withRSA");
		// System.out.println(siggy.getClass());
		return siggy;
	}

    public static void initVerify(Signature sig) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
		                
        sig.initVerify(keyPair.getPublic());
    }

    public static void update(Signature sig) throws Exception {
        byte byte0 = (byte)4;

        sig.update(byte0);
    }


	public static KeyFactory getKeyFactory() throws Exception  {
		return KeyFactory.getInstance("RSA");
	}

	public static PrivateKey getPrivate(String filename) throws Exception {
		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec("asdasd".getBytes());
		KeyFactory kf = KeyFactory.getInstance("RSA");
		return kf.generatePrivate(spec);
	}

	public static KeyPair getKeyPair() throws Exception {
		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
KeyPair keyPair = keyPairGenerator.generateKeyPair();
		return keyPair;
	}

	public static byte[] bytes() throws Exception {
		byte[] data = "abcdefghijklmnopqrstuvxyz".getBytes("UTF-8");
		return data;
	}


}
