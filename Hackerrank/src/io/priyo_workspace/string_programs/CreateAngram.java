package io.priyo_workspace.string_programs;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CreateAngram {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int count=0;
        
        return a.length()+b.length()-2*count;
    }
    
    static void findSimilarCharacter(String a,String b) {
    	HashMap<String,Integer> hs=new HashMap<String,Integer>();
    	StringBuffer s1=new StringBuffer();
    	StringBuffer s2=new StringBuffer();
    	StringBuffer s3=new StringBuffer();
    	StringBuffer s4=new StringBuffer();
    	StringBuffer s5=new StringBuffer();
    	int duplicateA=0;
    	int duplicateB=0;
    	for(int i=0;i<a.length();i++) {
    		if(!hs.containsKey(""+a.charAt(i))) {
    			hs.put(""+a.charAt(i), 1);
    			s1.append(""+a.charAt(i));
    		}
    		else {
    			hs.put(""+a.charAt(i), hs.get(""+a.charAt(i))+1);
    			duplicateA++;
    			s2.append(""+a.charAt(i));
    		}
    	}
    	for(int i=0;i<b.length();i++) {
    			if(hs.containsKey(""+b.charAt(i))) {
    			hs.put(""+b.charAt(i), hs.get(""+b.charAt(i))+1);
    			s5.append(""+b.charAt(i));
    			duplicateB++;
    			}
    	}
    	
    	System.out.println("s1 >"+s1);
    	System.out.println("s2 >"+s2);
    	//System.out.println("s3 >"+s3);
    	System.out.println("s4 >"+s4);
    	System.out.println("s5 >"+s5);
    	System.out.println(duplicateA);
    	System.out.println(duplicateB);
    	System.out.println(hs);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	System.out.println("Enter 1st String");
        String a = scanner.nextLine();
        System.out.println("Enter 2nd String");
        String b = scanner.nextLine();
        findSimilarCharacter(a, b);
        

        scanner.close();
    }
}

