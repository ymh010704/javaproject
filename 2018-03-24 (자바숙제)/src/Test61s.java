class Point3 {
	int x;
	int y;
}

public class Test61s {
	public static void main(String[]args) {
		Test61s obj = new Test61s();
		obj.sub();
	}
	void sub() {
		Point3 p = new Point3();
		p.x = 10;
		p.y = 20;
		set(p);
		System.out.println(p.x+","+p.y);
	}
	
	void set(Point3 p) {
		p.x = 30;
		p.y = 40;
	}
}
