package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		Integer [] a= {2,3,4,5};
		List <Integer> l=new ArrayList<Integer>();
		l=Arrays.asList(a);
		
		//1.make casted type array with same size of arrayist.
		//convert arraylist to array.
		Integer[] a1=new Integer[l.size()];
		a1=l.toArray(a1);
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.deepToString(a1));//to print multidimensional array.
		
	}

}
