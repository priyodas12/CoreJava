package com.workspace;
//int->long->double->Integer->Number
public class NumberOverloading {
	public static void testNumber(int i) {
		System.out.println("int");
	}
	public static void testNumber(Integer i) {
		System.out.println("Integer");
	}
	public static void testNumber(long i) {
		System.out.println("long");
	}
	public static void testNumber(double i) {
		System.out.println("double");
	}
	public static void testNumber(byte i) {
		System.out.println("byte");
	}
	public static void testNumber(short i) {
		System.out.println("short");
	}
	public static void testNumber(Number i) {
		System.out.println("Number");
	}
	public static void main(String[] args) {
		testNumber((byte)10);
		testNumber((short)10);
		testNumber(10);
		testNumber(new Integer(10));
		testNumber(10L);
		testNumber(10.0);
		
	}

}
