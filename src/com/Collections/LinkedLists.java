package com.Collections;

import java.util.Iterator;
import java.util.LinkedList;

import com.Control_Statement.While_Loop;

public class LinkedLists {

	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		
		
		//Add value in List
		lList.add("Arif");
		lList.add("Zafri");
		lList.add("Jeff");
		lList.add("Tawfiq");
		lList.add("Salma");
		lList.add("Sadek");
		lList.add("Sarvin");
		lList.add("Mohammed");
		System.out.println(lList);
		lList.remove(2);
		System.out.println(lList);
	
		System.out.print("Get list using Iterator: ");
		Iterator<String> itr = lList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
		
		System.out.print("\nGet list using ForEach: ");
		for (String linkedList : lList) {
			System.out.print(linkedList+", ");
		}
		System.out.println();
		System.out.println("Using Reguler Print : "+lList+", ");
		
	}
	
}
