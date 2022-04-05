package com.Arrays;

public class Single_Dim_Array {
	public static void main(String[] args) {
		
		// declear single dim array
		int singleDim[];
		
		//set the memory size in array
		singleDim = new int[3];
		
		//Add value to each container
		singleDim[0]=10;
		singleDim[1]=20;
		singleDim[2]=30;
		
		for(int i =0; i<singleDim.length; i++) {
			//System.out.println("The Value of "+i+" is "+singleDim[i]);
		}
	
//		String country[];
//		country = new String[3];
		String country[]= new String[3];
		
		country[0]="USA";
		country[1]="Canada";
		country[2]="Maxico";
		
//		System.out.println("First Country is : "+country[0]);
//		System.out.println("Second Country is : "+country[1]);
//		System.out.println("Third Country is : "+country[2]);
		
		for(String newCountry:country) {
			//System.out.println("Country is : "+newCountry);
		}
		
		System.out.println(country[0].toUpperCase());
		
		
		
		
		
		
		
		
	}

}
