package com.sivajavatechie.datastructure;
public class BinarySeach {

	public static void main(String[] args) {
		
		int[] inputArray = {20,30,40,55,61,75,77,91,95,97};//Array must be sorted
		int searchElement = 75;
		int index = binarySeach(inputArray, searchElement);
		
		if (index == -1) {
			System.out.println("Search Element" + searchElement + "not found in the given Input Array");
		} else {
			System.out.println("Element was found in the given array at the index: " + index);
		}
	
		searchElement = 100;
		index = binarySeach(inputArray,searchElement);
		if (index == -1) {
			System.out.println("Search Element " + searchElement + " not found in the given Input Array");
		} else {
			System.out.println("Element was found in the given array at the index: " + index);
		}	

	}
	/**
	 * Binary Search --Class - Search Algorithm , Data Structure - Array, Worst case Performance O(log n), Best Case Performance O(1), Worst case Space complexity O(1)
	 * @param inputArray
	 * @param searchElement
	 * @return
	 */
	
	public static int binarySeach(int[] inputArray, int searchElement) {

		int firstIndex = 0;
		int lastIndex = inputArray.length-1;
		
		while (firstIndex <= lastIndex) {
			int middlePosition = firstIndex + (lastIndex - firstIndex) / 2;
			if (inputArray[middlePosition] == searchElement) { // element is found and return the index position
				return middlePosition;
			} else if (inputArray[middlePosition] < searchElement) { //if search element is greater then array element at the given index,  
																	//consider the second half the array
				firstIndex = middlePosition + 1;
			} else { //if search element is less then or equal to the array element at the given index, consider the first half the array
				lastIndex = middlePosition - 1;
			}
		}
		return -1; // If search element is not found in the given input array return -1
	}

}
