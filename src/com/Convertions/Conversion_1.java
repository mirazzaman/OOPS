package com.Convertions;

public class Conversion_1 {
	public static void main(String[] args) {
		intToString();
		stringToInt();
	}
	
	public static void intToString() {
		int i = 99;
		String s = "13";
		int converts = Integer.parseInt(s);// String converted to int
		System.out.println("Value was before convrting : "+(i+s));
		System.out.println("Value was before convrting : "+(i+converts));
	}
	
	public static void stringToInt() {
		int i = 4444;
		System.out.println("Current status of variable is : "+i);
		
		String converts = String.valueOf(i);// String converted to int
		System.out.println("The length of this variable is : "+converts.length());
		System.out.println("Value was before convrting : "+(converts+i));
	}

}
