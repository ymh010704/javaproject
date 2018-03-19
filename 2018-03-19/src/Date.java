
public class Date {
	private int year;
	private String month;
	private int day;

	public Date() { // �⺻������
		this(1900, "1��", 1);
	}

	public Date(int year) { // ������
		this(year,"1��",1);
	}
	
	public Date(int year, String month, int day){ //������
		this.month = month; //this�� ���� ��ü�� ����Ų��.
		this.day = day;
		this.year = year;
	}
	
	@Override
	public String toString(){
		return "Date [ year = "+year+", month = "+month+", day = "+day+" ]";
	}
}
