
public class DateTest {
	public static void main(String[] args){
		Date d = new Date();
		d.year = 2012;
		d.month = 9;
		d.day = 5;
		d.print1();
		
		Date dE = new Date();
		dE.year = 2012;
		dE.month2 = "September";
		dE.day = 5;
		dE.print2();
	}
}
