
public class School {
	String schoolName;
	String major;
	
	void print(){
		System.out.println("�б� �̸� : " +schoolName+ " , �а��� : " + major+"�� �ֽ��ϴ�" );
	}
}

class Place {
	int schoolOffice;
	int adminOffice;
	int pressRoom;
	int classRoom;
	
	void print2(){
		System.out.println("�������� �� "+schoolOffice+"���� �ְ�, �������� �� "+adminOffice+"���� �ְ�, �μ���� �� "+pressRoom+"���� �ְ�, ������ �� "+classRoom+"���� �ֽ��ϴ�");
	}
}

class Student {
	int students;
	int autoStudents;
	int webStudents;
	
	void print3(){
		System.out.println("�л� ���� �� "+students+"���� �ְ�, �ڵ����� �л� ���� �� "+autoStudents+"���� �ְ�, ���� �л� ���� �� "+webStudents+"���� �ֽ��ϴ�" );
	}
}