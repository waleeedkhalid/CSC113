package me.waleeed;

public class Library {
	private String name;
	private Book[] books;
	private int nbBooks;
	
	public Library(String name, int size) throws NegativeArraySizeException {
		this.name = name;
		if(size < 0) throw new NegativeArraySizeException("Array size is negative");
		this.books = new Book[size];
		this.nbBooks = 0;
	}
	
	public boolean addBook(Book b) {
		if(nbBooks >= books.length) return false;
		
		 books[nbBooks++] = new Book(b);
		 return true;
	}
	
	public Book getBookAt(int index) throws InvalidIndexException {
		if(index >= nbBooks || index < 0) throw new InvalidIndexException(index + " is out of range.");
		return books[index];
	}
	
	public String toString() {
		String LibrarytoString = "Library " + name + "("+nbBooks+") \n";
		for(int i = 0; i < nbBooks; i++) 
			LibrarytoString += " -" + books[i].toString() + " \n";
		return LibrarytoString;
	}
}
