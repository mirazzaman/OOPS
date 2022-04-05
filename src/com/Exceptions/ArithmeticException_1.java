package com.Exceptions;

public class ArithmeticException_1 {
	public static void main(String[] args) {
		

		
		try {
			int num = 100/0;
			System.out.println("Number is : "+num);
		} catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("This operation is for ArithmeticException..");
		}
	}
	
	

}
