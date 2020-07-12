package lambda;
/*
* a method pointer for dynamic dispatch:
* evaluate the call site at runtime:
* Wire up the target method:
* cache the writing to improve performance in future:
*/

import java.util.Arrays;

public class Indy {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,5).stream().map(i->i*2).forEach(System.out::println);
    }
}
