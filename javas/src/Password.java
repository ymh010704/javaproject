//import java.util.*;
//public class Password {
//	public static void main(String[] args){
//		String s;
//		String id="abcdef";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("���̵� �Է��ϼ��� : ");
//		s = scan.next();
//		if ( s.equalsIgnoreCase(id) )
//			System.out.println("�α����� �����Ͽ����ϴ�");
//		else
//			System.out.println("�α����� �����Ͽ����ϴ�.");
//	}
//}

public class Password {
 
    public static void main(String[] args){
    	String[] members = {"������" , "������", "�ѽ¹�","ȫ��ȣ","��â��","������"};
    	for(int i = 0; i < members.length; i++){
    		String member = members[i];
    		System.out.println("��������"+member+"�Դϴ�");
    	}
    }
}
