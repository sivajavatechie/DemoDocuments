import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayPrograms {

	public static void main(String[] args) {
		reverseArrayElementsWitoutUsingAnotherArray();
		maxOccurenceOfElementFromArray();
		sumOfDiagonalElementsInMultiDimentionalArray();
		swapMultiDimentionaArrayElementsInColumns();
		swapMultiDimentionaArrayElementsInRows();
		
	}
	public static void reverseArrayElementsWitoutUsingAnotherArray() {
		int [] inputArray = {10,20,30,40,50,60,70,80,90,100,110};
		
		for (int i = 0;i < (inputArray.length/2);i++) {
			int temp = inputArray[i];
			inputArray[i] = inputArray[inputArray.length-1-i];
			inputArray[inputArray.length-1-i] = temp;
		}
		
		System.out.println(Arrays.toString(inputArray));
	}
	
	public static void maxOccurenceOfElementFromArray() {
		int[] inputArray = {1,2,3};
		Map<Integer, Integer> map = new HashMap<>();
		int occurences = 1;
		int maxOccurenceElement = inputArray[0];
		boolean status = false;
		for (int i : inputArray) {
			if (map.get(i) == null) {
				map.put(i, 1);
			}else {
				map.put(i, map.get(i)+1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > occurences) { //If Map contains more than one occurence for the element
												// update maxOccurenceElement with the value
				occurences = entry.getValue();
				maxOccurenceElement = entry.getKey();
				status = true;
			}
		}
		
		if (status) {
			System.out.println("The Max Occurrence  Element is: " + maxOccurenceElement + " which is appered " + occurences + "times" );
		} else {
			System.out.println("All the elements in the given array are Unique");
		}
	}
	
	public static void sumOfDiagonalElementsInMultiDimentionalArray() {
		int[][] multiDimArray = new int[][] {{1,2,3},
											 {3,4,5},
											 {6,7,9}
											 };		
		int rows = multiDimArray.length;
		int cols = multiDimArray[0].length;
		
		if (rows != cols) {
			System.out.println("To Calculate sum of Diagonal elements in Multi Dimentioanl Array, it should be n x n matrix");
			return;
		}
		int diagonalSum1 = 0;
		int diagonalSum2 = 0;
		System.out.println("Rows>>" + rows + " Cols" + cols);
		
		for (int i=0,j=0; i<rows && j<cols; i++, j++) {
			diagonalSum1 = diagonalSum1 + multiDimArray[i][j];		
		}
		
		System.out.println("Sum of Diagonal1 Elements in the matrix is:" + diagonalSum1);
		
		
		for (int i = 0, j = cols-1; i < rows && j>=0; i++, j--) {
			diagonalSum2 = diagonalSum2 + multiDimArray[i][j];
		}
		
		System.out.println("Sum of Diagonal2 Elements in the matrix is:" + diagonalSum2);
	}
	
	
	public static void swapMultiDimentionaArrayElementsInColumns() {
		char[][] multiDimCharArray = new char[][] {{'a','b','c'},
												   {'d','e','f'},
												   {'g','h','i'}
												  };
		/*  Excepted Output
		 * c b a
		 * f e d
		 * i h g
		 */
		
		int rows = multiDimCharArray.length;
		int cols = multiDimCharArray[0].length;
		char[][] resultArray = new char[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			int temp = 0;
			for (int j = cols-1; j>=0; j--) {
				resultArray[i][temp] = multiDimCharArray[i][j];
				temp++;
			}
			
		}
		
		System.out.println("After Column Swap --->");
		for (int i =0; i < rows; i++) {
			for (int j=0; j < cols; j++) {
				System.out.print(" " + resultArray[i][j]);
			}
			System.out.println();
		}
	}

	public static void swapMultiDimentionaArrayElementsInRows() {
		char[][] multiDimCharArray = new char[][] {{'a','b','c'},
												   {'d','e','f'},
												   {'g','h','i'}
												  };	
		/*
		 * g h i
		 * d e f
		 * a b c
		 */
		
		int rows = multiDimCharArray.length;
		int cols = multiDimCharArray[0].length;
		char[][] resultArray = new char[rows][cols];
		int temp = 0;
		for (int i = rows-1; i >=0; i--) {
			for (int j = 0; j < cols; j++) {
				resultArray[temp][j] = multiDimCharArray[i][j];
			}
			temp++;
			
		}
		System.out.println("After Row Swap --->");
		for (int i =0; i < rows; i++) {
			for (int j=0; j < cols; j++) {
				System.out.print(" " + resultArray[i][j]);
			}
			System.out.println();
		}
	}
}

