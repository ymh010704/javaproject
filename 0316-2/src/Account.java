// ���� ������ 0�̻� ���� ���;ߵ�
// SCANNER Ŭ������ �Է¹޾ƿ;ߵ�
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
