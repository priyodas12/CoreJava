package predicate;

import java.util.function.Predicate;
/*
 * any input<generic> return type<boolean>:
 * Usecase:Condition check
 * 
 */

public class PredicateImpl {

	public static void main(String[] args) {
		Predicate<Integer> j=i->i>10;
		//Test is abstract method in predicate(SAM)
		System.out.println(j.test(10));
		System.out.println(j.test(100));
		//String length check
		Predicate<String> s=s1->s1.length()>8;
		System.out.println(s.test("ajdhjksdj"));	
	}

}
