

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringInterviewPrograms {

	public static void main(String[] args) {
		sumOfDigitsInGivenString();
		sumOfNumbersInGivenString();
		wordCountInFile();
		stringReverse();
		printPalindromesInGivenString();
		countPalindromesOccurencesInGivenFile();
		convertDataTypeValueIntoString();
		convertStringIntoDatatype();
		findOccurrenceOfGivenCharacterInString();
		printSubStringsFromGivenInput();
		
	}	

	/**
	 * This method print the sum of digits in the given string
	 * E.g : "123dsafdaf34" --> 1+2+3+3+4 = 13
	 */
	public static void sumOfDigitsInGivenString() {
		String str = "12dfs345234dfc";// 1+2+3+4+5+2+3+4 = 24
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum = sum + Integer.parseInt(str.charAt(i) + "");
			}
		}
		System.out.println("sum of digits in given string " + sum);
	}

	/**
	 * This method print the sum of numbers in the given string
	 * E.g : "123dsafdaf34" --> 123+34 , "12ds45afdaf34d71" --> 12+45+34+71, 123.4 --> 123+4
	 * 
	 */
	public static void sumOfNumbersInGivenString() {
		String str = "123fdr342"; // 123+342
		int count = 0;
		boolean isDigit = false;
		int sum = 0;
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
				isDigit = true;
			} else {
				if (isDigit) {
					sum = sum + Integer.parseInt(str.substring(i - count, i));
					isDigit = false;
					count = 0;
				}
			}
		}
		if (count > 0 && isDigit) {
			sum = sum + Integer.parseInt(str.substring(length - count, length));
		}

		System.out.println("Sum of numbers in the given string: " + sum);
	}

	/**
	 * This method print total number of words given in the text file
	 *  
	 */
	public static void wordCountInFile() {

		Map<String, Integer> wordCountMap = new HashMap<>();

		try (FileReader fr = new FileReader("test.txt");
				BufferedReader bufferedReader = new BufferedReader(fr)) {

			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				String words[] = str.split(" ");

				for (String word : words) {

					if (wordCountMap.get(word) == null) {
						wordCountMap.put(word, 1);
					} else {
						wordCountMap.put(word, wordCountMap.get(word) + 1);
					}
				}
			}

			System.out.println("Word count from the given file is " + wordCountMap);
		} catch (IOException exception) {

		}
	}

	
	/**
	 * This method print the reverse of the given string
	 */
	public static void stringReverse() {
		// approch 1 : Using charAt()
		String str = "This is demo for string reverse";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("After String Reverse >>>>" + reverse);

		// approch 2 : Using StringBuffer()
		StringBuffer stringBuffer = new StringBuffer(str);
		System.out.println("Using StringBuffer Class >>>>"
				+ stringBuffer.reverse().toString());
	}
	
	/**
	 * This method print the palindrome from the given string
	 */
	public static void printPalindromesInGivenString() {
		String str = "abc add test abc hello dddd ede ksk tst";
		// covert given string into words by using split method

		String[] words = str.split(" ");

		System.out.println("Pallendroms in the given string are :");
		for (String word : words) {
			// reverse the each word using the StringBuffer()
			String reverse = new StringBuffer(word).reverse().toString();
			if (reverse.equals(word)) { // word is equal to reverse then it is
										// palindrome
				System.out.println(word);
			}

		}

	}
	
	/**
	 * This method print each palindrome occurrence count from the given file
	 */
	public static void countPalindromesOccurencesInGivenFile() {
		Map<String, Integer> palindromesOccurencesCount = new HashMap<>();		
		try (FileReader fr = new FileReader("test.txt"); BufferedReader br = new BufferedReader(fr)){
			String str = null;
			while((str = br.readLine())!=null) {
				String[] words = str.split(" ");
				for (String word : words) {
					String reverse = new StringBuffer(word).reverse().toString();
					if (word.equals(reverse)) {
						if (palindromesOccurencesCount.get(word) == null) {
							palindromesOccurencesCount.put(word, 1);
						} else {
							palindromesOccurencesCount.put(word, palindromesOccurencesCount.get(word)+1);
						}
					}
				}
			}
			System.out.println("Pallendrome occurences in the Map is :" + palindromesOccurencesCount);		
			
		} catch(IOException exception) {
			System.out.println("Exception occured while reading text from file");
		}
	}
	
	/**
	 * this method converts data type value into string representation
	 */
	public static void convertDataTypeValueIntoString() {
		
		String charValue = String.valueOf('C');
		String booleanValue = String.valueOf(false);
		String byteValue  =String.valueOf(123);
		String shortValue = String.valueOf(121);
		String intValue = String.valueOf(12345);
		String longValue = String.valueOf(1234567);
		String floatValue = String.valueOf(123.0);
		String doubleValue = String.valueOf(123435.45);
		System.out.println("After Converting data type into String representation");
		System.out.println("Char Value " + charValue);
		System.out.println("boolean Value " + booleanValue);
		System.out.println("Byte Value " + byteValue);
		System.out.println("Short Value " + shortValue);
		System.out.println("Integer Value " + intValue);
		System.out.println("Long Value " + longValue);
		System.out.println("Float Value " + floatValue);
		System.out.println("Double Value " + doubleValue);
	}
	
		
	/**this method converts string value into corresponding data type
	 * 
	 */
	public static void convertStringIntoDatatype() {
		char charValue = Character.valueOf('C');
		boolean booleanValue = Boolean.parseBoolean("false");
		byte byteValue  = Byte.parseByte("11");
		short shortValue = Short.parseShort("121");
		int intValue = Integer.parseInt("12345");
		long longValue = Long.parseLong("1234567");
		float floatValue = Float.parseFloat("123.0");
		double doubleValue = Double.parseDouble("123435.45");

		
		System.out.println("Char Value " + charValue);
		System.out.println("boolean Value " + booleanValue);
		System.out.println("Byte Value " + byteValue);
		System.out.println("Short Value " + shortValue);
		System.out.println("Integer Value " + intValue);
		System.out.println("Long Value " + longValue);
		System.out.println("Float Value " + floatValue);
		System.out.println("Double Value " + doubleValue);

	}
	
	/**
	 * This method find the occurrence given character in the given String
	 */
	public static void findOccurrenceOfGivenCharacterInString() {
		char input = 'c';
		String inputStr = "this is demo for occurrence of given char in the given string";
		//Approach 1:
		int count = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (input == inputStr.charAt(i)) {
				count ++;
			}
		}
		System.out.println("Approach1: Number Of occurrence of Given character in String is :" + count);
		
		//Approach 2:
		
		int length = inputStr.length() - (inputStr.replaceAll(String.valueOf(input), "").length());
		System.out.println("Approach2: Number Of occurrence of Given character in String is :" + length);
	}
	//String permutations
	public static void printSubStringsFromGivenInput() {
		String input = "ABC";
		Set<String> set = new HashSet<>();
		permute(input.toCharArray(), 0, input.length()-1, set);
		System.out.println(set);
	}
	
	public static void permute(char[] ary, int startIndex, int endIndex, Set<String> set) {
		if (startIndex == endIndex) {
			set.add(String.valueOf(ary));
		} else {
			for (int i = startIndex; i <= endIndex; i++) {
				swap(ary, startIndex, i);
				permute(ary, startIndex + 1, endIndex, set);
				swap(ary, startIndex, i);
			}
		}
	}

	public static void swap(char[] ary, int x, int y) {
		char temp = ary[x];
		ary[x] = ary[y];
		ary[y] = temp;
	}
}
