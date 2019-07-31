package com.jasypt.encryption.demo;

import org.jasypt.util.binary.AES256BinaryEncryptor;
import org.jasypt.util.binary.BasicBinaryEncryptor;
import org.jasypt.util.binary.StrongBinaryEncryptor;

public class BinaryEncryptors {

	public static void main(String[] args) {
		StrongBinaryEncryptor aes256BinaryEncryptor = new StrongBinaryEncryptor();
		String secretKey = "AWs$1@234Swa";
		aes256BinaryEncryptor.setPassword(secretKey);
		String message = "This is important message. please be careful";
		byte[] inputs = message.getBytes();
		
		byte[] encryptedBinary = aes256BinaryEncryptor.encrypt(inputs);
		for (byte b : encryptedBinary) {
			System.out.print((char)b);
		}
		 
		byte[] decryptedBinary = aes256BinaryEncryptor.decrypt(encryptedBinary);
		System.out.println("decrypted message :");
		for (byte b : decryptedBinary) {
			System.out.print((char)b);
		}
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.............>>>>>>>>>>>>>>.");
		
	}

}
