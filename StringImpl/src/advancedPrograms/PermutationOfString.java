package advancedPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PermutationOfString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter String");
		String s1=scn.next();
		
		int len=s1.length();
		String per="";
		for(int i=0;i<len;i++) {
			per+=s1;
		}
		String s2="";
		System.out.println(per);
		List l=new ArrayList();
		for(int i=0;i<per.length()-s1.length();i++) {
			s2=per.substring(i, i+s1.length());
			l.add(s2);
		}
		System.out.println(Arrays.toString(l.toArray()));
	}

}
