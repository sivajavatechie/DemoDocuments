package com.jasypt.encryption.demo;

import java.math.BigDecimal;

import org.jasypt.util.numeric.AES256DecimalNumberEncryptor;
import org.jasypt.util.numeric.BasicDecimalNumberEncryptor;
import org.jasypt.util.numeric.StrongDecimalNumberEncryptor;

public class DecimalEncryptors {

	public static void main(String[] args) {
		StrongDecimalNumberEncryptor aes256DecimalNumberEncryptor = new StrongDecimalNumberEncryptor();
		String secretKey = "AWs$1@234Swa";
		aes256DecimalNumberEncryptor.setPassword(secretKey);
		
		BigDecimal encryptedDecimal = aes256DecimalNumberEncryptor.encrypt(new BigDecimal(12345.45));
		System.out.println(encryptedDecimal);
		BigDecimal decryptedDecimal = aes256DecimalNumberEncryptor.decrypt(encryptedDecimal);
		System.out.println(decryptedDecimal);

	}

}
