package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		Integer [] a= {2,3,4,5};
		List <Integer> list=new ArrayList<Integer>();
		list=Arrays.asList(a);
		
		//1.make casted type array with same size of ArrayList.
		//convert ArrayList to array.
		Integer[] a1=new Integer[list.size()];
		a1=list.toArray(a1);
		
		System.out.println(Arrays.toString(a1));
		//System.out.println(Arrays.deepToString(a1));//to print multidimensional array.
		
	}

}
