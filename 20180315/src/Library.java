
public class Library { // ������ 
	String borrow; // ����
	String returns; // �ݳ�
	String extension; // �ݳ��Ⱓ ����
	String reservation; // å ����
	String sns; // ������ ���� SNS

}

class Information { // ������ ����
	int open; // ���� �ð�
	int close; // �ݴ� �ð�
	String rest; // ���� ��
	String place; // ��ġ�� ��
	String rule; // ������ �̿� ��Ģ
	
}

class Books{ // å ����
	String category; // å ����
	String title; // å ����
	String writer; // �۾���
	int bookNumber; // å ��ȣ 
	
}

class BooksInformation { // å ���� ����
	String recommendedBook; // �̴��� ��õ ����
	String bestBook; // ����Ʈ å �̸�
	int book; // ��� å ����
	int remainingBooks; //���� å ����
	
}

class Users { // �̿���
	String userId; // �̿��� ���̵�
	String userPassword; // �̿��� ��й�ȣ
	String userName; // �̿��� �̸�
	String borrowedBook; // ���� å
	
}

class People { // ������ �����
	String student; // �л�
	String outSider; // �ܺ���
	int user; // ������ �̿��� ��
	int admin; // ������ ��
	
}