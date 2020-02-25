package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*Java Program to Increment Every Element of the Array by One & Print Incremented Array*/
public class IncrementArray {

	public static void main(String[] args) {
		Integer [] arr= {2,4,6,7,2,1};
		List<Integer> l=Arrays.asList(arr);
		
		l.stream().map(i->i+2).collect(Collectors.toList()).forEach(System.out::println);;
		

	}

}
