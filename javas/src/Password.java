//import java.util.*;
//public class Password {
//	public static void main(String[] args){
//		String s;
//		String id="abcdef";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("아이디를 입력하세요 : ");
//		s = scan.next();
//		if ( s.equalsIgnoreCase(id) )
//			System.out.println("로그인이 성공하였습니다");
//		else
//			System.out.println("로그인이 실패하였습니다.");
//	}
//}

public class Password {
 
    public static void main(String[] args){
    	String[] members = {"윤민혁" , "양정현", "한승민","홍승호","이창선","김태훈"};
    	for(int i = 0; i < members.length; i++){
    		String member = members[i];
    		System.out.println("도제반은"+member+"입니다");
    	}
    }
}
