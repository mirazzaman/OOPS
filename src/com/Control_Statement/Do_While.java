package com.Control_Statement;

public class Do_While {
	public static void main(String[] args) {
		
		int i = 0;
		System.out.println("Print the first 10 Even Number: ");
		
		do {
			System.out.println(i);
			i = i+2;
			//System.out.println("Wrong Condition");
		}while(i>10);
	}

}
