class Dice {
	private int face;
	int roll() {
		int face = (int)(Math.random() * 6) + 1;
		return face;
	}
}

public class DiceTest69 {
	public static void main (String[] args) {
		Dice dice = new Dice();
		System.out.println("�ֻ��� ���� : " +dice.roll());
	}
}
