package basic.types;



class OuterFour { 
	   void show() { 
	      System.out.println("i am in show method of super class"); 
	   } 
	} 
class AnnonymousInnerClass { 
	     //  An anonymous class with OuterFour as base class 
		static OuterFour o = new OuterFour() { 
	       void show() { 
	           super.show(); 
	           System.out.println("i am in OuterFour based Annonymous class"); 
	       } 
		}; 
	   public static void main(String[] args){ 
	       o.show(); 
	} 
}