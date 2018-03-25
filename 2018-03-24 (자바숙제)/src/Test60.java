
public class Test60 {
	public static void main(String args[]) {
		class MyClass{
			public int i = 3;
		}
		Object o = (Object)new MyClass();
		MyClass obj = (MyClass)o;
		System.out.println("i = "+obj.i);
	}
}
