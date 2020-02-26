package basic;

import java.io.IOException;
//Scope of Checked Exception should be lower in child class.
public class ExceptionOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Shape2 {
	public void printShape() throws ArithmeticException{
		System.out.println("Default Shape!");
	}
	
	public void printInfo() throws IOException{
		System.out.println("Default Shape!");
	}
}

class Trapezium extends Shape2 {
	
	@Override
	public void printShape() throws NullPointerException {
		System.out.println("Trapezium Shape!");
	}
	//will give compilation error,scope should not be widen
//	public void printInfo() throws Exception{
//		System.out.println("Default Shape!");
//	}

}
