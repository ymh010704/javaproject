import java.util.*;
public class AccountTest {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Account ac = new Account();
		
		System.out.println("�̸��� �Է����ּ��� : ");
		ac.setName(scan.next());
		
		System.out.println("�ܾ��� �Է����ּ��� : ");
		ac.setMoney(scan.nextInt());
		
		if(ac.getMoney() == 0){
			System.out.println("ERROR : ��Ȯ�� �ݾ��� �Է����ּ���");
		}else{
		System.out.println("������ �̸��� "+ac.getName()+",\n������ �ܾ��� "+ac.getMoney()+"�� �Դϴ�.");
		}
	}
}
