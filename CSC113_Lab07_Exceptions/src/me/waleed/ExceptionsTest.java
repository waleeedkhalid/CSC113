package me.waleed;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsTest {
	
	public static int divide(int x, int y) throws ArithmeticException {
		if(y == 0) throw new ArithmeticException("Divison by zero.");
		return x/y;
	}
	
	public static void printInterval(int s, int e) throws IllegalArgumentException {
		if(e < s) throw new IllegalArgumentException("End point is smaller than start point.");
		System.out.print("[");
		for(int i = 0; i <= e-s; i++) {
			if(i == e-s)
				System.out.print((s+i));
			else
				System.out.print((s+i)+", ");
		}
		System.out.print("]");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("Enter the dividend and the divisor:");
				int x = input.nextInt();
				int y = input.nextInt();
				int d = divide(x, y);
				System.out.println(x + " / " + y + " = " + d);
				break;
			} catch (InputMismatchException e) {
				System.out.println("expected an integer.");
				input.nextLine();
			}
			  catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
		
		while(true) {
			try {
				System.out.print("Enter the start and end points:");
				int s = input.nextInt();
				int e = input.nextInt();
				printInterval(s, e);
				break;
			} catch (InputMismatchException e) {
				System.out.println("expected an integer.");
				input.nextLine();
			}
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
