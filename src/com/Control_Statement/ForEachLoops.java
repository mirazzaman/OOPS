package com.Control_Statement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ForEachLoops {
	public static void main(String[] args) {
		String[] names = {"Fatema", "Mohammed", "Mehdi", "Ram", "Kamal", "Sadiq", "Tawfiq"};
		//System.out.println("The List of names are : ");
		for(String students : names) {
			//System.out.print(students+", ");
			
		}
	
//		int arr[]= {1,3,4};
//		System.out.println("Total Length of array is : "+arr.length);
//		int arr2[] = arr.clone();
//		System.out.println(arr2.length);
//		System.out.println(Arrays.equals(arr, arr2));
//		System.out.println(arr2.equals(arr));
//		for(int i =0; i<=arr.length; i++) {
//			System.out.print(i+",");
//		}
		
//		 int[][] intArray = new int[3][3];
//	        System.out.println("Array elements are:");
//	        for (int i = 0; i < 3; i++) {
//	            for (int j = 0; j < 3; j++) {
//	                intArray[i][j] = i+1;           //assign values to each array element
//	                System.out.print(intArray[i][j] + " "); //print each element
//	            }
//	            System.out.println();
//	        }
		
		
		//declaring array  
		int array[];  
		//initialize an array  
		array= new int[6];  
		//adding elements to the array  
		array[0] = 34;  
		array[1] = 90;  
		array[2] = 12;  
		array[3] = 22;  
		array[4] = 9;  
		array[5] = 2711;  
		array[5] = 2276;
		array[5] = 212;  
		array[5] = 20;

		//System.out.print("Elements of Array are: ");  
		//iteraton over the array  
		for(int i=0; i< array.length ; i++)   
		{  
		//System.out.print(array[i] +" ");  
		}  

		 //2-d array initialised with values    
       // int[][] intArray = { { 1, 2 }, { 3, 4 },{5,6}}; 
        //print the array
       // System.out.println("Initialized Two dimensional array:");
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 2; j++) { 
          //  System.out.print(intArray [i][j] + " "); 
            } 
 
           // System.out.println(); 
        } 

        //Scanner sc = new Scanner(System.in);
        //System.out.println("enter");
       // int num = sc.nextInt();
        //for(int i=0; i<=num; i++) {
        	//if(i%2==1) {
        		
        		//System.out.println(i);
        	
        	
      //  }
        
        String i = " Name";
        String j = "name";
        System.out.println(i.length() == j.length());
        if(i.equalsIgnoreCase(j)) {
        	
        	System.out.println("Both are equal");
        }else {
        	System.out.println("Not equal");
        }
        
		
		   int[][] myarray = new int[3][3];
			myarray[0][0] = 1;
			myarray[0][1] = 2;
			myarray[0][2] = 3;
			myarray[1][0] = 4;
			myarray[1][1] = 5;
			myarray[1][2] = 6;
			myarray[2][0] = 7;
			myarray[2][1] = 8;
			myarray[2][2] = 9;

//			System.out.println("Array elements are:");
//			System.out.println(myarray[0][0] + " " + myarray[0][1] + " " + myarray[0][2]);
//			System.out.println(myarray[1][0] + " " + myarray[1][1] + " " + myarray[1][2]);
//			System.out.println(myarray[2][0] + " " + myarray[2][1] + " " + myarray[2][2]);
		
		
		
		
	}

}
