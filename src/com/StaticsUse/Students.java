package com.StaticsUse;

public class Students {
	int rollNo;
	String name;
	
//	String college1 = "PIIT";
//	
//	String college2= "PIIT";
	
	static String college3 = "PIIT"; 

	Students(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;

	}

//	void displayd1() {
//		
//		System.out.println(name + " " + rollNo + " " + college1);
//	}
//	
//	void displayd2() {
//		System.out.println(name + " " + rollNo + " " + college1);
//	}
	

	
	
	
	void displayd3() {
		System.out.println("With Static");
		System.out.println(name + " " + rollNo + " " + college3);
	}

}
