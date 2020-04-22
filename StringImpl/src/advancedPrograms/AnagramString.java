package advancedPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter First String");
		String s1=scn.next();
		System.out.println("Enter Second String");
		String s2=scn.next();
		
		
		//Step 1:
//		int counter=0;
//		if(s1.length()==s2.length()) {
//			for(int i=0;i<s1.length();i++) {
//				if((s1.indexOf(s2.charAt(i))!=(-1))){
//					counter++;
//				}
//			}
//			System.out.println(counter==s1.length()?"Both are anagram":"Both are not anagram");
//		}
//		else {
//			System.out.println("Length are not same");
//		}
//		
		//Step 2
		String s3=s1+s2;
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<s3.length();i++) {
			if(hm.containsKey(s3.charAt(i))) {
				hm.put(s3.charAt(i), hm.get(s3.charAt(i))+1);
			}
			else {
				hm.put(s3.charAt(i),1);
			}
		}
		int count=0;
		for(Character c:hm.keySet()) {
			if(hm.get(c)<2) {
				count++;
			}
		}
		System.out.println(count>0?"Not Anagram":"both are anagram");
		
	}

}
