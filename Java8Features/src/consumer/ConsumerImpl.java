package consumer;

import java.util.function.Consumer;

/*
 * take input<generic> but no return type
 */

public class ConsumerImpl {

	public static void main(String[] args) {
		Consumer<String> c=s1->System.out.println(s1.concat(s1));;
		
		c.accept("Priyo");

	}

}
