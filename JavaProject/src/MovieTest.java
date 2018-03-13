
public class MovieTest {
	public static void main(String[] args){
		Movie m = new Movie();
		
		m.title = "Love, Simon";
		m.genre = "Comedy , Drama , Romance";	
		m.year = 2018;
		m.month = "March";
		m.day = 16;
		m.director = "Greg Berlanti";
		m.writers = "Elizabeth Berger , Isaac Aptaker , Becky Albertalli";
		m.stars = "Nick Robinson , Josh Duhamel , Jennifer Garner , Katherine Langford , Alexandra Shipp ";	
		m.age = 15;
		m.time = "1h 49min";
		m.rating =(float)7.5;
		m.country = "USA";
		m.print();
	}
}
