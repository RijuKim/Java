package lab3;

public class PenUser3 {

	public static void main(String[] args) {

		System.out.println("Hello Pen!");

		Pen3 mypenl = new Pen3();
		mypenl.write();
		mypenl.write(10000); // price
		mypenl.write(100, "Red"); // price, color

		Pen3 mypen2 = new Pen3("IT공학과"); // Vender
		mypen2.write();
		mypen2.write(20000); // price
		mypen2.write(30000, "SMU2");

		Pen3 mypen3 = new Pen3("IT공학과", "노란색", 30000);
		mypen3.write();
		mypen3.write(20000); // price
		mypen3.write(3000, "SMU3"); // price, vender
		mypen3.write(3000, "SMU3", "Yello"); // price, vender, color
	}

}
