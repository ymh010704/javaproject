
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee("������", 35000);
		e1 = new Employee("�븻��", 40000);
		e1 = new Employee("�ϵ���", 45000);
		
		int n = Employee.getCount();
		System.out.println("���� ������ �� = "+n);
	}
}
