package basic;

/*	Why Immutablility??
 	Thread safety
	Security
	Heap that is managed by Java itself (differently to ordinary heap that is Garbage Collected in different manner)
	Memory management
*/
public class Immutable {

	public static void main(String[] args) {
		String s1="abc";
		s1.concat("def");
		System.out.println(s1);//abc
	}

}
