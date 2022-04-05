package com.Polymorphism_Overloading;

public class Shape {
	// Method overloading
	public void area() {
		System.out.println("Find Area: ");
	}

	public void area(int r) {
		System.out.println("Circle area = " + (Math.PI * r * r));
	}

	public void area(double b, double h) {
		System.out.println("Triangle area=" + (0.5 * b * h));
	}

	public void area(int l, int b)

	{
		System.out.println("Rectangle area=" + (l * b));
	}
}
