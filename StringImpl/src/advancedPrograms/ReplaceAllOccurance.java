package advancedPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReplaceAllOccurance {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter String");
		String s1=scn.next();
		
		Set s=new HashSet();
		String res="";
		for(int i=0;i<s1.length();i++) {
			if(!s.add(""+s1.charAt(i))) {
				res+="_";
			}
			else {
				res+=""+s1.charAt(i);
			}
			
		}
		System.out.println(res);
	}

}
