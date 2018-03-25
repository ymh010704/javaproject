
public class Outer62 {
	class Inner { }
}

class Test7{
	public static void main(String[] args) {
		Outer62 f = new Outer62();
		Outer62.Inner b = f.new Inner();
	}
}
