package basic;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		StringBuffer s1=new StringBuffer(""+Math.abs(num));
		int res=Math.abs(Integer.parseInt(s1.reverse().toString()));
		System.out.println(num>0?res:"-"+res);
		//System.out.println(Integer.parseInt("abc"));//NPE
	}

}
