import java.util.*;
public class AccountTest {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Account ac = new Account();
		
		System.out.println("이름을 입력해주세요 : ");
		ac.setName(scan.next());
		
		System.out.println("잔액을 입력해주세요 : ");
		ac.setMoney(scan.nextInt());
		
		if(ac.getMoney() == 0){
			System.out.println("ERROR : 정확한 금액을 입력해주세요");
		}else{
		System.out.println("고객님의 이름은 "+ac.getName()+",\n고객님의 잔액은 "+ac.getMoney()+"원 입니다.");
		}
	}
}
