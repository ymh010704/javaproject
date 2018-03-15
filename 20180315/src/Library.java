
public class Library { // 도서관 
	String borrow; // 대출
	String returns; // 반납
	String extension; // 반납기간 연장
	String reservation; // 책 예약
	String sns; // 도서관 전용 SNS

}

class Information { // 도서관 정보
	int open; // 오픈 시간
	int close; // 닫는 시간
	String rest; // 쉬는 날
	String place; // 위치한 곳
	String rule; // 도서관 이용 규칙
	
}

class Books{ // 책 정보
	String category; // 책 종류
	String title; // 책 제목
	String writer; // 글쓴이
	int bookNumber; // 책 번호 
	
}

class BooksInformation { // 책 관련 정보
	String recommendedBook; // 이달의 추천 도서
	String bestBook; // 베스트 책 이름
	int book; // 모든 책 개수
	int remainingBooks; //남은 책 개수
	
}

class Users { // 이용자
	String userId; // 이용자 아이디
	String userPassword; // 이용자 비밀번호
	String userName; // 이용자 이름
	String borrowedBook; // 빌린 책
	
}

class People { // 빌리는 사람들
	String student; // 학생
	String outSider; // 외부인
	int user; // 도서관 이용자 수
	int admin; // 관리자 수
	
}