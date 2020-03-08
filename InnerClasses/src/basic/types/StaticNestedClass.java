package basic.types;
//advantage:No need of outer class to access the inner class method.
public class StaticNestedClass {

	public static void main(String[] args) {
		
	}

}
class OuterThree { 
	   private static void outerMethod1() { 
	     System.out.println("inside outerMethod1"); 
	   } 
	   public  void outerMethod2() { 
		     System.out.println("inside outerMethod2,outer class"); 
	   }
	     
	   // A static inner class 
	   static class Inner { 
		   
		 public void outerMethod2() {
			 System.out.println("inside outerMethod2,static inner class"); 
		 }
	     public static void main(String[] args) { 
	        System.out.println("inside inner class Method"); 
	        outerMethod1();
	        new Inner().outerMethod2();
	        new OuterThree().outerMethod2();
	     } 
	   } 
	  
	}