package basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxCount {
	public static int getCountOfMax(int a[]) {
		
		Arrays.parallelSort(a);
		
		int k=a[a.length-1];
		
		int counter=0;
		
		for(int j=0;j<a.length;j++) {
			if(a[j]==k) {
				counter++;
			}
		}
		
		return counter;
		
	}

	public static void main(String[] args) {
		System.out.println(getCountOfMax(new int[]{2,5,8,7,5,9,6,5,9}));

	}

}
