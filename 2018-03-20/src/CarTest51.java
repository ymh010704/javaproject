
public class CarTest51 {
	public static void main(String args[]) {
		Car51 c1 = new Car51("S600", "white", 100); // 첫번째 생성자 호출
		Car51 c2 = new Car51("E400", "red", 50);	// 첫번째 생성자 호출
		
		int n = Car51.numbers; //정적 변수
		System.out.println("지금까지 생성된 자동차 수 = "+ n);
	}
}
