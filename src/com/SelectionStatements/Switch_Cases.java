package com.SelectionStatements;

public class Switch_Cases {
	public static void main(String[] args) {
		String position = "N";
		int a=10; 
		int b=20;
		

		switch (position) { // Key
		case "E":
			System.out.println("This is East");
			break;
		case "W":
			System.out.println("This is West");
			break;
		case "N":
			System.out.println("This is North");
			if((a>b || a!=b) && (a<a && a==b)) {
				System.out.println("value is not true!!");
			}else {
				System.out.println("a is not > b...");
			}
			
			break;
		case "S":
			System.out.println("This is the South");
			break;
		default:
			System.out.println("No side found!!");
		}
	}

}
// what are the reserv keyword in java?