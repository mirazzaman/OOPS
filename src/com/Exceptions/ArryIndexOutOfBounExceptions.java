package com.Exceptions;

public class ArryIndexOutOfBounExceptions {
	public static void main(String[] args) {

		try {
			int arr[] = new int[4];
			arr[4] = 10;
			System.out.println(arr[4]);
			
		} catch (Exception exception) {
			
			System.out.println(exception);
			
		} finally {
			System.out.println("This operation is for ArryIndexOutOfBounException.. ");
		}

	}

}
