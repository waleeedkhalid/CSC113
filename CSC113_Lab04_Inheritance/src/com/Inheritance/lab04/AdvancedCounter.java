package com.Inheritance.lab04;

public class AdvancedCounter extends Counter{
	private int amount;
	
	public AdvancedCounter(int c, int amount) {
		super(c);
		this.amount = amount;
	}
	
	public void increment() {
		counter+=amount;
	}
	
	public String toString() {
		return "- Counter: " + counter + " Type: Advanced, " + "Amount: " + amount;
	}
}
