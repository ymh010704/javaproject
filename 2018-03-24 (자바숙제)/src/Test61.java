
public class Test61 {
	public static void main(String [] args) {
		Test61 p = new Test61();
		p.sub();
	}
	void sub() {
		boolean b1 = false;
		set(b1);
		System.out.println(b1);
	}
	
	void set(boolean b1) {
		b1 = true;
	}
}
