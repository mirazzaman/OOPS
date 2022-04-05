package com.Collections;

import java.util.ArrayList;

public class ArrayLists {
	
	public static void main(String[] args) {
		
		//Declear an array list
		ArrayList<String> list = new ArrayList<String>();
		
		//Add value in List
		list.add("Arif");
		list.add("Zafri");
		list.add("Jeff");
		list.add("Tawfiq");
		list.add("Salma");
		list.add("Sadek");
		list.add("Sarvin");
		list.add("Mohammed");
		
		
		System.out.println("The Value in this list are: ");
		for(String newList:list) {
			System.out.print(newList+", ");
		}
		System.out.println("\nSize of this list : "+list.size());
		System.out.println("=================================\n");
		list.add("Miraz");
		System.out.println("After added a new value");
		System.out.println(list);
		System.out.println("Size of this list : "+list.size());
		System.out.println("=================================\n");
		list.remove(1);
		System.out.println("After Removing value");
		System.out.println(list);
		System.out.println("Size of this list : "+list.size());
		
		System.out.println("=================================\n");
		list.add(4, "Zaman");
		System.out.println("After added a new value");
		System.out.println(list);
		System.out.println("Size of this list : "+list.size());
		
		System.out.println("=================================\n");
		
		if(list.contains("Noone")) {
			System.out.println("Sarvin is here");
		} else {
			System.out.println("NoOne is not here");
		}

		
		
		
		
		
		
		
	}

}
