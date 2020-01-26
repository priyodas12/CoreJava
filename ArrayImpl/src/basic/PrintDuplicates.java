package basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class PrintDuplicates {

	public static void main(String[] args) {
		int [] a= {3,1,1,2,9,6,8,5,4,3,9,4};
		System.out.println("Without Duplicates:\n"+Arrays.toString(IntStream.of(a).distinct().toArray()));
		
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			if(!s.add(a[i])) {
				System.out.println("Duplicate element: \n"+a[i]);
			}
		}
	}

}
