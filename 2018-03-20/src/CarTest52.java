
public class CarTest52 {
	public static void main(String args[]) {
		Car52 c1 = new Car52("S600", "Blue", 120);
		Car52 c2 = new Car52("R333", "Red", 60);
		int n = Car52.getNumberOfCars(); // Car52 에서 썼던 정적 메소드 호출
		System.out.println("현재까지 생성된 자동차의 갯수  = "+ n);
	}
}
