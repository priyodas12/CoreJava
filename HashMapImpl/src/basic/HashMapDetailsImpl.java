package basic;

import java.util.HashMap;

public class HashMapDetailsImpl {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("abcdf","12345");
        hm.put("akcdf","04845");
        hm.put("abcjf","7685");

        hm.keySet().stream().forEach(s -> System.out.println(s+">>"+hm.get(s)));
     }
}
