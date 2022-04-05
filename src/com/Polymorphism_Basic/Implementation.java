package com.Polymorphism_Basic;

public class Implementation {
	public static void main(String[] args) {
		MySelf self = new MySelf();
		MySelf friends = new Friends();
		MySelf family = new Family();
	
		self.communication();
		friends.communication();
		family.communication();
		
	}

}
