package basic;

public class ReverseString {

	public static void main(String[] args) {
		String s1="abcdf";
		System.out.println(new StringBuffer(s1).reverse());
		String revS="";
		for(int i=s1.length()-1;i>=0;i--) {
			revS=revS+s1.charAt(i);
		}
		System.out.println(revS);
	}

}
