
class Book {
	private String title; // ����
	private String author; // ����
	private String genre; // �帣
	private String p_house; // ���ǻ�
	private int page; // å ������ ��

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getP_house() {
		return p_house;
	}

	public void setP_house(String p_house) {
		this.p_house = p_house;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	Book(){
		
	}
	
	Book(String title, String author, String genre,String p_house, int page ){
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.p_house = p_house;
		this.page = page;
	}

}
public class BookTest {
	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Books Books");
		book.setAuthor("Yun minhyeok");
		book.setGenre("Comedy");
		book.setP_house("YunYun");
		book.setPage(312);
		
		System.out.println("å�� ������ "+book.getTitle()+" å�� ���ڴ� "+book.getAuthor()+" å�� �帣�� "+book.getGenre()+" å�� ���ǻ�� "+book.getP_house()+" å�� ������ ���� "+book.getPage());
	}
}
