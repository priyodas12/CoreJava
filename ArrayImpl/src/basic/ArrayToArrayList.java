package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		Integer [] a=new Integer[] {9,4,5,6,2,5,6};
		
		List<Integer> arr=new ArrayList<Integer>();
		
		arr=Arrays.asList(a);
		
		System.out.println(arr);
		
		Integer [] a2=new Integer[arr.size()];
		
		a2=(Integer[]) arr.toArray();
		
		System.out.println(Arrays.deepToString(a2));

	}

}
