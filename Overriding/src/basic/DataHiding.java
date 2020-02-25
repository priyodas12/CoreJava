package basic;
//static method implementation in child class,
public class DataHiding {

	public static void main(String[] args) {
		Shape4 s1=new Shape4();
		Shape4 s2=new Rectriangle4();
		Rectriangle4 s3=new Rectriangle4();
		
		s1.printShape();
		s2.printShape();
		s3.printShape();
	}

}


class Shape4 {
	public static void printShape() {
		System.out.println("Default Shape!");
	}
}

class Rectriangle4 extends Shape4 {
	public static void printShape() {
		System.out.println("Rectriangle Shape!");
	}
	
}
