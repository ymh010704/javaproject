import java.util.*;
public class ConVo {
	public static void main(String[] args){
		String s;
		char s2;
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		
		s = scan.next();
		for(int i = 0; i < s.length(); i++){
			s2 = s.charAt(i);
//			if(s2 >= 'A' && s2 <= 'Z'){
//				count1++;
//			}else if(s2 >= 'a' && s2 <= 'z'){
//				count2++;
//			}else if(s2 >= '0' && s2 <= '9'){
//				count3++;		
//			}else{ 
//				count4++;
//			}
			if ( s2 >= 'A' && s2 <='Z'){
				count1++;
				if(s2 >= 'a' && s2 <= 'z'){
					count2++;
					if(s2 >= '0' && s2 <= '9'){
						count3++;
					}else{
						count4++;
					}
				}
			}
		}
			
			
		System.out.println("�빮���� ���� : " + count1);
		System.out.println("�ҹ����� ���� : " + count2);
		System.out.println("������ ���� : " + count3);
		System.out.println("Ư������ ���� : " + count4);
	}
}
// �빮�� �ҹ��� ���� ���� ���ϱ� a