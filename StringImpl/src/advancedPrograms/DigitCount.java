package advancedPrograms;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter String");
		String s1=scn.next();
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>=48 && s1.charAt(i)<=57) {
				System.out.println("This string contains number"+s1.charAt(i));
			}
		}
	}

}
