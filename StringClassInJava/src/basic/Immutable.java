package basic;

/*	Why Immutablility??
 
 	1.Thread safety
	2.Heap that is managed by Java itself (differently to ordinary heap that is Garbage Collected in different manner)
	3.Memory management
*/
public class Immutable {

	public static void main(String[] args) {
		String s1="abc";
		String s2=s1;
		s2.concat("def");
		System.out.println(s1);//abc
	}

}
