
public class Test63 {
	public static void main (String[] args) {
		Object obj = new Object() {
			public boolean equlas(Object obj) {
				return true;
			}
		};
		System.out.println(obj.equals("Hello"));
	}
}
