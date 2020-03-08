package basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArrayToHashSet {

	public static void main(String[] args) {
		Integer [] a=new Integer[] {9,4,5,6,10,2,5,6};
		Set<Integer> s=new HashSet<Integer>();
		
		//By iteration
		for(Integer i:a) {
			s.add(i);
		}
		System.out.println("By Iterative Method\n"+s);
		
		//By constructor
		Set<Integer> s2=new TreeSet<Integer>(Arrays.asList(a));
		System.out.println("By Constructor of Set class\n"+s2);
		
		//By Java Stream
		Set<Integer> s3=new LinkedHashSet<Integer>();
		s3=Arrays.stream(a).collect(Collectors.toSet());
		System.out.println("By Java Stream\n"+s3);
		
	}

}
