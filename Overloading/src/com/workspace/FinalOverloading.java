package com.workspace;

public class FinalOverloading {
	
	public final static int calc(int a, int b, int c) {
		return a*b*c;
	}
	public final static int calc(double a, int b, int c) {
		return (int)a*b*c;
	}
	public static void main(String[] args) {
		System.out.println(calc(12.19,12,12));
	}
}
