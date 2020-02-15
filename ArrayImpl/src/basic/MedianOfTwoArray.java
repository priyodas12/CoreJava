package basic;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoArray {
	
	static void addInList(int [] k,List l) {
		for(int i=0;i<k.length;i++) {
			l.add(k[i]);
		}
	}

	public static void main(String[] args) {
		int [] a= {4,4,1};
		int [] b= {3,5};
		
		List<Integer> l=new ArrayList<Integer>();
		
		addInList(a,l);
		addInList(b,l);
		int sum=0;
		for(int i=0;i<l.size();i++) {
			sum+=l.get(i);
		}
		System.out.println(sum+" "+l.size());
		double result=(double)sum/l.size();
		System.out.println(result);
	}

}
