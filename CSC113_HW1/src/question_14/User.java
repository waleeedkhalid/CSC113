package question_14;

public class User {
	private String name, id;
	private Book[] borrowedBooks;
	private int nbr = 0; // Number Borrowed books;
	
	public User() {
		name = "";
		id = "0";
	}

	public User(String name, String id) {
		this.name = name;
		this.id = id;
		this.borrowedBooks = new Book[3];
	}

	public void setInfo(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public boolean borrowBook(Book b) {
		if(nbr <= 3) {
		borrowedBooks[nbr++] = b; 
		return true;
		}
		
		return false;
	}
	
	public boolean returnBook(Book b) {
		return true;
	}
}
