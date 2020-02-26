package com.workspace;

public class MainOverloading {
	  
	    // Normal main() 
	    public static void main(String[] args) { 
	        System.out.println("Hi (from main)"); 
	        MainOverloading.main("priyo"); 
	    } 
	  
	    // Overloaded main methods 
	    public static void main(String arg1) { 
	        System.out.println("Hi, " + arg1); 
	        MainOverloading.main("Dear peers","overloaded main with single param"); 
	    } 
	    public static void main(String arg1, String arg2) { 
	        System.out.println(arg1+" with "+arg2); 
	    } 
	

}
