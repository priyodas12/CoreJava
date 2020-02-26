package com.workspace;

public class ReturnTypeOverloading {
	
	public static int calc(int a, int b, int c) {
		return a*b*c;
	}
//  not possible,compilation error
//	public String calc(int a, int b, int c) {
//		return a+b+c;
//	}
	public static String calc(String a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		//System.out.println(calc(10,10,"10")); will return compilation error,order of params must be same
		System.out.println(calc("10",10,10));
	}

}
