package week5;

public class Teacher extends Members {
	String dept;
	Members teachers[];

	public Teacher(String name, int idnum, String dept) {
		super(name, idnum, dept);
		this.dept = dept;
	}

	public void setStudents(Members sub[]) {
		teachers = sub;
	}

	public void work() {
		System.out.println(
				"Teacher: \"" + name + "(ID:" + id + ")" + "\" teachers with his students in "
		+ dept + " dept.");
	}
}
