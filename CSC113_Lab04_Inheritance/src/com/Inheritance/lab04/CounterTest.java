package com.Inheritance.lab04;

public class CounterTest {
	public static void main(String[] args) {
		// Create three objects of type Counter, AdvancedCounter, LimitedCounter
		Counter c = new Counter(0);
		AdvancedCounter ca = new AdvancedCounter(0, 2);
		LimitedCounter cl = new LimitedCounter(0, 3);
		// then print them (see sample run)
		System.out.println(c.toString() + "\n" + ca.toString() + "\n" + cl.toString());
		// Increment the Counter once, then print it
		c.increment();
		System.out.println(c.toString());

		// Increment the LimitedCounter to its limit, print it 
		cl.increment();
		cl.increment();
		cl.increment();
		cl.increment();
		
		System.out.println(cl.toString());
		// reset then print again
		cl.reset();
		System.out.println(cl.toString());
		// Increment the AdvancedCounter twice, then print it
		ca.increment();
		ca.increment();
		System.out.println(ca.toString());
	}
}
