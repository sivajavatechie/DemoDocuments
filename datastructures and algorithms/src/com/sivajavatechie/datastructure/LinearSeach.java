package com.sivajavatechie.datastructure;
public class LinearSeach {

	public static void main(String[] args) {
			int[] inputArray = {20,30,40,23, 15, 44, 21, 71, 54};
			int searchElement = 44;
			int index = linearSeach(inputArray, searchElement);
			
			if (index == -1) {
				System.out.println("Search Element" + searchElement + "not found in the given Input Array");
			} else {
				System.out.println("Element was found at the index postion: " + index);
			}
		
			searchElement = 100;
			index = linearSeach(inputArray, searchElement);
			if (index == -1) {
				System.out.println("Search Element " + searchElement + " not found in the given Input Array");
			} else {
				System.out.println("Element was found at the index postion: " + index);
			}			
	}
	
	/**
	Class -	Search algorithm
	Worst-case performance -	O(n)
	Best-case performance -	O(1)
	Average performance -	O(n)
	Worst-case space complexity - O(1)
	*/
	public static int linearSeach(int[] inputArray, int searchElement) {
		
		for (int index = 0 ; index < inputArray.length; index++) {
			if (inputArray[index] == searchElement) {
				return index;
			}
		}
		
		return -1;
	}

}
