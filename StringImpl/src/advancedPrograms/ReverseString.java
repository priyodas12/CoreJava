package advancedPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		//step 1:
		String s1=new String("abcdfg");
		String revS1="";
		for(int i=s1.length()-1;i>=0;i--) {
			revS1+=""+s1.charAt(i);
		}
		System.out.println(s1+" to reverse "+revS1);
		
		//step 2:
		String s2=new String("abcdfg");
		StringBuffer sb=new StringBuffer(s2);
		sb.reverse();
		System.out.println(s2+" to reverse "+sb);
		
		//step 3:
		String s3=new String("abcdfg");
		String revS2="";
		char [] ch=s3.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			revS2+=""+ch[i];
		}
		System.out.println(s3+" to reverse "+revS2);
	}

}
