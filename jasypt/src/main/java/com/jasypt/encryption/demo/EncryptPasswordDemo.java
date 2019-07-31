package com.jasypt.encryption.demo;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.jasypt.util.password.rfc2307.RFC2307MD5PasswordEncryptor;
import org.jasypt.util.password.rfc2307.RFC2307SHAPasswordEncryptor;
import org.jasypt.util.password.rfc2307.RFC2307SMD5PasswordEncryptor;
import org.jasypt.util.password.rfc2307.RFC2307SSHAPasswordEncryptor;

public class EncryptPasswordDemo {

	public static void main(String[] args) {
		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
		String password = "Hello@3E";		
		String encryptedPassword = encryptor.encryptPassword(password);
		System.out.println(encryptedPassword);		
		boolean status = encryptor.checkPassword(password, encryptedPassword);
		System.out.println(status);

	}

}
