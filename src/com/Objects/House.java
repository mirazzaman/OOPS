package com.Objects;

public class House {
	
	String address;
	String color;
	double area;
	 
	House(String address, String color, double area){
		this.address = address; 
		this.color = color;
		this.area = area; 
	}
	
	void openDoor() {
		System.out.println("Door is Open!!!");
	}
	void closedDoor() {
		System.out.println("Door is Closed!!");
	}
	void display() {
		System.out.println("The Address is : "+ address);
		System.out.println("The Color is : "+ color);
		System.out.println("The Area is : "+ area);
	}
	

}
