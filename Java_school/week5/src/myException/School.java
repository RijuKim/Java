package myException;

public class School {

	public static void main(String[] args) {
		Student studentKim = new Student("김리주", 1710541, 3);
		studentKim.addClassSeat("객체지향프로그래밍", 3, 1710541);
		studentKim.showStudentRegistration();
		
		Student studentLee = new Student("이민지", 202011, 2);
		studentLee.addClassSeat("객체지향프로그래밍", 2, 202011);
		
	}

}
