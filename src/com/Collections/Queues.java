package com.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
	public static void main(String[] args) {
		
		Queue<String> qList = new LinkedList<String>();
		qList.add("Five");
		qList.add("Two");
		qList.add("One");
		qList.add("Three");
		qList.add("Four");
		System.out.println("Elements in the list are : "+qList);
		System.out.println("Actual size of this list are : "+qList.size());
		
		qList.remove("Three");
		System.out.println("After Removing");
		System.out.println("Elements in the list are : "+qList);
		System.out.println("Current size of this list are : "+qList.size());

		System.out.println("List Contains element 'Three' or not? : "+qList.contains("Three"));
		
		if(qList.contains("Three")) {
			System.out.println("Contains");
		}else {
			System.out.println("Not Contains");
		}
		

	}

}
