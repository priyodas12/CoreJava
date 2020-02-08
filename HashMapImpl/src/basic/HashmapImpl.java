package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashmapImpl {

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("abc",123);
		hm.put("abg",null);
		hm.put("abf",153);
		
		Iterator itr=hm.entrySet().iterator();
		
		while(itr.hasNext()) {
			//System.out.print(itr.next()+" ");//abd=103 abc=123 abf=153 
			Map.Entry<String, Integer> hm1=(Entry<String, Integer>) itr.next();
			
			System.out.println(hm1.getKey()+" > "+hm1.getValue());
//			
		}
		System.out.println("--------------------------");
		for(String s:hm.keySet()) {
			System.out.println(s+">"+hm.get(s));
		}
	}

}
