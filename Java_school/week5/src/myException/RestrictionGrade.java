package myException;

public class RestrictionGrade extends Exception{
	public RestrictionGrade() {
		super("수강가능 학년이 아닙니다(3학년부터 가능)");
	}
}
