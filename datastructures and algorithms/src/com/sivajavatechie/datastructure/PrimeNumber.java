package com.sivajavatechie.datastructure;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 25;
		System.out.println("Given Number " + input + " isPrime Number ? --" + isPrime(input));
	printPrimeNumbers(101);

	}
//Prime Number - A number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11,13,17 etc..).
// 1,2,3,4,5,6,7
//	number/2 3
	public static boolean isPrime(int number) {
		boolean prime = true;
		for (int i = 2; i < number/2; i++) {
			if (number % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

	public static void printPrimeNumbers(int input) {

		for (int i = 2; i <= input; i++) {
			int counter = 0;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					counter++;
				}

			}
			if (counter == 0) {
				System.out.println(i);
			}

		}
	}
}
