package com.Maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<String, String> hTable = new Hashtable<String, String>();
		
		//Add Value in Hash Table
		hTable.put("ID", "23456");
		hTable.put("Name", "Afridi");
		hTable.put("Address", "Queens, NY");
		hTable.put("Phone", "112345671");
		
		//Get Value with Reguler way
		System.out.println("Total Value in this list : "+hTable.size());
		System.out.println(hTable);
		System.out.println("-------------------------------------------");
		//Utilized For Each
		System.out.println("Utilized For Each Loop: ");
		for(Map.Entry<String, String> table : hTable.entrySet()) {
			System.out.println(table.getKey()+" = "+table.getValue());
		}
		System.out.println("-------------------------------------------");
		//Remove Value
		hTable.remove("Phone");
		System.out.println("After removing, the list size is : "+hTable.size());
		System.out.println("Utilized For Each Loop: ");
		for(Map.Entry<String, String> table : hTable.entrySet()) {
			System.out.println(table.getKey()+" = "+table.getValue());
		}
		
		
		
	}

}
