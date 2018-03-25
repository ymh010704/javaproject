class Parent {
	Parent() {
		System.out.println("Parent");
	}
}

public class Child60 extends Parent {
	public static void main(String[] args) {
		new Child60();
		new Parent();
	}
}
