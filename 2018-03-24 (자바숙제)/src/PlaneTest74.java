class Plane {
	private int num, p_num;
	private String model;
	private static int planes;

	public void setNum(int num) {
		num = num;
	}

	public void setPnum(int pnum) {
		p_num = pnum;
	}

	public void setModel(String model) {
		model = model;
	}

	public int getNum() {
		return num;
	}

	public int getPnum() {
		return p_num;
	}

	public String getModel() {
		return model;
	}

	public static void setPlanes(int planes) {
		planes = planes;
	}

	public static int getPlanes() {
		return planes;
	}

	public Plane() {
	}

	public Plane(int num, String model, int pnum) {
		num = num;
		model = model;
		p_num = pnum;
	}

	public Plane(int num, String model) {
		num = num;
		model = model;
	}

	public String toString() {
		return "½Äº°¹øÈ£ :" + getNum() + "¸ðµ¨ :" + getModel() + "½Â°´ ¼ö :" + getPnum();
	}
}

public class PlaneTest74 {
	public static void main(String[] args) {
		Plane plane1 = new Plane(1, "aa", 200);
		Plane plane2 = new Plane(2, "bb");
		Plane plane3 = new Plane();

		plane1.setPlanes(0);
		plane2.getPlanes();
		plane3.setNum(3);
		plane3.setModel("cc");
		plane3.setPnum(150);
	}
}
