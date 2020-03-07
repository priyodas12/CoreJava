package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapImpl {

	public static void main(String[] args) {
		List<String> randomString=Arrays.asList("abc","bac","jsa");
		
		randomString.stream().map(new Function<String,Integer>(){

			@Override
			public Integer apply(String t) {
				
				return t.length();
			}
			
		}).forEach(System.out::println);
	}
}
