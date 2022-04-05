package com.Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		//Declear Map 
		
		Map< String, String> map = new HashMap<String, String>();
		
		map.put("Name", "Mohammed");
		map.put("Address", "New York");
		map.put("Cell", "123456789");
		
		//Retrieve map
		System.out.println("Utilized Reguler output: ");
		System.out.println(map);
		
		map.replace("Name", "Mohammed", "Islam");
		
		System.out.println("Actual Values.");
		System.out.println("\nUtilized For Each: ");
		
		for (Map.Entry<String, String> mapLoop : map.entrySet()) {
			System.out.println(mapLoop.getKey()+" = "+mapLoop.getValue());
			
		}
		
		

	}
}
