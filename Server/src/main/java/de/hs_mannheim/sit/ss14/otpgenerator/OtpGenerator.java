package de.hs_mannheim.sit.ss14.otpgenerator;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.apache.commons.codec.binary.Base64;

public class OtpGenerator implements OneTimePasswordGenerator {

	/**
	 * A Method to generate an random String
	 * @author marcelmath
	 * @lastUpdate philkwiotek
	 */
	@Override
	public String generateOneTimePassword() {
		SecureRandom random;
		try {
			random = SecureRandom.getInstance("SHA1PRNG");
			byte[] bOneTimePassword = new byte[1];
	        random.nextBytes(bOneTimePassword);

			return Base64.encodeBase64String(bOneTimePassword);
			//return new BigInteger(40, random).toString(32);

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
