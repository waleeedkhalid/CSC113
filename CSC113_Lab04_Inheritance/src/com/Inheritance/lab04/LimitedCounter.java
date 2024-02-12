package com.Inheritance.lab04;

public class LimitedCounter extends Counter{
	private int limit;
	
	public LimitedCounter(int count, int limit) {
		super(count);
		this.limit = limit;
	}
	
	public void increment() {
		if(counter >= limit) {
			System.out.println("limit has been reached");
			return;
		}
		counter++;
		if(counter == limit) {
			System.out.println("Reached limit, cannot increment anymore.");
		}
	}
	
	public String toString() {
		return "- Counter: " + counter + " Type: Limited, " + "Limit: " + limit;
	}
}
