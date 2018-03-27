
public class Vehicle {
	private int setSpeed, turn;

	public int getSetSpeed() {
		return setSpeed;
	}

	public void setSetSpeed(int setSpeed) {
		this.setSpeed = setSpeed;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public Vehicle() {
		setSpeed = 0;
		turn = 0;
	}

	public Vehicle(int setSpeed, int turn) {
		this.setSpeed = setSpeed;
		this.turn = turn;
	}

}


class Car extends Vehicle {
	private boolean travel; // ������ �����ϴ�

	public boolean getTravel() {
		return travel;
	}

	public void setTravel(boolean travel) {
		this.travel = travel;
	}
}


class Truck extends Vehicle {
	private int freight; // ȭ�� ��� ���� + ��� �ִ� ����

	public int getFreight() {
		return freight;
	}

	public void setFreight(int freight) {
		this.freight = freight;
	}

}


class Bus extends Vehicle {
	private int person; // ���� �°��� �¿� �� ����

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}
}
