
public class Car52 {
	private String model;
	private String color;
	private int speed;
	// �ڵ��� ��ȣ
	private int id;
	// ��üȭ �� Car ��ü�� ������ ���� ���� ����
	private static int numbers = 0;

	public Car52(String m, String c, int s){
		model = m;
		color = c;
		speed = s;
		//�ڵ����� ������ �����ϰ� id�� �����Ѵ�.
		id = ++numbers;
	}
	public static int getNumberOfCars(){
		return numbers;
	}
}
