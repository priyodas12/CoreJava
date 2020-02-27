package onList;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class InVector {

	public static void main(String[] args) {
		Vector v=new Vector();
		Integer [] i=new Integer[] {12,13,14,15};
		v.addAll(Arrays.asList(i));
		
		Enumeration<Integer> e=v.elements() ;
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
