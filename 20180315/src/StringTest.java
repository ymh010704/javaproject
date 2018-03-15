import java.util.Scanner;

public class StringTest {
	public static void main(String a[]){
		String str;
		Scanner sc = new Scanner(System.in);
		while (true){
			System.out.print("문자열을 입력하세요 >");
			str = sc.next();
			if (str.equals("quit") == true )
				break;
			if (str.matches("^www\\.(.+)")){
				System.out.print(str + " 은 'www'로 시작합니다.");
			} else {
				System.out.print(str + " 은 'www'로 시작하지 않습니다" );
			}
		}
	}
}
