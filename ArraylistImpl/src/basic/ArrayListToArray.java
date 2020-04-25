package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		Integer [] arr=new Integer[]{1,2,3,4,5,6};
		
		//convert to ArrayList
		List<Integer> list=new ArrayList<Integer>();
		
		list=Arrays.asList(arr);
		
		System.out.println(list instanceof List);
		
		Object [] arr2=new Integer[list.size()];
		
		arr2=list.toArray(arr2);
		
		System.out.println(arr2.getClass().isArray());
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
