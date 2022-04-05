package com.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	
	public static void main(String[] args) {
		
				
		HashMap<String, Double> grocery = new HashMap<String, Double>();
		// Add Items
		grocery.put("Tomatos", 1.99);
		grocery.put("Potatos", 1.49);
		grocery.put("Canola Oil", 10.99);
		grocery.put("Eggplant", 2.00);
		grocery.put("Rise", 2.99);
		grocery.put("Onion", 3.00);
		grocery.put("Onion", 3.01);
		grocery.put("Onion", 2.01);
		
		
		//Retrieve map
		System.out.println("Utilized Reguler output: ");
		System.out.println(grocery);
		
		//Iterate for each loop
		System.out.println("\nIterate through ForEach Loop: ");
		System.out.println("Size of this list is: "+grocery.size());
		for(Map.Entry<String, Double> gList : grocery.entrySet()) {
			System.out.println(gList.getKey()+" = "+gList.getValue());
		}
		
		System.out.println("========================================\n");
		  // Remove items
		System.out.println("After Removing: ");
		grocery.remove("Tomatos");
		System.out.println("Size of this list is: "+grocery.size());
		for(Map.Entry<String, Double> gList : grocery.entrySet()) {
			System.out.println(gList.getKey()+" = "+gList.getValue());
		}
		System.out.println("========================================\n");
		//Replace Item
		System.out.println("After Replacing: ");
		grocery.replace("Onion", 4.00);
		System.out.println("Size of this list is: "+grocery.size());
		for(Map.Entry<String, Double> gList : grocery.entrySet()) {
			System.out.println(gList.getKey()+" = "+gList.getValue());
		}
		System.out.println("========================================");
		if(grocery.containsKey("Rice")) {
			System.out.println("Rice is contains.");
		}else {
			System.out.println("Rice is not Availabe!!");
		}
	}

}
