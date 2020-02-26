package basic;

import java.util.Arrays;

public class AngramString {


	public static void main(String[] args) {
		String s1="cbda";
		String s2="abcdf";
		
		int k=0;
		
		char [] a=s1.toCharArray();
		char [] b=s2.toCharArray();
		
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		if(a.length==b.length) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				k++;
				}
			}
		}
		System.out.println(k==a.length?"Angram":"Not Angram");
	}
}

