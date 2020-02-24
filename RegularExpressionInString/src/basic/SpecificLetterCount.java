package basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecificLetterCount {

	public static void main(String[] args) {
		String s1="abcdcdfgabcdfg";
		String s2="abc";
		//to find String
		Pattern p=Pattern.compile(s2);
		//input String
		Matcher m=p.matcher(s1);
		
		int count=0;
		while(m.find()) {
			count++;
		}
		
		System.out.println(s2+" presents in "+s1+" "+count+" times");

	}

}
