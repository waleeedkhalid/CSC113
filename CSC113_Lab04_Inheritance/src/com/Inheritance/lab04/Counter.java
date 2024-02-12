package com.Inheritance.lab04;

public class Counter {
	protected int counter;
	
	public Counter(int c) {
		counter = c;
	}
	
	public void increment() {
	counter++;	
	}
	
	public void reset() {
		counter = 0;
	}
	
	public String toString() {
		return "- Counter: " + counter;
	}
}
