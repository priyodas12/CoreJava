package basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {

	public static void main(String[] args) {
		int [] a= {3,4,5,6};
		int [] b= {4,8,9,7,5};
		
		Set<Integer> s1=new HashSet<Integer>();
		Set<Integer> s2=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			s1.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			if(!s1.add(b[i])) {
				s2.add(b[i]);
			};
		}
		Integer [] intersection=new Integer[s2.size()];
		s2.toArray(intersection);
		
		System.out.println(Arrays.toString(intersection));
	}

}
