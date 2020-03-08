package function;

import java.util.function.Function;

/*
 * any input<generic> return type<generic>
 * Usecase:Operational
 */

public class FunctionImpl {

	public static void main(String[] args) {
		
		Function<String, Integer> f=s1->s1.length()*2;
		
		System.out.println(f.apply("priyo"));
	}

}
