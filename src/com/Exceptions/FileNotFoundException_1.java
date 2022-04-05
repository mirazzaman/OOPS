package com.Exceptions;

import java.io.FileReader;

public class FileNotFoundException_1 {
	public static void main(String[] args) {
		
		//FileReader file = new FileReader("miraz.txt");
		
		
		try {
			FileReader file = new FileReader("miraz.txt");
			
		}catch(Exception e){
			
			System.out.println(e);
			
		}finally {
			System.out.println("This is an operation for file reader!!");
		}
		
		
	}

}
