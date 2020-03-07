package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterStringArray {

	public static void main(String[] args) {
		List<String> randomString=Arrays.asList("abc","bac","jsa");
		
		//in detail way
		randomString.stream()
					.filter(new Predicate<String>(){
						@Override
						public boolean test(String t) {
							return !t.equals("abc");
						}})
					.forEach(str->System.out.println(str));
		//short way
		randomString.stream().filter(name->!name.equals("abc")).forEach(System.out::print);
		
		
	}

}
