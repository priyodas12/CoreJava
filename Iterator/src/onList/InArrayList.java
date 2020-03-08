package onList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InArrayList {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		System.out.println(l instanceof ArrayList);
		
		Iterator itr=l.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
