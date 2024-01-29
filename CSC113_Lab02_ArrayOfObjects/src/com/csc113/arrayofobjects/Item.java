package com.csc113.arrayofobjects;

public class Item {
	private static int nbItems = 1;
	private int id;
	private String name;
	private double price;
	
	public Item(String name, double price) {
		this.id = nbItems;
		this.name = name;
		this.price = price;
		nbItems++;
	}
	
	public void setPrice(double p) {
		this.price = p;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Item ID: "+ id + ", Name: "+ name + ", Price: "+ price +" SAR";
	}
}
