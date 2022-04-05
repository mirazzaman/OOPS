package com.Exceptions;

public class NullPointerExceptions {

	public static void main(String[] args) {
		
//		String name = null;
//		System.out.println(name.toString());
			
		try {
			String name = null;
			System.out.println("String : "+name);

		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("This is for null pointer");
		}
	}

}
