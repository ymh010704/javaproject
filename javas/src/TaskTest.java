// ���� ������ 0�̻� ���� ���;ߵ�
// SCANNER Ŭ������ �Է¹޾ƿ;ߵ�
import java.util.*;

public class TaskTest {
	public static void main(String[] args) {
		String s;
		Scanner scan = new Scanner(System.in);
		Task ta = new Task();
		System.out.println("�̸��� �Է����ּ��� : ");
		ta.setName(scan.next());
		System.out.println("���� �Է����ּ��� : ");
		
		
		
		ta.setMoney(scan.nextInt());
		
		if(ta.getMoney() == 0 ){
			System.out.println("��Ȯ�� �ݾ��� �Է����ּ���! ");
		}else {
		System.out.println("�̸��� "+ta.getName()+"�Դϴ�.");
		System.out.println("�Է� ���� ���� : " + ta.getMoney() + "�� �Դϴ�");
		}
	}
}
