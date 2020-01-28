package basic;

import java.util.HashSet;
import java.util.Set;

public class SumOfElements {

	public static void main(String[] args) {
		int [] b= {4,8,9,7,5,9,7,3,5,1};
		Set<Integer> s=new HashSet<Integer>();
		int sum=10;
		for(int i=0;i<b.length;i++) {
			int temp=sum-b[i];
			if(s.contains(b[i])) {
				System.out.println("sum of "+sum+" = "+temp+"+"+b[i]);
			}
			s.add(b[i]);
		}
	}

}
