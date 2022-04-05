package com.Inheritance_default;

public class Child extends Parents {

	public Child(String name, int hRate) {
		super(name, hRate);
		
	}
	
	public static void main(String[] args) {
		Child ch = new Child("Jhon", 45);
		ch.salaryCalculation();
		ch.display();
	}
	
	

}
