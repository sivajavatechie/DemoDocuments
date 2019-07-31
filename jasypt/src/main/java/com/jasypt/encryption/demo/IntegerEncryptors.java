package com.jasypt.encryption.demo;

import java.math.BigInteger;

import org.jasypt.util.numeric.AES256IntegerNumberEncryptor;
import org.jasypt.util.numeric.BasicIntegerNumberEncryptor;
import org.jasypt.util.numeric.StrongIntegerNumberEncryptor;

public class IntegerEncryptors {

	public static void main(String[] args) {
	
		StrongIntegerNumberEncryptor aes256IntegerNumberEncryptor = new StrongIntegerNumberEncryptor();
		String secretKey = "AWs$1@234Swa";
		aes256IntegerNumberEncryptor.setPassword(secretKey);
		 BigInteger encryptedNumber = aes256IntegerNumberEncryptor.encrypt(new BigInteger("1234567"));
		 System.out.println(encryptedNumber);
		 BigInteger decryptedNumber=  aes256IntegerNumberEncryptor.decrypt(encryptedNumber);
		 System.out.println(decryptedNumber);
	}

}
