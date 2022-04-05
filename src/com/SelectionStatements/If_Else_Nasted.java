package com.SelectionStatements;

public class If_Else_Nasted {
	public static void main(String[] args) {

		int tamp = 100;

		if (tamp != 100) {
			System.out.println(" Object's color likely blue"); // Line 1
		} else if (tamp > 110) {
			System.out.println(" Object's color likely white"); // Line 2
		} else if (tamp < 130) {
			System.out.println(" Object's color likely yellow"); // Line 3
		} else if (tamp < 101){
			System.out.println(" Object's color likely orange"); // Line 4
		}
	}
}








/*
 * if condition is true, and the minimum value is greater then the condition -
 * minimum will show 
 * If condition is true, and the condition value is greater
 * then all the other values- Maximum will show
 */