
class Plane {
	private String company; // 제작사
	private String model; // 모델
	private int maxPassenger; // 최대 승객 수
	public static int planes; // 비행기 개수를 알려주는거

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxPassenger() {
		return maxPassenger;
	}

	public void setMaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}
	
	public static int getPlanes() {
		return planes;
	}
	
	public Plane(){
		planes++;
	}
	
	public Plane(String company, String model, int maxPassenger) {
		this.company = company;
		this.model = model;
		this.maxPassenger = maxPassenger;
		planes++;
	}
	
	
	
}

public class PlaneTest {
	public static void main(String[] args) {
		Plane plane1 = new Plane("Airbus","A380",500);
		Plane plane2 = new Plane();
		
		System.out.println("현재까지 생산된 비행기의 개수는 : "+Plane.getPlanes());
	}
}
