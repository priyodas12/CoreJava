package basic;

public class PermutationOfString {
	private String swap(String s1,int i,int j) {
		char temp;
		char [] a=s1.toCharArray();
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return String.valueOf(a);
	}
	
	private void calc(String s2,int left,int right) {
		if(left==right) {
			System.out.println(s2);
		}else {
			for(int i=left;i<=right;i++) {
				String swapped=this.swap(s2, left, i);
				this.calc(swapped, left+1, right);
			}
		}
	
	}
	
	public static void main(String[] args) {
		String s1="abc";
		int n=s1.length();
		
		PermutationOfString ps=new PermutationOfString();
		ps.calc(s1, 0, n-1);
		
	}
}
