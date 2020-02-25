package basic.types;

public class StaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class OuterThree { 
	   private static void outerMethod1() { 
	     System.out.println("inside outerMethod1"); 
	   } 
	   private  void outerMethod2() { 
		     System.out.println("inside outerMethod2"); 
	   }
	     
	   // A static inner class 
	   static class Inner { 
	     public static void main(String[] args) { 
	        System.out.println("inside inner class Method"); 
	        outerMethod1(); 
	        new OuterThree().outerMethod2();
	     } 
	   } 
	  
	}