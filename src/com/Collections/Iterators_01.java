package com.Collections;
/**
 * Example of Iterator using for-each
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Iterators_01 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(10);
		list.add(13);
		list.add(14);
		list.add(15);
		
		//System.out.println("Normal List : "+list);
		
		
		
		System.out.print("Using For Each loop : ");
		for (Integer lists : list) {
			System.out.print(lists+", ");	
		}
		
		System.out.print("\nUsing Iterator : ");
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
		
		
	}

}
