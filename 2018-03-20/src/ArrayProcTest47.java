
public class ArrayProcTest47 {
	final static int STUDENTS = 5;

	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		ArrayProc47 obj = new ArrayProc47();
		obj.getValues(scores);
		System.out.println("����� = " + obj.getAverage(scores));
	}
}
