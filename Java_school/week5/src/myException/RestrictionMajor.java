package myException;

public class RestrictionMajor extends Exception{
	public RestrictionMajor() {
		super("수강가능 전공이 아닙니다.");
		}
}
