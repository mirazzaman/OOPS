package com.Inheritance_default;

public class Parents {
	public String name;
	public int hourlyRate;
	
	public Parents(String name, int hRate) {
		this.name = name;
		hourlyRate=hRate;

	}
	
	public  int  salaryCalculation() {
		int totalSalary = hourlyRate*40;
		
		return totalSalary;
	}
	
	void display() {
		System.out.println("Employee name: "+name);
		System.out.println("Total Salary : "+salaryCalculation());
	}
	
	
}
