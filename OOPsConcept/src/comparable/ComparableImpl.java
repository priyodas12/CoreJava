package comparable;

import java.util.ArrayList;
import java.util.Collections;

/*a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.

Use Comparable:

if the object is in your control.
if the comparing behavior is the main comparing behavior.
*/
public class ComparableImpl {
	
	public static void main(String[] args) {	
		
		Soundbox s1=new Soundbox(100,"JBL");
		Soundbox s2=new Soundbox(200,"SONY");
		Soundbox s3=new Soundbox(250,"ABC");
		
		System.out.println(s2.compareTo(s1));
		
		ArrayList<Soundbox> al=new ArrayList<Soundbox>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Collections.sort(al);
		
		System.out.println(al);
	}
	
}

class Soundbox implements Comparable<Soundbox>{
	
	public int price;
	public String company;
	
	public Soundbox(int price,String company) {
		this.price=price;
		this.company=company;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.price+":"+this.company;
	}
	
	@Override
	public int compareTo(Soundbox o) {
		
		return (this.price-o.price);
	}
	
}
