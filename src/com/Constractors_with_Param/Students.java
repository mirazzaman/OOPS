package com.Constractors_with_Param;

public class Students {
	String name;
	int rol_num;
	
	public Students(String name, int rol_num) {
		this.name = name;
		this.rol_num = rol_num;	
	}

	void display(){
		System.out.println("Student Name : "+rol_num+
				", Role Num : "+name);	
	}
	
	public static void main(String[] args) {
		Students st1 = new Students("Miraz", 1);
		st1.display();
		
		Students st2 = new Students("Miraz jr", 2);
		st2.display();
		
		
	}
}
