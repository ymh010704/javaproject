
public class BankAccount {
	private String name; // 이름
	private int bankNumber; // 계좌번호
	private int balance; // 잔액
	private double interRate; // 이자율

	public BankAccount() {
		
	}

	public BankAccount(String name, int bankNumber, int balance, double interRate) {
		this.name = name;
		this.bankNumber = bankNumber;
		this.balance = balance;
		this.interRate = interRate;
	}

	private String getName() { 
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getBankNumber() {
		return bankNumber;
	}

	private void setBankNumber(int bankNumber) {
		this.bankNumber = bankNumber;
	}

	private int getBalance() {
		return balance;
	}

	private void setBalance(int balance) {
		this.balance = balance;
	}

	private double getInterRate() {
		return interRate;
	}

	private void setInterRate(double interRate) {
		this.interRate = interRate;
	}

	
}
