package me.waleeed;

public class Book {
	private String title;
	private String author;
	private int pages;
	
	public Book(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	public Book(Book b) {
		this(b.title, b.author, b.pages);
	}
	
	public int getPages() {
		return pages;
	}
	
	public String toString() {
		return "Book title: " + title + ", author: " + author + ", pages: " + pages;
	}
}
