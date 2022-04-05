package com.Inheritance_SingleLevel;

public class Class_B extends Class_A {


	void substractions(int x, int y) {
		System.out.println("This is Child");
		System.out.println("Sub Value is : " + (x - y));
	}

	public static void main(String[] args) {
		Class_B cb = new Class_B();
		cb.message.toString();
		cb.add(12, 20);
		cb.substractions(23, 11);

	}

}
