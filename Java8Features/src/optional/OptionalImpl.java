package optional;

import java.util.Optional;

public class OptionalImpl {
    public static void main(String[] args) {
        String s=null;
        // static method of will return nullPointerException if assigned object is null;
        //Optional<String> opsString=Optional.of(s);
        Optional<String> opsString=Optional.ofNullable(s);
        //ofNullable method will return Optional.empty for null pointed object
        System.out.println(opsString);
    }
}
