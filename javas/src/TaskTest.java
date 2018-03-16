// 돈을 받을때 0이상 숫자 들어와야됨
// SCANNER 클래스로 입력받아와야됨
import java.util.*;

public class TaskTest {
	public static void main(String[] args) {
		String s;
		Scanner scan = new Scanner(System.in);
		Task ta = new Task();
		System.out.println("이름을 입력해주세요 : ");
		ta.setName(scan.next());
		System.out.println("돈을 입력해주세요 : ");
		
		
		
		ta.setMoney(scan.nextInt());
		
		if(ta.getMoney() == 0 ){
			System.out.println("정확한 금액을 입력해주세요! ");
		}else {
		System.out.println("이름은 "+ta.getName()+"입니다.");
		System.out.println("입력 받은 돈은 : " + ta.getMoney() + "원 입니다");
		}
	}
}
