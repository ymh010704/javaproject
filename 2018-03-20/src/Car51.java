
public class Car51 {
	private String model;
	private String color;
	private int speed;	
	//�ڵ����� ��ȣ
	private int id;
	//private static int numbers = 0;�ε� �������� �ٲ� 
	static int numbers = 0; 
	
	public Car51(String m, String c, int s){
		model = m;
		color = c;
		speed = s;
		
		//�ڵ����� ������ �����ϰ� id�� �����Ѵ�
		id = ++numbers;
	}
}
