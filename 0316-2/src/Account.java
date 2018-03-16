// 돈을 받을때 0이상 숫자 들어와야됨
// SCANNER 클래스로 입력받아와야됨
public class Account {

	private String name;
	private int money;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if (money > 0) {
			this.money = money;
		}
	}
}
