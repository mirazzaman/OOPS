package com.MathClasses;

public class CommonMethodsUtilizaton {
	static int a = 20;
	static int b = 30;
	static int absulutlyValue = -1;

	public static void main(String[] args) {
		maxValue();
		minValue();
		absValue();

	}
	public static void minValue() {
		int minimumValue = Math.min(a, b);
		System.out.println("The Minimum value is : " + minimumValue);
	}
	public static void maxValue() {
		int maximumValue = Math.max(a, b);
		System.out.println("The maximum value is : " + maximumValue);
	}
	public static void absValue() {
		int absulValue = Math.abs(absulutlyValue);
		System.out.println("The maximum value is : " + absulValue);
	}

}
