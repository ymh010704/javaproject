
public class Animal {
	private double weight; // ����
	String picture;

	void eat() {
		System.out.println("eat()�� ȣ��Ǿ���");
	}

	void sleep() {
		System.out.println("sleep()�� ȣ��Ǿ���");
	}
	
	void hunt() {
		System.out.println("hunt()�� ȣ��Ǿ���");
	}
	
	void peeDump() {
		System.out.println("peeDump()�� ȣ��Ǿ���");
	}
}

class Lion extends Animal {
	private int legs = 4;

	void roar() {
		System.out.println("roar()�� ȣ��Ǿ���");
	}
}

class Eagle extends Animal {
	private int wings = 2;
	void fly() {
		System.out.println("fly()�� ȣ��Ǿ���");
	}
}
