package com.Collections;



//import java.util.*; // use reguler expression
import java.util.Map.Entry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;







public class Combined_Collection {

	public static List<String> list;
	public static Set<Integer> set;
	public static Set<String> sSet;
	public static Queue<String> qList;
	public static Iterator<String> itr;
	public static Iterator<Integer> itr1;

	/*
	 * public static ArrayList<String> list; public static LinkedList<String> list;
	 * public static HashSet<Integer> set; public static LinkedHashSet<String> sSet;
	 * public static TreeSet<String> sSet; public static Iterator<String> itr;
	 * public static Iterator<Integer> itr1;
	 */

	public static void main(String[] args) {
		arrayList();
		System.out.println("\n======================================================================");
		linkedList();
		System.out.println("\n======================================================================");
		queues();
		System.out.println("\n======================================================================");
		hashSets();
		System.out.println("\n======================================================================");
		treeSets();
		System.out.println("\n======================================================================");
		linkedHset();
		System.out.println("\n======================================================================");
		treeMap();
		System.out.println("\n======================================================================");
		hashMap();
		System.out.println("\n======================================================================");
		hashTable();
		System.out.println("\n======================================================================");
		linkedHashMap();
	}

	public static void treeMap() {
		TreeMap<Object, Object> tmap = new TreeMap<Object, Object>();
		tmap.put(1, "Ahmed");
		tmap.put(8, "Mohammed");
		tmap.put(9, "Abbout");
		tmap.put(3, "Nath");
		tmap.put(6, null);

		// System.out.println(tmap+"\n");

		for (Entry<Object, Object> mapLoop : tmap.entrySet()) {
			System.out.println(mapLoop.getKey() + " : " + mapLoop.getValue());
		}
	}

	public static void linkedHashMap() {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		// add value
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
		for (Map.Entry<String, Integer> lMap : lhm1.entrySet()) {
			System.out.println(lMap.getValue() + " " + lMap.getKey());
		}
		System.out.println("-----------------************-----------------");
		// get data
		System.out.println("Using to String");
		System.out.println(lhm.toString());
		System.out.println("----------------------------------------");

		// Iterate through For Each Loop
		System.out.println("Available Value: ");
		for (Map.Entry<Integer, String> lMap : lhm.entrySet()) {
			System.out.println(lMap.getValue() + " " + lMap.getKey());
		}
		System.out.println("----------------------------------------");
		// Replace value
		lhm.replace(1, "Tawfiq");

		System.out.println("After Replacing a Value: ");
		for (Map.Entry<Integer, String> lMap : lhm.entrySet()) {
			System.out.println(lMap.getKey() + " " + lMap.getValue());
		}

	}

	public static void hashTable() {
		Hashtable<String, String> hTable = new Hashtable<String, String>();

		// Add Value in Hash Table
		hTable.put("ID", "23456");
		hTable.put("Name", "Afridi");
		hTable.put("Address", "Queens, NY");
		hTable.put("Phone", "112345671");

		// Get Value with Reguler way
		System.out.println("Total Value in this list : " + hTable.size());
		System.out.println(hTable);
		System.out.println("-------------------------------------------");
		// Utilized For Each
		System.out.println("Utilized For Each Loop: ");
		for (Map.Entry<String, String> table : hTable.entrySet()) {
			System.out.println(table.getKey() + " = " + table.getValue());
		}
		System.out.println("-------------------------------------------");
		// Remove Value
		hTable.remove("Phone");
		System.out.println("After removing, the list size is : " + hTable.size());
		System.out.println("Utilized For Each Loop: ");
		for (Map.Entry<String, String> table : hTable.entrySet()) {
			System.out.println(table.getKey() + " = " + table.getValue());
		}

	}

	public static void maps() {
		// Declear Map

		Map<String, String> map = new HashMap<String, String>();

		map.put("Name", "Mohammed");
		map.put("Address", "New York");
		map.put("Cell", "123456789");

		// Retrieve map
		System.out.println("Utilized Reguler output: ");
		System.out.println(map);

		System.out.println("Actual Values.");
		System.out.println("\nUtilized For Each: ");

		for (Map.Entry<String, String> mapLoop : map.entrySet()) {
			System.out.println(mapLoop.getKey() + " = " + mapLoop.getValue());

		}
	}

	public static void hashMap() {
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

		// Retrieve map
		System.out.println("Utilized Reguler output: ");
		System.out.println(grocery);

		// Iterate for each loop
		System.out.println("\nIterate through ForEach Loop: ");
		System.out.println("Size of this list is: " + grocery.size());
		for (Map.Entry<String, Double> gList : grocery.entrySet()) {
			System.out.println(gList.getKey() + " = " + gList.getValue());
		}

		System.out.println("========================================\n");
		// Remove items
		System.out.println("After Removing: ");
		grocery.remove("Tomatos");
		System.out.println("Size of this list is: " + grocery.size());
		for (Map.Entry<String, Double> gList : grocery.entrySet()) {
			System.out.println(gList.getKey() + " = " + gList.getValue());
		}
		System.out.println("========================================\n");
		// Replace Item
		System.out.println("After Replacing: ");
		grocery.replace("Onion", 4.00);
		System.out.println("Size of this list is: " + grocery.size());
		for (Map.Entry<String, Double> gList : grocery.entrySet()) {
			System.out.println(gList.getKey() + " = " + gList.getValue());
		}
		System.out.println("========================================");
		if (grocery.containsKey("Rice")) {
			System.out.println("Rice is contains.");
		} else {
			System.out.println("Rice is not Availabe!!");
		}
	}

	public static void arrayList() {
		// Declear an array list
		list = new ArrayList<String>();

		// Add value in List
		list.add("Arif");
		list.add("Zafri");
		list.add("Jeff");
		list.add("Tawfiq");
		list.add("Salma");
		list.add("Sadek");
		list.add("Sarvin");
		list.add("Mohammed");
		
		list.add(5, "Tom");

		System.out.println("Size of this List is : " + list.size());
		System.out.print("Array List : ");
		for (String newList : list) {
			System.out.print(newList + ", ");
		}
	}

	public static void linkedList() {
		list = new LinkedList<String>();

		// Add value in List
		list.add("Arif");
		list.add("Zafri");
		list.add("Jeff");
		list.add("Tawfiq");
		list.add("Salma");
		list.add("Sadek");
		list.add("Sarvin");
		list.add("Mohammed");
		System.out.println("Size of this List is : " + list.size());
		System.out.print("Linked List : ");
		itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}

	}

	public static void queues() {
		qList = new LinkedList<String>();
		qList.add("Five");
		qList.add("Two");
		qList.add("One");
		qList.add("Three");
		qList.add("Four");
		System.out.println("Actual size of this list are : " + qList.size());
		System.out.println("Queue List " + qList);

		qList.remove("Three");
		System.out.println("After Removing");
		System.out.println("Elements in the list are : " + qList);
		System.out.println("Current size of this list are : " + qList.size());

		System.out.println("List Contains element 'Three' or not? : " + qList.contains("Three"));

	}

	public static void hashSets() {
		set = new HashSet<Integer>();
		set.add(12);
		set.add(10);
		set.add(9);
		set.add(22);
		set.add(12);
		set.add(34);

		System.out.println("Size of Hash set is : " + set.size());
		System.out.println("Utilized Iterator");
		System.out.print("Hash Set: ");
		itr1 = set.iterator();
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + ", ");
		}
	}

	public static void linkedHset() {
		sSet = new LinkedHashSet<String>();
		sSet.add("Miraz");
		sSet.add("Arif");
		sSet.add("Sadek");
		sSet.add("Tawfiq");
		sSet.add("Jeff");
		sSet.add("Mohammed");
		sSet.add("Zafry");
		sSet.add("Mohammed");
		sSet.add("zafry");

		// Check Size
		System.out.println("Total elements in this list : " + sSet.size());
		System.out.print("Available Items are : \n");
		// Iterate
		System.out.print("Linked Hash Set : ");
		itr = sSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");

		}
	}

	public static void treeSets() {
		sSet = new TreeSet<String>();
		sSet.add("A");
		sSet.add("Z");
		sSet.add("M");
		sSet.add("L");
		sSet.add("D");
		sSet.add("D");
		sSet.add("S");
		sSet.add("T");
		sSet.add("Q");
		sSet.add("P");

		// Check Size
		System.out.println("Total elements in this list : " + sSet.size());

		System.out.print("Available Items are : \n");
		// Iterate
		System.out.print("Tree Set : ");
		itr = sSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");

		}
	}

}
