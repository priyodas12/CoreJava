package basic;

public class AllSubStrings {

	public static void main(String[] args) {
		String s1="abcdfg";
		for(int i=0;i<s1.length();i++) {
			for(int j=i;j<s1.length();j++) {
				System.out.print(" "+s1.substring(i, j));
			}
		}

	}

}
