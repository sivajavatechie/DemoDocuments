package com.sivajavatechie.datastructure;

public class BinarySearchUsingRecursion {
public static void main(String[] args) {
		
		int[] inputArray = {20,30,40,55,61,75,77,91,95,97};//Array must be sorted
		int searchElement = 75;
		int index = binarySearchUsingRecurrsion(inputArray, 0, inputArray.length-1, searchElement);
		
		if (index == -1) {
			System.out.println("Search Element" + searchElement + "not found in the given Input Array");
		} else {
			System.out.println("Element was found in the given array at the index: " + index);
		}
	
		searchElement = 100;
		index = binarySearchUsingRecurrsion(inputArray, 0, inputArray.length-1, searchElement);
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

public static int binarySearchUsingRecurrsion(int[] inputArray, int firstIndex, int lastIndex, int searchElement) {
	while(firstIndex <= lastIndex ) {
			int middlePosition = firstIndex + (lastIndex - firstIndex)/2;
			if (inputArray[middlePosition] == searchElement) {
				return middlePosition;
			} else if (inputArray[middlePosition] > searchElement) {
					return binarySearchUsingRecurrsion(inputArray, firstIndex, middlePosition-1, searchElement);
			} else {
				return binarySearchUsingRecurrsion(inputArray, middlePosition+1, lastIndex, searchElement);
			}
	}
	
	return -1;
}

}
