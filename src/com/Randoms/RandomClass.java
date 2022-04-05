package com.Randoms;

import java.util.Random;
import java.util.Scanner;

public class RandomClass {
	static Random random;
	static int rendomNum;
	
	public static void main(String[] args) {
		ran_1();
		ran_2();
		ran_3();
	}
	
	//Using Random Class
	public static void ran_1() {
		
		random = new Random();
		rendomNum = random.nextInt(6)+1;
		System.out.println("This is your Random Number : "+"tom"+rendomNum+"@email.com");	
	}
	//Using Math Class
	public static void ran_2() {
		rendomNum = (int) (Math.random()*6)+1;
		System.out.println("This is your Random Number : "+"tom"+rendomNum+"@email.com");

	}
	//Using Scanner
	public static void ran_3() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type your desire number : ");
		int input = scan.nextInt(); // any number from user
		random = new Random();
		rendomNum = random.nextInt(input)+1;
		System.out.println("This is your Random Number : "+"tom"+rendomNum+"@email.com");
	}

}
