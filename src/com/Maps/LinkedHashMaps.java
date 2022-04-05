package com.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
	public static void main(String[] args) {
		
	
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		//add value
		lhm.put(6, "Sarvin");
		lhm.put(1, "Arif");
		lhm.put(2, "Afridi");
		lhm.put(3, "Sadek");
		lhm.put(4, "Dev");
		lhm.put(5, "Sarvin");
		lhm.put(7, "Sarvin");
		
		LinkedHashMap<String, Integer> lhm1 = new LinkedHashMap<String, Integer>();
		lhm1.put("Sarvin", 7);
		lhm1.put("Sarvin", 44);
		lhm1.put("Sarvin", 7);
		lhm1.put("Sarvin", 7);
		lhm1.put("Sarvin", 7);
		lhm1.put("Sarvin", 7);
		lhm1.put("Sarvin", 7);
		lhm1.put("Sarvin", 1);
		lhm1.put("Sarvin", 2);
		lhm1.put("Sarvin", 3);
		lhm1.put("Sarvin", 4);
		lhm1.put("Sarvin", 5);
		lhm1.put("Sarvin", 6);
		lhm1.put("Sarvin", 9);
		System.out.println("----------------------------------------");
		System.out.println("Available Value LHM-1 : ");
		for(Map.Entry<String, Integer> lMap: lhm1.entrySet()) {
			System.out.println(lMap.getValue()+" "+lMap.getKey());
		}
		System.out.println("-----------------************-----------------");
		// get data
		System.out.println("Using to String");
		System.out.println(lhm.toString());
		System.out.println("----------------------------------------");
		
		//Iterate through For Each Loop
		System.out.println("Available Value: ");
		for(Map.Entry<Integer, String> lMap: lhm.entrySet()) {
			System.out.println(lMap.getValue()+" "+lMap.getKey());
		}
		System.out.println("----------------------------------------");
		//Replace value
		lhm.replace(1, "Tawfiq");
		
		System.out.println("After Replacing a Value: ");
		for(Map.Entry<Integer, String> lMap: lhm.entrySet()) {
			System.out.println(lMap.getKey()+" "+lMap.getValue());
		}
		
		
	    
		
		
		
		
	}

}
