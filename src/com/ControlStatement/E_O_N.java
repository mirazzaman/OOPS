package com.ControlStatement;

import java.util.Scanner;

public class E_O_N {
	public static void main(String[] args) {
		int a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want to print for even and odd: ");
		int number = sc.nextInt();
		System.out.println("Even numbers from 1 to "+number+" are: \n");
		System.out.println("This is the even number");
		
		for(a =1; a<=number; a++) {
			if(a % 2==0) {
				System.out.println(a+" \n");
			}
		}
		System.out.println("This is the odd number");
		for(a =1; a<=number; a++) {
			if(a % 2==1) {
				System.out.println(a+" \n");
			}
		}

		for(int j =10; j>=1; j++) {
			System.out.println(j);
		}
	}

}
