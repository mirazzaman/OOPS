package com.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {
	public static void main(String[] args) {
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.add("A");
		tSet.add("Z");
		tSet.add("M");
		tSet.add("L");
		tSet.add("D");
		tSet.add("D");
		tSet.add("S");
		tSet.add("T");
		tSet.add("Q");
		tSet.add("P");
		
		//Check Size
		System.out.println("Total elements in this list : "+tSet.size());
		
		System.out.print("Available Items are : \n");
		//Iterate
		System.out.print("Using Iterator: ");
		Iterator<String> itr = tSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+", ");
			
		}
		System.out.print("\nUsing For Each: ");
		for (String newList : tSet) {
			System.out.print(newList+", ");	
		}
		
		tSet.clear();
		System.out.println("\nAvailable element is : "+tSet);
		System.out.println("Total elements in this list : "+tSet.size());
		
	}

}
