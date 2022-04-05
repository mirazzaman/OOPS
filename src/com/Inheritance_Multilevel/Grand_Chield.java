package com.Inheritance_Multilevel;

public class Grand_Chield extends Chield{
	void substratcions(int m, int n) {
		System.out.println("Grand chield Class");
		System.out.println("Substructio is : "+(m-n));
	}
	
	public static void main(String[] args) {
		Grand_Chield gc = new Grand_Chield();
		gc.substratcions(70, 30);
		gc.multiplication(10, 5);
		gc.addition(20, 30);
	}

}
