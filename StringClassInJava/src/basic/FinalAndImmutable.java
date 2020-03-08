package basic;

public class FinalAndImmutable {

	public static void main(String[] args) {
		//StringBuffer is mutable,here variable sb is final;
		final StringBuffer sb = new StringBuffer("Hello"); 
		  
        // Even though reference variable sb is final We can perform any changes 
        sb.append("\tworld!"); 
  
        System.out.println(sb); 
        //here below will get compilation error;
        //sb=new StringBuffer("abc");
        
        //String class is final and immutable
        final String s1="immutable";
        //here below will get compilation error;
        //s1="abc";
        s1.concat("!"+s1);
        System.out.println(s1);

	}

}
