package com.Problems;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		checkPrime();
	}

	public static void checkPrime() {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int input = scan.nextInt();
		for (int i = 2; i < input; i++) {

			if (input % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("This is a prime number.  ");
		} else {
			System.out.println("This is not a prime number.  ");
		}

	}

}
