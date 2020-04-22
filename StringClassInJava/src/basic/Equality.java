package basic;
/*
 * String constant pool: part of permgen or method area,its fixed size up to 1.6V
 *                       part of heap only and its expandable from 1.7V*/
public class Equality {

	public static void main(String[] args) {
		//object will be created in string constant pool if the same object does not exist previously
		String s1="abc";
		String s2="abc";
		String s5="a"+"bc";//compile time concatenation will happen only one object will be saved in scp
		//object will be created both in heap and string constant pool
		String s3=new String("abc");
		String s4=new String("abc");
		String s6=new String("a");
		String s7=s6+"bc";
		final String s8=s6+"bc";
		final String s9="a"+"bc";
		//reference will be compared.
		System.out.println(s1==s2?"s1==s2":"s1!=s2");
		System.out.println(s1==s5?"s1==s5":"s1!=s5");
		System.out.println(s1==s7?"s1==s7":"s1!=s7");
		System.out.println(s1==s8?"s1==s8":"s1!=s8");
		System.out.println(s1==s9?"s1==s9":"s1!=s9");
		System.out.println(s1==s3?"s1==s3":"s1!=s3");
		System.out.println(s3==s4?"s3==s4":"s3!=s4");
		//String class overrides equals method and by default it will check content 
		System.out.println(s1.equals(s2)?"equal":"!equal");
		System.out.println(s1.equals(s3)?"equal":"!equal");
		System.out.println(s3.equals(s4)?"equal":"!equal");
		System.out.println(s1.equals(s5)?"equal":"!equal");
		System.out.println(s1.equals(s7)?"equal":"!equal");
		
	}

}
