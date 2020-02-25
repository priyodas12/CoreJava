package basic;

public class StaticOverride {
	//Static , final method cannot be overridden
	//static method are resolved in compile time.
	//final means implementation done.
	public static void main(String[] args) {
		
	}

}

class Shape1 {
	static void printShape() {
		System.out.println("Default Shape!");
	}
	
	public final void printInfo() {
		System.out.println("Default Shape!");
	}
}

class Sqaure extends Shape1 {
	
//  will give compilation error,static method cannot be overridden.	
//	@Override
//	public void printShape() {
//		System.out.println("Rectriangle Shape!");
//	}
	
//	public final void printInfo() {
//		// TODO Auto-generated method stub
//
//	}
	
	
}