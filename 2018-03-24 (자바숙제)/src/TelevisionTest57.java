class Television {
	private String model;

	void setModel(String b) {
		model = b;
	}

	String getModel() {
		return model;
	}
}

public class TelevisionTest57 {
	public static void main(String[] args) {
		Television t = new Television();
		t.setModel("STV-101");
		String b = t.getModel();
	}
}