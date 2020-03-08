package basic;

/*When the intern() method is executed then 
 
  	1.it checks whether the String equals to this String Object is in the pool or not.
	2.If it is available, then the string from the pool is returned.
	3.Otherwise, this String object is added to the pool and a reference to this String object is returned.
	4.It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.
*/

public class StringIntern {

	public static void main(String[] args) {
		
		// S1 refers to Object in the Heap Area  
		//it will create two objects and pointing to the heap area created object
		String s1 = new String("ABC"); 
  
        // S2 refers to Object in SCP Area 
		//it will refer to the object which is in the SCP 
        String s2 = s1.intern();  
		
          
        // Comparing memory locations 
        // s1 is in Heap 
        // s2 is in SCP 
       System.out.println(s1 == s2); //FALSE
          
        // Comparing only values 
       System.out.println(s1.equals(s2)); //TRUE
          
        // S3 refers to Object in the SCP Area  
        String s3 = "ABC"; // Line-3  
  
        System.out.println(s2 == s3); //TRUE

	}

}
