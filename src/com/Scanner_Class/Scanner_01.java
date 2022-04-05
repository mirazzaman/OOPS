package com.Scanner_Class;

import java.util.Scanner;


public class Scanner_01 {
	public static void main(String[] args) {
		//Create an object for Scanneer Class
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please Enter your name: ");
		
		//Declear data type need to write
		String name = scan.nextLine(); //Next()
		
		System.out.println("This is your data : "+name);
		
		
		
		
		
	}

}
