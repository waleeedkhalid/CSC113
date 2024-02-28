package com.csc113.lab05;

public class IncomeWorker extends Worker {
	private double income; // yearly
	
	public IncomeWorker(String name, int age, double income) {
		super(name, age);
		this.income = income;
	}

	
	public double getMonthlyPay() {
		return (income / 12);
	}
	
	public String toString() {
		return "Worker: "+name+", age: "+age+", income: " + income;
	}
}
