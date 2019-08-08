package com.sivajavatechie.datastructure;
public class InterpolationSearch {

	public static void main(String[] args) {
		int[] inputArray = {20,30,40,55,61,75,77,91,95,97};
		int searchElement = 75;
		int index = interpolationSearch(inputArray, searchElement);
		
		if (index == -1) {
			System.out.println("Search Element" + searchElement + "not found in the given Input Array");
		} else {
			System.out.println("Element was found at the index " + index);
		}
	
		searchElement = 100;
		index = interpolationSearch(inputArray, searchElement);
		if (index == -1) {
			System.out.println("Search Element " + searchElement + " not found in the given Input Array");
		} else {
			System.out.println("Element was found at the index" + index);
		}	
	}

	/**
	 * Interpolation search is an algorithm for searching for a key in an array that has been ordered by numerical values assigned to the keys (key values)
	 * Average the interpolation search makes about log(log(n)) comparisons, where n is the number of elements to be searched
	 * Worst case O(n)
	 * @param inputArray
	 * @param searchElement
	 * @return
	 */
	public static int interpolationSearch(int[] inputArray, int searchElement) {
		   int firstIndex = 0;
		   int lastIndex = inputArray.length-1;

	        while (firstIndex <= lastIndex && searchElement >= inputArray[firstIndex] && searchElement <= inputArray[lastIndex]) 
	        {         
	  
	            if (firstIndex == lastIndex) 
	            { 
	                if (inputArray[firstIndex] == searchElement) 
	                	return firstIndex; 
	                	return -1; 
	            } 
	         
	            // Probing the position with keeping 
	            // uniform distribution in mind. 
	              
	            int pos = firstIndex + (((lastIndex-firstIndex) / 
	                  (inputArray[lastIndex]-inputArray[firstIndex]))*(searchElement - inputArray[firstIndex])); 
	       
	            // Condition of target found 
	            if (inputArray[pos] == searchElement) 
	                return pos; 
	       
	            // If x is larger, x is in upper part 
	            if (inputArray[pos] < searchElement) 
	                firstIndex = pos + 1; 
	       
	            // If x is smaller, x is in the lower part 
	            else
	                lastIndex = pos - 1; 
	        } 
	        return -1; 

	}
}
