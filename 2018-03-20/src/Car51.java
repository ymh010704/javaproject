
public class Car51 {
	private String model;
	private String color;
	private int speed;	
	//자동차의 번호
	private int id;
	//private static int numbers = 0;인데 오류떠서 바꿈 
	static int numbers = 0; 
	
	public Car51(String m, String c, int s){
		model = m;
		color = c;
		speed = s;
		
		//자동차의 개수를 증가하고 id에 대입한다
		id = ++numbers;
	}
}
