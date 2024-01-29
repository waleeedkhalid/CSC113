package com.csc113.lab01;

public class Contact {
	private String name;
	private String number;
	private String email;
	private String address;
	private static int count;
	
	
	public Contact(String n, String n2, String e, String a) {
		this.name = n;
		this.number = n2;
		this.email = e;
		this.address = a;
		count++;
	}
	
	public void setEmail(String e) {
		this.email = e;
		System.out.println("Enter new email address for " + name + ": " + e);
	}
	
	public static int getCount() {
		return count;
	}
	
	public String toString() {
		return name + " | " + number + " | " + email + " | " + address;
	}
	
}
