package me.waleeed;

import java.util.Scanner;

public class LibraryTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Library L = null;
		boolean codedone = false;
		System.out.println("Enter the name of the library: ");
		String name = input.next();
		System.out.println("Enter the size of the library: ");
		int size = input.nextInt();
		
		while(!codedone) {
			try {
				L = new Library(name, size);
				codedone = true;
			} catch (NegativeArraySizeException e) {
				System.out.println(e.getMessage());
				System.out.println("Enter the size of the library: ");
				size = input.nextInt();
			}
		}
		
		L.addBook(new Book("The Clouds", "Aristophanes", 194));
		L.addBook(new Book("The Republic", "Plato", 416));
		L.addBook(new Book("The Categories", "Aristotle", 48));		
		System.out.println(L.toString());
		
		while(codedone) {
			try {
				System.out.println("Enter index: ");
				int index = input.nextInt();
				System.out.println(L.getBookAt(index).toString());
				codedone = false;
			} catch (InvalidIndexException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
