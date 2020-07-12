package optional;

import java.util.Optional;

/*Optional was introduced to Java as a way to fix the issues with null references.
 Before Optional, every object was allowed to either contain a value or not (i.e. being null).
 */

public class OptionalImpl {
    public static void main(String[] args) {
        String s=null;
        // static method of will return nullPointerException if assigned object is null;
        //Optional<String> opsString=Optional.of(s);
        Optional<String> opsString=Optional.ofNullable(s);
        //ofNullable method will return Optional.empty for null pointed object
        System.out.println(opsString);
        //to create empty optional object
        Optional<String> opsString2=Optional.empty();
        System.out.println(opsString2);
        //
        Optional<String> optionalFalcon = Optional.ofNullable("Priyo");
        optionalFalcon.ifPresent(System.out::println);
    }
}
