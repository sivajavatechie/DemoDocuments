package com.sivajavatechie.datastructure;
import java.util.Arrays;

public class SumOfNumbersToTargetNumber {
	
	public static void main(String args[]) {
		
		int[] inputArray = {0,1,2,3,4,5,8,9,10};
		int targetSum = 10;
		sumOfTwoNumbersToTargetNumber(inputArray, targetSum);
		//Expected Output
		// Valid pairs are :(0,10)(1,9)(2,8)(5,5)(8,2)(9,1)
		//Number of valid pair count is :6
		System.out.println("****Without using the two for loops and based on the sorted array without repeating the elements in the pairs*****");
		sumOfTwoNumbersToTargetNumbers(inputArray, targetSum);
		//
	}
	
	//O(n2)
	public static void sumOfTwoNumbersToTargetNumber(int[] inputArray, int targetSum) {
		int count = 0;
		System.out.print("Valid pairs are :");
		for (int i=0; i< inputArray.length; i++) {
				for (int j = 0; j < inputArray.length; j++) {
						if (inputArray[i] + inputArray[j] == targetSum) {
							count++;
							System.out.print("(" + inputArray[i] + "," + inputArray[j] + ")" );
						}
				}
		}
		System.out.println();
		if (count > 0) {
			System.out.println("Number of valid pair count is :" + count);
		} else {
			System.out.println("None of the valid pairs matching to the valid sum");
		}
	}
	
	//To find the sum of two numbers pairs is equal to given sum
	public static void sumOfTwoNumbersToTargetNumbers(int[] inputArray, int targetSum) {
		
		//First sort the array in ascending order
		int count = 0;
		Arrays.sort(inputArray);
		int firstIndex = 0;
		int lastIndex = inputArray.length -1;
		System.out.println("Valid pairs are :");
		while(firstIndex <= lastIndex) {
			if (inputArray[firstIndex] + inputArray[lastIndex] == targetSum) {
				System.out.print("(" + inputArray[firstIndex] + "," + inputArray[lastIndex] + ")");
				firstIndex++;
				lastIndex --;
				count++;
			} else if (inputArray[firstIndex] + inputArray[lastIndex] < targetSum) {
				firstIndex ++;
			} else {
				lastIndex--;
			}
		}
		if (count > 0) {
			System.out.println("Number times target sum matched :" + count);
		} else {
			System.out.println("None of the valid pairs matching to the valid sum");
		}
	}

}
