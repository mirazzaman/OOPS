package com.Arrays;

public class Multi_Dim_Array {
	public static void main(String[] args) {

		
		int mulDim[][] = new int[3][3];
		
		mulDim[0][0]= 1; 
		mulDim[0][1]= 2;
		mulDim[0][2]= 3;
		mulDim[1][0]= 4;
		mulDim[1][1]= 5;
		mulDim[1][2]= 6;
		mulDim[2][0]= 7;
		mulDim[2][1]= 8;
		mulDim[2][2]= 9;
		
//		System.out.println(mulDim[0][0]+" "+mulDim[0][1]+" "+mulDim[0][2]);
//		System.out.println(mulDim[1][0]+" "+mulDim[1][1]+" "+mulDim[1][2]);
//		System.out.println(mulDim[2][0]+" "+mulDim[2][1]+" "+mulDim[2][2]);
		
		System.out.println("The elements of 2 Dim is: ");
		for(int i=0; i<mulDim.length; i++) { // is for Row
			for(int j=0; j<mulDim.length; j++) { // is for col
				System.out.print(mulDim[i][j]+" ");
			}
			System.out.println();
		}
		
	//intArray[i][j] = i+1;  //assign values to each array element	
		
		int mulDim2[][];
		
		mulDim2=new int[3][3];
		
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				mulDim2[i][j]=i+1;
				System.out.print(mulDim[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
