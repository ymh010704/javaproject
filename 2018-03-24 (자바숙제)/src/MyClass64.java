
public class MyClass64 {
	private String getName() {
		return "MyClass";
	}
	public static String getClassName() {
		return getName();
	}
}
//정적 메소드  getStringName()에서 인스턴스 메소드 getName()을 호출 할 수 없다.
