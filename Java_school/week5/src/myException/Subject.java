package myException;

public class Subject {
	private String subjectName;
	private String subjectMajor;
	private int subjectGrade;
	private int seatNum;
	
	public Subject() {} //디폴트 생성자
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public int getSubjectGrade() {
		return subjectGrade;
	}

	public void setSubjectGrade(int subjectGrade) {
		this.subjectGrade = subjectGrade;
	}
	
	public int getSeatNum() {
		return seatNum;
	}
	
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public String getSubjectMajor() {
		return subjectMajor;
	}

	public void setSubjectMajor(String subjectMajor) {
		this.subjectMajor = subjectMajor;
	}
	
}
