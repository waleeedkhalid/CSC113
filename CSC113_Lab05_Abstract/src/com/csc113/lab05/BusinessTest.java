package com.csc113.lab05;

public class BusinessTest {
	public static void main(String[] args) {
		// Create a business
		Business b = new Business("SCIP");
		// Hire 4 workers (see sample run)
		Worker w1 = new IncomeWorker("Saleh", 21, 180000.0);
		Worker w2 = new IncomeWorker("Noor", 22, 120000.0);
		Worker w3 = new HourlyWorker("Jawaher", 23, 80, 160);
		Worker w4 = new HourlyWorker("Faisal", 25, 60, 200);					
		b.hireWorker(w1);
		b.hireWorker(w2);
		b.hireWorker(w3);
		b.hireWorker(w4);
		
		// Print the business
		System.out.println(b.toString());
		// Print the total monthly pay for the business
		System.out.println(b.getTotalMonthlyPay());
		// Print the average hours for hourly workers in the business
		System.out.println(b.getAverageHours());
		
//		Total monthly pay: 49800.0
//		Average hours: 180.0
	}
}
