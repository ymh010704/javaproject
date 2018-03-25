
public class Test59 {
	void sub() {
		int[] a1 = { 3, 4, 5 };
		int[] a2 = modify(a1);
		System.out.println(a1[0] + " " + a1[1] + " " + a1[2]);
		System.out.println(a2[0] + " " + a2[1] + " " + a2[2]);
	}

	int[] modify(int[] a3) {
		a3[1] = 10;
		return a3;

	}

	public static void main(String[] args) {
		Test59 p = new Test59();
		p.sub();
	}
}
