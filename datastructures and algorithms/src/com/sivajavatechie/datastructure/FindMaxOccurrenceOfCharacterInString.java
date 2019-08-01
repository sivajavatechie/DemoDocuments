package com.sivajavatechie.datastructure;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindMaxOccurrenceOfCharacterInString {
	public static void main(String[] args) {
		
//Algorithm  , convert string into char array
//HashMap<key, value> -- char , no of occurrences
//
		Map<Character, Integer> map = new HashMap<>();
		String input = "This is sivareddy.welcome to youtube channel sivajavatechie";
		for (Character c : input.toCharArray()) {
				if (map.get(c) == null) {
					map.put(c, 1);
				} else {
					map.put(c, map.get(c) + 1);
				}
		}		

		Character key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
		System.out.println("Max Occurrence of Character in the given String is : " + key + " and it is repeated " + map.get(key) + " times.");
		
	}
	
}
