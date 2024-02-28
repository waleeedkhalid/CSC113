package com.csc113.lab05;

public class HourlyWorker extends Worker {
	private double rate;
	private int hours;
	
	public HourlyWorker(String name, int age, double rate, int hours) {
		super(name, age);
		this.rate = rate;
		this.hours = hours;
	}
	
	public double getMonthlyPay() {
		return (rate * hours);
	}
	
	public double getHours() {
		return hours;
	}
	
	public String toString() {
		return "Worker: "+name+", age: "+age+", rate: " + rate + ", hours: "+hours;
	}
}
