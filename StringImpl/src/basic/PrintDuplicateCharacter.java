	package basic;
	
	import java.util.HashSet;
	import java.util.Set;
	
	public class PrintDuplicateCharacter {
	
		public static void main(String[] args) {
			String s1="abcfkdlakskld";
			Set<Character> s=new HashSet<Character>();
			for(int i=0;i<s1.length();i++) {
				if(!s.add(s1.charAt(i))) {
					System.out.println("Duplicate Cahracter >>"+s1.charAt(i));
				}
			}
			System.out.println(s);
		}
	
	}
