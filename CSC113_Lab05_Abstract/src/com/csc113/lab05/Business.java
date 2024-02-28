package com.csc113.lab05;

public class Business {
	private String name;
	private Worker[] workers;
	private int workerCount;
	
	public Business(String name) {
		this.name = name;
		this.workers = new Worker[15];
		this.workerCount = 0;
	}
	
	public boolean hireWorker(Worker w) {
		if(workerCount >= workers.length) return false;
		for(int i = 0; i < workerCount; i++) {
			if(w.name.equalsIgnoreCase(workers[i].name))
				return false;
		}
		workers[workerCount++] = w;
		return true;
	}
	
	public double getTotalMonthlyPay() {
		double total = 0;
		for(int i = 0; i < workerCount; i++) {
			total += workers[i].getMonthlyPay();
		}
		return total;
	}
	
	public double getAverageHours() {
		double totalhours = 0;
		int HourlyWorkerCount = 0;
		for(int i = 0; i < workerCount; i++) {
			if (workers[i] instanceof HourlyWorker) {
				totalhours += ((HourlyWorker) workers[i]).getHours();
				HourlyWorkerCount++;
			}
		}
		return (totalhours / HourlyWorkerCount);
	}
	
	public String toString() {
		String c = "";
		for(int i = 0; i < workerCount; i++) {
			Worker Checker = workers[i];
			if (Checker instanceof HourlyWorker) {
				c += Checker.toString() + "\n";
			}
			if (Checker instanceof IncomeWorker) {
				c += Checker.toString() + "\n";
			}
		}
		return "Business " + name + "("+workerCount+")\n" + c;
	}
 }
