package onList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InSet {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		Integer [] i=new Integer[] {12,13,14,15};
		s.addAll(Arrays.asList(i));
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
