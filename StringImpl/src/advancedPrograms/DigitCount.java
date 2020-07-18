package advancedPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter String");
		String s1=scn.next();
		
//		for(int i=0;i<s1.length();i++) {
//			if(s1.charAt(i)>=48 && s1.charAt(i)<=57) {
//				System.out.println("This string contains number"+s1.charAt(i));
//			}
//		}
		//print all number in string
		s1.chars()
				.mapToObj(i->(char)i)
				.filter(i-> (i>=48 && i<=57))
				.forEach(System.out::println);
		//print count of number in string
		System.out.println("total numbers in this string:: "+s1.chars()
				.mapToObj(i->(char)i)
				.filter(i-> (i>=48 && i<=57)).count());
	}

}
