package com.sivajavatechie.datastructure;
public class StringReverseLogics {

	public static void main(String[] args) {
		
		String str = "This String Needs to be reversed";
		System.out.println("String reverse using recuresion : " + reverseStringUsingRecursion(str));
		System.out.println("String reverse without using Recursion : " +  reverseString(str));
		System.out.println("String reverse using Java Utils :" +  reverseStringUsingJavaUtils(str));		
		
	}
	
	// first char --> last --> called recursive
	public static String reverseStringUsingRecursion(String input) {
		if (input.isEmpty()) {
			return "";
		} else {
			return reverseStringUsingRecursion(input.substring(1)) + input.charAt(0);
		}
		//ABC --> BC,A, --C BA, CBA
		
	}
	
	//
	public static String reverseString(String input) {
		String reverse = "";		
		for (int i = input.length()-1; i>=0; i--) {
			reverse = reverse + input.charAt(i);
		}
		return reverse;
	}
	
	
	public static String reverseStringUsingJavaUtils(String input) {
		StringBuffer stringBuffer = new StringBuffer(input);
		return stringBuffer.reverse().toString();
	}
}
