package com.CoreConcepts;

public class Methods {
	public static void main(String[] args) {
		addition(10, 23);
		sum2();
		name();
		mulMath();
		subs();	
		divisions(300, 50);
		
	}
	

	 
	 public void address() {
		 System.out.println("with body");
	 }
	 int arr[] = new int [10];
	 
	static void name() {
		System.out.println("Void method");
	}
	//Parameterized Method
	public static int addition (int i, int j) {
		int calculation = i+j;
		System.out.println("Param Method result is : "+calculation);
		return calculation;
	}
	//Non-parameterized method
	public static void sum2() {
		int i =10; 
		int j = 11;
		int result = i+j;
		System.out.println("Non Param Method rresult : "+result);
	}
	public static void mulMath() {
		int k = 10;
		int j = 9;
		System.out.println("The multiplay is from method :"+(k*j));
	}
	public static void subs() {
		int i = 70;
		int j = 20;
		int res = i-j;
		System.out.println("Substruction is : "+res);
	}
	public static int divisions(int a, int b) {
		int c = (a/b);
		System.out.println("This is Division : "+c);
		return c;
		
	}
	
}
