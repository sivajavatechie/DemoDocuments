package com.sivajavatechie.datastructure;
public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
	int[] input = {98,48,3,3,5,5};
	removeDuplicateElements(input);
	}
	
	public static void removeDuplicateElements(int[] inputArray) {
	
		int endPos = inputArray.length;
		  for (int i = 0; i < endPos; i++) {
		        for (int j = i + 1; j < endPos; j++) {
		            if (inputArray[i] == inputArray[j]) {   // if element matched then assign last element to the inputArray[j] <- inputArray[endPos-1], endPos--, j--             
		                inputArray[j] = inputArray[endPos-1];
		                endPos--; // decrement endPos
		                j--;
		            }
		        }
		    }
		  
		  for (int i =0; i < endPos; i++) {
			  System.out.print(inputArray[i] + ",");
		  }
	}
	

}
