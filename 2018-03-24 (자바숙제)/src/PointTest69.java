class Point {
	int x, y;
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void print() {
		System.out.println("("+x+","+y+")");
	}
}
public class PointTest69 {
	public static void main(String[] args) {
		Point p = new Point();
		p.set(10, 10);
		p.print();
	}
}
