package com.ControlStatement;

public class For_Loop {
	public static void main(String[] args) {
		
		int a = 10;
		//Increment (Pre)
		System.out.print("Pre Increment >> ");
		for(int i = 1; i<=a; i++) {		
				System.out.print(i+", ");
		}
		System.out.println();
		//Increment (Post)
		System.out.print("Post Increment >> ");
		for(int i = 1; i<=a; ++i) {
			System.out.print(i+", ");
		}
		System.out.println("\n-------------------------------------------------");
		//deccrement 
		System.out.print("Pre Decrement >> ");
		for(int i = a; i>=1; i--) {
			System.out.print(i+", ");
		}
		System.out.println();
		//deccrement 
		System.out.print("Post Decrement >> ");
		for(int i = a; i>=1; i--) {
			System.out.print(i+", ");
		}
	}

}
