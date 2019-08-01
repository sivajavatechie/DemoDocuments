package com.sivajavatechie.datastructure;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindMaxOccurrenceOfWordInString {
	public static void main(String[] args) {
		
		// Algorithm, convert String into String[] 
		//HashMap<Key, Value>
		String input = "aaa bbb aaa bbb bbb ccc bbb abc bbb";
/*		Map<String, Integer> map = new HashMap<>();
		for (String word : input.split(" ")) {
				if (map.get(word) == null) {
					map.put(word, 1);
				} else {
					map.put(word, map.get(word) + 1);
				}
		}		

		String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
*/	//	System.out.println("Max Occurrence of Word in the given String is : " + key + " and it is repeated " + map.get(key) + " times.");	
		
		
		findMaxOccurrenceOfWordInString(input);
	}
	
	
	public static void findMaxOccurrenceOfWordInString(String input) {
		
		if (input == null || input.isEmpty()) {
			System.out.println("Given input is empty or null");
		}  else {
			
			String[] words = input.split(" ");
			String maxOccurenceWord = "";
			int temp = 0;
			for (int i =0; i < words.length; i++) {
				int counter = 0;
					for (int j=1; j< words.length; j++) {
						if (words[i].equals(words[j])) {
							counter++;
						}
					}
					temp = Math.max(temp, counter);
					
					if (counter >= temp) {
						maxOccurenceWord = words[i];
					}
	
			}
			System.out.println("Max Occurrence of Word in the given String is : " + maxOccurenceWord + " and it is repeated " + temp +" times");
		}
		
		
	}
}
