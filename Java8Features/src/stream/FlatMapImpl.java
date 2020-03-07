package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapImpl {

	public static void main(String[] args) {
		int[][] intArray= {{1,2,3},{8,9,3}};
		
		Stream.of(intArray).flatMapToInt(x->Arrays.stream(x)).forEach(System.out::println);;
	}

}
