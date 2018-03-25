class Employee {
	private String name;
	private int tel;
	private int sal;

	public void setName(String n) {
		name = n;
	}

	public void setTel(int t) {
		tel = t;
	}

	public void setSal(int s) {
		sal = s;
	}

	public String getName() {
		return name;
	}

	public int getTel() {
		return tel;
	}

	public int getSal() {
		return sal;
	}

}

public class EmployeeTest70 {
	public static void main(String[] args) {
		Employee em = new Employee();
	}
}
