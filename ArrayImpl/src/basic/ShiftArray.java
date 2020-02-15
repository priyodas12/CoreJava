package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftArray {
	
	public static  void rightShift(int [] nums,int k) {
		Integer [] arr=Arrays.stream(nums).boxed().toArray(Integer []::new);
		List<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> al2=new ArrayList<Integer>();
		
		for(int i=al.size()-k;i<al.size();i++) {
			al2.add(al.get(i));
		}
		for(int i=0;i<k;i++) {
			al2.add(al.get(i));
		}
		Integer [] aa=new Integer[al2.size()];
		aa=al2.toArray(aa);
		System.out.println(Arrays.toString(aa));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {-1,-100,3,99};
		rightShift(nums, 2);
	}

}
