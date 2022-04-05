package com.Problems;

public class FactorialWithRecursion {
	
	public static void main(String[] args) {
		System.out.println(factorial(6));
		factorial_non_rec();
	}
	
	
	//recurssion algorithm
	static int factorial(int n) {
		if(n == 0) 
		return 1;
		
		return n*factorial(n-1);
	}
	
	static void factorial_non_rec() {
		int factorial = 1;
		for(int i =1; i<=6; i++) {
			System.out.print(i+", ");
			factorial = factorial*i;
		}
		System.out.print("the total value is : "+factorial);
	}

}
