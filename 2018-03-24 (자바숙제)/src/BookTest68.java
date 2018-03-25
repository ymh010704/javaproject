class Book {
	private String title, author;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}

public class BookTest68 {
	public static void main (String[] args) {
		Book b = new Book();
		b.setTitle("data structure");
		b.setAuthor("ȫ�浿");
	}
}
