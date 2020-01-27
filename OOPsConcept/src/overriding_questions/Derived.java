package overriding_questions;


class Test 
{ 
	//added comments
    void myMethod() 
    { 
        System.out.println("GeeksforGeeks"); 
    } 
} 
public class Derived extends Test 
{ 
    void myMethod() 
    { 
        System.out.println("GFG"); 
    } 
      
    public static void main(String[] args) 
    { 
        Test object = new Derived(); 
        object.myMethod(); 
    } 
} 