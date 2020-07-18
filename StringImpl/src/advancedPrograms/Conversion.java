package advancedPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Conversion {
    public static void main(String[] args) {

        String s1="67ahsk1dkl1s6a";

        List<Object> list=s1.chars().mapToObj(i->(char)i).collect(Collectors.toList());
        // List<Object> list= Arrays.asList(s1.toCharArray());

        list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet()).forEach(System.out::println);


    }
}
