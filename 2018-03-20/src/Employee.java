
public class Employee {
	private String name;
	private double salary;

	private static int count = 0; // 정적 변수
	// 생성자
	public Employee (String n, double s){
		name = n;
		salary = s;
		count++; // 정적 변수인 count수를 증가 // count == 직원 수
	}
	//객체가 소멸될 때 호출된다 //직원 짜를때 사용 ?? 
	protected void finalize(){
		count--; // 정적 변수인 count수를 감소
	}
	//정적 메소드
	public static int getCount(){
		return count;
	}
}
