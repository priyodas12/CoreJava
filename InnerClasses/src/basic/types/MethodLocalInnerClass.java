package basic.types;

public class MethodLocalInnerClass {

	public static void main(String[] args) {
		OuterOne ou=new OuterOne();
		ou.getInfo();
	}

}

/*
 * printing info from Inner class!1020
 * printing info from Inner class!202030
*/
class OuterOne{
	int a=10;
	static int b=20;
	public void getInfo() {
		System.out.println("printing info from outer class!"+a+b);
		class InnerOne{
			//private int a=20;
			//we can declare static variable but it should be final.
			static final int k=30;
			public void getInfo() {
				System.out.println("printing info from Inner class!"+a+b+k);
			
			}
		}
		InnerOne in=new InnerOne();
		in.getInfo();
	}
	

}
