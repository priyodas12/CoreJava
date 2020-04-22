package basic;

public class AllSubStrings {

	public static void main(String[] args) {
		String s1="abcdfg";
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" "+ s1.substring(j,i+1));
			}
		}
	}

}
