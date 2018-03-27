
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
	private boolean travel; // 여행이 가능하다

	public boolean getTravel() {
		return travel;
	}

	public void setTravel(boolean travel) {
		this.travel = travel;
	}
}


class Truck extends Vehicle {
	private int freight; // 화물 운반 가능 + 운반 최대 무게

	public int getFreight() {
		return freight;
	}

	public void setFreight(int freight) {
		this.freight = freight;
	}

}


class Bus extends Vehicle {
	private int person; // 많은 승객을 태울 수 있음

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}
}
