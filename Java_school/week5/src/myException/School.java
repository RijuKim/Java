package myException;

public class School {

	public static void main(String[] args) {
		//학생 김리주의 객체지향프로그래밍 수강신청, 3학년이므로 신청가능
		Student studentKim = new Student("김리주", "IT공학전공", 3, 1710541);
		studentKim.oopRegistration("객체지향프로그래밍", "IT공학전공", 3, 1710541);
		studentKim.showStudentRegistration();
		
		//학생 이민지의 객체지향프로그래밍 수강신청, 1학년이므로 신청 불가능 
		Student studentLee = new Student("이민지", "IT공학전공", 1, 222011);
		studentLee.oopRegistration("객체지향프로그래밍", "IT공학전공", 1, 222011);
		studentLee.showStudentRegistration();
		
		//학생 박지윤의 객체지향프로그래밍 수강신청, 타 전공이므로 신청불가능
		Student studentPark = new Student("박지윤", "통계학과", 2, 201422);
		studentPark.oopRegistration("객체지향프로그래밍","통계학과" , 2, 201422);				
		studentPark.showStudentRegistration();
		
		//학생 조은서의 객체지향프로그래밍 수강신청, 2학년이므로 신청가능
		Student studentJo = new Student("조은서","IT공학전공", 2, 2110541);
		studentJo.oopRegistration("객체지향프로그래밍","IT공학전공", 2, 2110541);	
		studentJo.showStudentRegistration();

	}

}
