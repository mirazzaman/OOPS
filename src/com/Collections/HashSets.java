package com.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
	public static void main(String[] args) {
		
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(12);
		hash.add(12);
		hash.add(12);
		hash.add(22);
		hash.add(12);
		hash.add(34);
		
		
		System.out.println("Size of Hash set is : "+hash.size());
		System.out.println("Utilized Iterator");
		System.out.print("Available items in the list : ");
		
		Iterator<Integer> itr = hash.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
		System.out.print("\nUtilized For-Each : ");
		for (Integer integer : hash) {
			System.out.print(integer+", ");
		}
	}

}
