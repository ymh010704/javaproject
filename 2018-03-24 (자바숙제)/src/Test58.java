class A {
	public A(int x) {}
}

class B extends A {}

public class Test58 {
	public static void main(String[] args) {
		A a = new B();
		System.out.println("실행완료");
	}
}
