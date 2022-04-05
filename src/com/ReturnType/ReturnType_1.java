package com.ReturnType;

public class ReturnType_1 {
	
	//Non Parameterized Method
	public int addition() {
	
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	
	public int substraction(int a, int b) {
		 int c = a-b;
		 
		return c;
	}
	
	
	public static void main(String[] args) {
		
		ReturnType_1 returnTuype_1 = new ReturnType_1();
	
		
		System.out.println("The final result of addition :"+returnTuype_1.addition());
		System.out.println("The final result is sub :"+returnTuype_1.substraction(19, 9));
	}

}
