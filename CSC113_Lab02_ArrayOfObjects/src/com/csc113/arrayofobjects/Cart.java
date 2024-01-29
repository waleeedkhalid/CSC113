package com.csc113.arrayofobjects;

public class Cart {
	private Item[] items;
	private int ItemCount;
	
	public Cart(int cartsize) {
		items = new Item[cartsize];
	}
	
	public boolean addItem(Item item) {
		if(items.length <= ItemCount) return false; // Cart is Full
		items[ItemCount] = item;
		ItemCount++;
		return true;
	}
	
	public double getTotal() {
		double sum = 0;
		for(int i = 0; i < ItemCount; i++) {
			sum+= items[i].getPrice();
		}
		return sum;
	}
	
	public String toString() {
		String carttoString = "";
		for(int i = 0; i < ItemCount; i++) {
			carttoString += items[i].toString() + "\n";
		}
		return carttoString;
	}
}
