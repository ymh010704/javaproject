class Single{
	private static Single s_instance;
	public static Single getInstance() {
		if (s_instance == null) {
			s_instance = new Single();
		}
		return s_instance;
	}
}
public class SingleTest67 {
	public static void main(String[] args) {
		Single obj1 = Single.getInstance();
		Single obj2 = Single.getInstance();
	}
}
