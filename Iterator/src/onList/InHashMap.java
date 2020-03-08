package onList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InHashMap {

	public static void main(String[] args) {

        HashMap<String, Integer> hm =  
                    new HashMap<String, Integer>(); 
  
        hm.put("a", 97);
		hm.put("b", 98);
		hm.put("c", 99);
		hm.put("d", 100);
        
        Iterator hmIterator = hm.entrySet().iterator(); 
  
         while (hmIterator.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            int marks = ((int)mapElement.getValue() + 10); 
            System.out.println(mapElement.getKey() + " : " + marks); 
        } 
    } 
} 


