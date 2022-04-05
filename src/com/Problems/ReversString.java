package com.Problems;

public class ReversString {
	public static void main(String[] args) {

		String name = "mom";
		
		//create an object for string Buffer class
		StringBuffer sb = new StringBuffer(name);
		
		// declear revers method
		sb.reverse();
		
		// create anoter variable for comparing
		String name2 = sb.toString();

		// validatating both words
		if (name.equalsIgnoreCase(name2)) {
			System.out.println("This is a palindroome..");
		} else {
			System.out.println("This is not a Palindroome!!!");
		}

	}

}
