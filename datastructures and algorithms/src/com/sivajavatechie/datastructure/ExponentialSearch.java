package com.sivajavatechie.datastructure;

public class ExponentialSearch {

	public static void main(String[] args) {
		int[] inputArray = {20,30,40,55,61,75,77,91,95,97};
		int searchElement = 40;
		int index = exponentialSeach(inputArray, inputArray.length-1, searchElement);
		
		if (index == -1) {
			System.out.println("Search Element" + searchElement + "not found in the given Input Array");
		} else {
			System.out.println("Element was found at the index " + index);
		}
	
		searchElement = 100;
		index = exponentialSeach(inputArray, inputArray.length-1,  searchElement);
		if (index == -1) {
			System.out.println("Search Element " + searchElement + " not found in the given Input Array");
		} else {
			System.out.println("Element was found at the index" + index);
		}	

	}

	/*
	 * Class - Search algorithm, Data structure - Array, Worst-case performance
	 * O(log i), Best-case performance O(1), Average performance O(log i),
	 * Worst-case space complexity O(1)
	 */
	public static int exponentialSeach(int inputArray[], int size, int seachElement) {

		if (size == 0) {
			return -1;
		}

		int bound = 1;
		while (bound < size && inputArray[bound] < seachElement) {
			bound *= 2;
		}
		
		return binarySearch(inputArray, bound/2, Math.min(bound+1, size), seachElement);
	}
	
	public static int binarySearch(int array[], int firstIndex, int lastIndex, int searchElement) {
		
		while (firstIndex <= lastIndex) {
			int middlePostion = firstIndex + (lastIndex - firstIndex) /2;
			if (array[middlePostion] == searchElement) {
				return middlePostion;
			} else if(array[middlePostion] > searchElement) {
				return binarySearch(array, firstIndex, middlePostion-1, searchElement);
			} else {
				return binarySearch(array, middlePostion + 1, lastIndex, searchElement);
			}
		}
		return -1;
	}

}