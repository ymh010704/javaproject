
public class AccountTest {
	public static void main(String[] args) {
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		obj.setCode("Hacking");
		System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance() + " 비밀 코드는 "+obj.getCode()+" 입니다");
	}
}
// 돈을 받을때 0이상 숫자 들어와야됨
// SCANNER 클래스로 값을 입력받아와야됨