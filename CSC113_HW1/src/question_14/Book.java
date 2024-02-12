package question_14;

public class Book {
	private String title, desc, ISBN, barCode;

	public Book(String title, String desc, String ISBN, String barCode) {
		this.title = title;
		this.desc = desc;
		this.ISBN = ISBN;
		this.barCode = barCode;
	}
	
	public Book(Book b) {
		this.title = b.title;
		this.desc = b.desc;
		this.ISBN = b.ISBN;
		this.barCode = b.barCode;
	}
	
}
