package tutorial;

import tutorial.security.Signature;


import java.security.*;

public class HJSignatureHelper {
	public static Signature getSig() throws Exception {
		Signature siggy= Signature.getInstance("SHA1withRSA");
		// System.out.println(siggy.getClass());
		return siggy;
	}


	public static byte[] bytes() throws Exception {
		byte[] data = "abcdefghijklmnopqrstuvxyz".getBytes("UTF-8");
		return data;
	}


}