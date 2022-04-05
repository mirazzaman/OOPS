package com.Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {
	public static void main(String[] args) {
		LinkedHashSet<String> linkd1 = new LinkedHashSet<String>();
		LinkedHashSet<String> linkd2 = new LinkedHashSet<String>();
		linkd1.add("Miraz");
		linkd1.add("Arif");
		linkd1.add("Sadek");
		linkd1.add("Tawfiq");
		linkd1.add("Jeff");
		linkd1.add("Mohammed");
		linkd1.add("Zafry");
		linkd1.add("Mohammed");
		linkd1.add("zafry");
		linkd2.addAll(linkd1);
		System.out.println("List one: "+linkd1);
		System.out.println("List Twoo: "+linkd2);
		//Check Size
		System.out.println("Total elements in this list : "+linkd1.size());
		System.out.print("Available Items are : \n");
		//Iterate
		System.out.print("Using Iterator: ");
		Iterator<String> itr = linkd1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+", ");
			
		}
		System.out.print("\nUsing Iterator: ");
		for (String newList : linkd1) {
			System.out.print(newList+"' ");
			
		}
		
	}

}
