
public class Employee {
	private String name;
	private double salary;

	private static int count = 0; // ���� ����
	// ������
	public Employee (String n, double s){
		name = n;
		salary = s;
		count++; // ���� ������ count���� ���� // count == ���� ��
	}
	//��ü�� �Ҹ�� �� ȣ��ȴ� //���� ¥���� ��� ?? 
	protected void finalize(){
		count--; // ���� ������ count���� ����
	}
	//���� �޼ҵ�
	public static int getCount(){
		return count;
	}
}
