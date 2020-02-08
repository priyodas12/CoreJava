package basic.types;

public class NestedInnerClass {

	public static void main(String[] args) {
		Outer.Inner in=new Outer().new Inner();
		in.getInfo();

	}

}

class Outer{
	private int a=10;
	static int b=20;
	public void getInfo() {
		System.out.println("printing info from Inner class!"+a+b);
	}
	class Inner{
		private int a=20;
		//we can declare static variable but it should be final.
		static final int k=30;
		public void getInfo() {
			System.out.println("printing info from Inner class!"+a+b+k);
		}
		//Compilation Error:static method cannot be written because an inner class is implicitly associated 
		//with an object of its outer class so it cannot define any static method for itself.
//		public static void getLevelInfo() {
//			System.out.println("printing static method info");
//		}
	}

}