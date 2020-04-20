package basic;

/*	Why Immutablility??
 
 	1.Thread safety
	2.Heap that is managed by Java itself (differently to ordinary heap that is Garbage Collected in different manner)
	3.Memory management
	
	In the String constant pool, a String object is likely to have one or many references.
	If several references point to same String without even knowing it,
	it would be bad if one of the references modified(like concat ,not like reassigning) that String value. 
	That's why String objects are immutable.
	
	what if someone overrides the functionality of String class? 
	That's the reason that the String class is marked final so 
	that nobody can override the behavior of its methods.
*/
public class Immutable {

	public static void main(String[] args) {
		String s1="abc";//immutable
		s1.concat("def");
		System.out.println("String: "+s1);
		
		StringBuffer sb=new StringBuffer("abc");//mutable
		sb.append("def");
		System.out.println("StringBuffer: "+sb);
	}

}
