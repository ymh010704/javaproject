
public class OuterClass {
	private int value = 10;

	class InnerClass {
		public void myMethod() {
			System.out.println("�ܺ� Ŭ������ private ���� �� : " + value);
		}
	}

	OuterClass() {
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}
}
