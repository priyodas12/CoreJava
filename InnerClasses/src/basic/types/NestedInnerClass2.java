package basic.types;

public class NestedInnerClass2 {

	public static void main(String[] args) {
		OuterTwo.Inner in=new OuterTwo().new Inner();
		in.getInfo();

	}

}

class OuterTwo{
	private int a=10;
	static int b=20;
	private void getInfo() {
		System.out.println("printing info from Inner class!"+a+b);
	}
	class Inner{
		private int a=20;
		//we can declare static variable but it should be final.
		static final int k=30;
		//private method can be overridden in nested inner class.
		public void getInfo() {
			System.out.println("printing info from Inner class!"+a+b+k);
			
		}
		
	}

}