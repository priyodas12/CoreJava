package basic;
//Return type should be co-variant,scope should be lower or same in child class
public class ReturnTypeOverride {

	public static void main(String[] args) {
		Shape3 s=new Shape3();
		Shape3 s2=new Rectriangle2();
		
		System.out.println(s.getArea());
		System.out.println(s2.getArea());

	}

}

class Shape3 {
	public Number getArea() {
		return 0;
	}
}

class Rectriangle2 extends Shape3 {
	
	@Override
	public Integer getArea() {
		return 100;
	}
	
}

