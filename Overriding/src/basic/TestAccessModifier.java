package basic;

public class TestAccessModifier {
	//always possible public->protected order(child class should have bigger scope)
	public static void main(String[] args) {
		
		Shape s1=new Shape();
		Shape s2=new Rectriangle();
		
		s1.printShape();
		s2.printShape();
	}

}

class Shape {
	protected void printShape() {
		System.out.println("Default Shape!");
	}
	
	private void printInfo() {
		System.out.println("Default Shape!");
	}
}

class Rectriangle extends Shape {
	
	@Override
	public void printShape() {
		System.out.println("Rectriangle Shape!");
	}
	//compilation error(private modifier cannot be overridden)
//	@Override
//	public void printInfo() {
//		System.out.println("Rectriangle Info!");
//	}
}
