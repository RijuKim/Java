package week5;

public class School {
	Teacher yiyoon;
	Members kim, song, choi, lee;
	Members students[];

	public School() {
		yiyoon = new Teacher("Yoon", 10313, "IT공학전공");
		kim = new Members("kim", 200324, "IT공학전공");
		song = new Members("song", 190324, "IT공학전공");
		choi = new Members("choi", 180324, "IT공학전공");

		students = new Members[4];
		students[0] = yiyoon;
		students[1] = kim;
		students[2] = song;
		students[3] = choi;
	}

	public void makeWork() {
		int n = students.length;
		for (int i = 0; i < n; i++) {
			students[i].work();
		}
	}

	public static void main(String[] args) {
		School mycom = new School();
		mycom.makeWork();
	}
}
