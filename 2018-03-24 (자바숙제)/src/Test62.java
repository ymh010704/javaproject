
public class Test62 {
	int s;

	public static void main(String[] args) {
		Test62 p = new Test62();
		p.sub();
	}

	void sub() {

		int x = 5;
		setDouble(x);
		System.out.println(x + " ");
		System.out.println(s);
	
	}
	
	void setDouble(int x) {
		x = x*2;
		s = x;
	}
}