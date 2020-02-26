package basic;

public class StringBufferUsecase {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("abc");
		StringBuffer s2=new StringBuffer("abc");
		
		
		//StringBuffer will not overrides equals mthod internally.
		System.out.println(s1.equals(s2)?"equal":"!equal");
		
		s1.append(true);
		System.out.println(s1);//Mutable
		
		
	}

}
