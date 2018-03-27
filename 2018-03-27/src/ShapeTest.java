
class Shape {
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	void print() {
		System.out.println("x ��ǥ : " + x + ", y ��ǥ : " + y);
	}
}

class Triangle extends Shape {
	private int width, height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	double area() { // ���� 
		 return (double)width*height/2;
	}
	
	void draw() {
		System.out.println("("+this.getX()+","+this.getY()+") ��ġ ( �ﰢ�� )" + " ���� : "+width+" ���� : "+height+" ���� :"+area()+"\n");
	}
}

class Rectangle extends Shape {
	private int width, height;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	double area() { // ���� 
		 return (double)width*height;
	}
	
	void draw() {
		System.out.println("("+this.getX()+","+this.getY()+") ��ġ ( �簢�� ) " + " ���� : "+width+" ���� : "+height+" ���� :"+area());
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		
		t.setX(10);
		t.setY(3);
		t.setWidth(30);
		t.setHeight(20);
		
		r.setX(20);
		r.setY(20);
		r.setWidth(30);
		r.setHeight(20);
		
		t.print();
		t.draw();
		r.print();
		r.draw();
	}
}