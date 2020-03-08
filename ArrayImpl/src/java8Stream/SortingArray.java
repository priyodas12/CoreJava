package java8Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortingArray {

	public static void main(String[] args) {
		Integer [] a=new Integer[] {9,4,5,6,2,5,6};
		
		String [] s=new String[] {"abc","def","aab","bcs"};
		//traditional way
		Arrays.parallelSort(a);
		System.out.println(Arrays.deepToString(a));
		
		//by java8 stream:Ascending
		Arrays.stream(a).sorted().collect(Collectors.toList()).forEach(i->System.out.print(" "+i));
		Arrays.stream(s).sorted().collect(Collectors.toList()).forEach(i->System.out.print(" "+i));
		
		
		System.out.println("\n");
		
		//by java8 stream:Descending
		Arrays.stream(a).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(i->System.out.print(" "+i));
		Arrays.stream(s).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(i->System.out.print(" "+i));
	}

}
