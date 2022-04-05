package com.Abstraction_Basic;

public class Honda extends Bike{

	@Override
	public void run() {
		System.out.println("Honda can run..");	
		
	}
	
	
public static void main(String[] args) {
		Bike bike = new Honda();
		bike.run();
		bike.coloreOfVehicle();
}
	
	
	

}
