package basic;

public class Equality {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		String s3=new String("abc");
		String s4=new String("abc");
		//reference will be compared.
		System.out.println(s1==s2?"s1==s2":"s1!=s2");
		System.out.println(s1==s3?"s1==s3":"s1!=s3");
		System.out.println(s3==s4?"s3==s4":"s3!=s4");
		//String class overrides equals method and by default it will check content 
		System.out.println(s1.equals(s2)?"equal":"!equal");
		System.out.println(s1.equals(s3)?"equal":"!equal");
		System.out.println(s3.equals(s4)?"equal":"!equal");
		
	}

}
