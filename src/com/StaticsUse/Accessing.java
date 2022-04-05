package com.StaticsUse;

public class Accessing {
	
	void display() {
		System.out.println("I am non-static");
	}
	static void display2() {
		System.out.println("I am a Static ");
	}
	
	public static void main(String[] args) {
		
		Accessing accessing = new Accessing();
		accessing.display();
		//display();
		display2();
	}

}
