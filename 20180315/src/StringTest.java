import java.util.Scanner;

public class StringTest {
	public static void main(String a[]){
		String str;
		Scanner sc = new Scanner(System.in);
		while (true){
			System.out.print("���ڿ��� �Է��ϼ��� >");
			str = sc.next();
			if (str.equals("quit") == true )
				break;
			if (str.matches("^www\\.(.+)")){
				System.out.print(str + " �� 'www'�� �����մϴ�.");
			} else {
				System.out.print(str + " �� 'www'�� �������� �ʽ��ϴ�" );
			}
		}
	}
}
