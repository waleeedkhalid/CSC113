package com.csc113.lab01;

public class TestContact {
	public static void main(String[] args) {
		System.out.println("Number of created contacts at the start of the program: " + Contact.getCount());
		System.out.println();
		Contact Sara = new Contact("Sara", "0551122", "sara@gmail.com", "Riyadh");
		System.out.println(Sara.toString());
		System.out.println();
		Contact Norah = new Contact("Norah", "0553344", "norah@gmail.com", "Jeddah");
		System.out.println(Norah.toString());
		System.out.println();
		Sara.setEmail("sara@outlook.com");
		System.out.println();
		System.out.println("Number of created contacts at the start of the program: " + Contact.getCount());
		
	}
}
