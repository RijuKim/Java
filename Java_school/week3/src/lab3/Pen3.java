package lab3;

public class Pen3 { // overloading

	String vender;
	String color;
	int price;

	public Pen3() {
	}

	public Pen3(String name) {
		vender = name;
	}

	public Pen3(String name, String col, int pp) {
		vender = name;
		color = col;
		price = pp;
	}

	void write() {
		System.out.println("Pen: write()");
		System.out.print("Pen Vender: " + vender);
		System.out.print(", Pen Color: " + color);
		System.out.println(", Pen PRice: " + price);
	}

	void write(int xx) {
		System.out.println("Pen: write(int xx)");
		System.out.print("Pen Vender: " + vender);
		System.out.print(", Pen Color: " + color);
		System.out.println(", Pen Price: " + xx);
	}

	void write(int xx, String yy) {
		System.out.println("Pen: write(int, String)");
		System.out.print("Pen Vender: " + yy);
		System.out.print(", Pen Color: " + color);
		System.out.println(", Pen Price: " + xx);
	}

	void write(int xx, String yy, String zz) {
		System.out.println("Pen: write(int, string, string)");
		System.out.print("Pen Vender: " + yy);
		System.out.print(", Pen Color: " + zz);
		System.out.println(", Pen Price: " + xx);
	}

	void erase() {
		System.out.println("Pen: erase()");
	}

}