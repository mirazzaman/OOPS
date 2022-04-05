package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators_02 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(10);
		list.add(13);
		list.add(14);
		list.add(15);
		
		System.out.print("Elements in this lists are : ");
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
		
		
	}
}
