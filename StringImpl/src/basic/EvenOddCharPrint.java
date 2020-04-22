package basic;

import java.util.Scanner;

public class EvenOddCharPrint {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String::");
		String s1=scn.next();
		int i=0,j=1;
		while(i<s1.length() && j<s1.length()) {
			System.out.println("Even"+s1.charAt(i));
			i+=2;
			System.out.println("Odd"+s1.charAt(j));
			j+=2;
		}

	}

}
