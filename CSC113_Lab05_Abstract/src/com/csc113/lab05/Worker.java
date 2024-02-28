package com.csc113.lab05;

public abstract class Worker {
	protected String name;
	protected int age;
	
	public Worker(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract double getMonthlyPay();
	
	public boolean equals(Worker w) {
		return true;
	}
	
	public String toString() {
		return "Worker: "+name+", age: "+age;
	}
}
