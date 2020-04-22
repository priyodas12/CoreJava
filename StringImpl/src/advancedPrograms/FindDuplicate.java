package advancedPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter String");
		String s1=scn.next();
		
		Set s=new HashSet();
		List l=new ArrayList();
		for(int i=0;i<s1.length();i++) {
			if(!s.add(""+s1.charAt(i))) {
				//System.out.println("Duplicate Character: "+s1.charAt(i));
				l.add(s1.charAt(i));
			}
		}
		System.out.println("Duplicate Characters are: "+Arrays.toString(l.toArray()));

	}

}
