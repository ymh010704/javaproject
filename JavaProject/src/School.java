
public class School {
	String schoolName;
	String major;
	
	void print(){
		System.out.println("학교 이름 : " +schoolName+ " , 학과는 : " + major+"가 있습니다" );
	}
}

class Place {
	int schoolOffice;
	int adminOffice;
	int pressRoom;
	int classRoom;
	
	void print2(){
		System.out.println("교무실은 총 "+schoolOffice+"개가 있고, 행정실은 총 "+adminOffice+"개가 있고, 인쇄실은 총 "+pressRoom+"개가 있고, 교실은 총 "+classRoom+"개가 있습니다");
	}
}

class Student {
	int students;
	int autoStudents;
	int webStudents;
	
	void print3(){
		System.out.println("학생 수는 총 "+students+"명이 있고, 자동차과 학생 수는 약 "+autoStudents+"명이 있고, 웹과 학생 수는 약 "+webStudents+"명이 있습니다" );
	}
}