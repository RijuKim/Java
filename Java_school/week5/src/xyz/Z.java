package xyz;

public class Z extends Y {
	int zi = 30;
	String msg = "I am a Z.";

	void print() {
		System.out.println(msg);
	}

	void play() {
		System.out.println("Play.." + msg);
	}

	void doZ() {
		System.out.println("do something in Z.");
	}

	void test(int i) {
		Z z = new Z();
		Y y = z;
		X x = z;
		z.print();
		y.print();
		super.print();
		play();
		super.play();
		
		System.out.println("\ni = " + i);
		System.out.println("\nzi = " + zi);
		System.out.println("yi = "+ yi); // super 사용 안했도 됨
		System.out.println("xi = "+ xi); //하나의 공간에 있음을 확인, X의 변수를 바로 사용가능함
		System.out.println("this.i = "+this.zi); //this.i = 30
		System.out.println("super.i = "+super.yi); //super.i = 20
		System.out.println("y.i = "+y.yi); //y.i = 20
		System.out.println("x.i = "+x.xi); //x.i = 10
		System.out.println("((Y)this).i = "+((Y)this).yi); //((Y)this).i = 20
		System.out.println("((X)this).i = "+((X)this).xi);


	}
}
