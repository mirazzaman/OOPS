package com.Maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMaps {
	public static void main(String[] args) {
		TreeMap<Object, Object> tmap = new TreeMap<Object, Object>();
		tmap.put(1, "Ahmed");
		tmap.put(8, "Mohammed");
		tmap.put(9, "Abbout");
		tmap.put(3, "Nath");
		tmap.put(6, null);
		
		//System.out.println(tmap+"\n");
		
		for (Entry<Object, Object> mapLoop : tmap.entrySet()) {
			System.out.println(mapLoop.getKey()+" : "+mapLoop.getValue());
		}
	}

}
