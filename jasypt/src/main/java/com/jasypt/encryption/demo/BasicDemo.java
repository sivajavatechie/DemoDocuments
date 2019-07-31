package com.jasypt.encryption.demo;

import org.jasypt.util.text.BasicTextEncryptor;

public class BasicDemo {

	public static void main(String[] args) {
	
		String serectKey = "@#$SD43%~EB&35$";
		String message = "This is sceret message .. be careful";
		
		BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
		basicTextEncryptor.setPassword(serectKey);
		String encryptedMessage = basicTextEncryptor.encrypt(message);
		
		System.out.println(basicTextEncryptor.decrypt(encryptedMessage));
		

	}

}
