package com.Arrays;

import java.util.Arrays;

public class Statics_Array {
	public static void main(String[] args) {
		
		int arr[]= {1, 2, 3, 4};
		
		int arr2[]=arr.clone();
		
		//System.out.print("From clone : ");
		for(int i=0; i<arr2.length; i++) {
			//System.out.print(arr2[i]+", ");
			
		}
		//System.out.println();
		//System.out.print("From Original : ");
		for(int i=0; i<arr.length; i++) {
			//System.out.print(arr[i]+", ");
			
		}
		
		//if(arr==arr2) 
		
	//	if(Arrays.equals(arr, arr2))
	//	if(arr.equals(arr2))
		if(Arrays.equals(arr, arr2)){
			System.out.println("Both are same");
		} else {
			System.out.println("\nValues are different!!");
		}
		//System.out.println(arr[0]+", "+arr[1]+", "+arr[2]
				//+", "+arr[3] +", "+arr[4]+", "+arr[5] +", "+arr[6]+", "+arr[7]);
		// 0 -- -- 10
		
		//System.out.println("the Length of array is : "+arr.length);
		//int len = arr.length;
		
		
		
	}

}
