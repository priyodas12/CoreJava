package interface_changes;

public class Child implements Parent1, Parent2 {

	@Override
	public void m1() {
		// implementation

	}

	@Override
	public void m2() {
		
		//way to call default method in implementation class,no idea of diamond problem;
		Parent1.super.m2();
		Parent2.super.m2();
	}
	
	public static void main(String[] args) {
		//standard way to call interface static method.
		Parent1.m3();
		Child c=new Child();
		c.m2();
		
	}

}
