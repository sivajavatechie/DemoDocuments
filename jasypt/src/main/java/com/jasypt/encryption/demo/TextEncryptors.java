package com.jasypt.encryption.demo;

import org.jasypt.util.text.AES256TextEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.jasypt.util.text.StrongTextEncryptor;

public class TextEncryptors {

	public static void main(String[] args) {
		
		StrongTextEncryptor aes256TextEncryptor = new StrongTextEncryptor();
		String secretKey = "AWs$1@234Swa";
		
		aes256TextEncryptor.setPassword(secretKey);
		String message = "This is important message";
		
		String encryptedMessage = aes256TextEncryptor.encrypt(message);
		System.out.println(encryptedMessage);
		
		String plainText = aes256TextEncryptor.decrypt(encryptedMessage);
		System.out.println(plainText);
		

	}

}
