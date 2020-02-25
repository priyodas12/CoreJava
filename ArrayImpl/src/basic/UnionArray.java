package basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionArray {

	public static void main(String[] args) {
		int [] a= {3,4,5,6};
		int [] b= {4,8,9,4};
		
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			s.add(b[i]);
		}
		
		Integer [] union=new Integer[s.size()];
		s.toArray(union);
		
		System.out.println(Arrays.toString(union));
	}
	

}
