package basic;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapImpl {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> chm=new ConcurrentHashMap<>();

        chm.put("asjlvfdas",1213);
        chm.put("asjlwedas",9610);
        chm.put("asjlsddas",1583);
        chm.put("asjldhjas",1258);

        for(String s:chm.keySet()){
            System.out.println(s);
            chm.put("sajks",8328);
        }

    }
}
