
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee("이지훈", 35000);
		e1 = new Employee("노말훈", 40000);
		e1 = new Employee("하드훈", 45000);
		
		int n = Employee.getCount();
		System.out.println("현재 직원의 수 = "+n);
	}
}
