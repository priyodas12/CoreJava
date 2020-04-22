package basic;

public class StringBufferImpl {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		//initial capacity:16
		System.out.println(sb.capacity());	
		//increasing order (ic+1)*2=34
		sb.append("dajlksdjjaksdkaslda");
		System.out.println(sb.capacity());
		//increasing order (ic+1)*2=70
		sb.append("dajlksdjjaksdkaslda");
		System.out.println(sb.capacity());
		System.out.println(sb);
		//now capacity will be initial capacity+string literal capacity
		sb=new StringBuffer("asahsa");//22
		System.out.println(sb.capacity());
		System.out.println(sb);
	}
}
