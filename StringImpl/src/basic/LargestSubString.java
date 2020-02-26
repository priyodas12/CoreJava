package basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LargestSubString {

	public static void main(String[] args) {
		String s1="nnnkjdjadlkann";
		
		char [] sample=s1.toCharArray();
		
		Set<Character> s2=new HashSet<Character>();
		
		for(int i=0;i<sample.length;i++) {
			s2.add(sample[i]);
		}
		String s3="";
		Iterator itr=s2.iterator();
		while(itr.hasNext()) {
			s3+=""+itr.next();
		}
		System.out.println(s3+">"+s3.length());
	}

}
