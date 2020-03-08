package basic;


final class CreateImmutableClss {
	
	final String classname;
	
	public CreateImmutableClss(String classname) {
		this.classname=classname;
	}
	
	public String getClassname() {
		return classname;
	} 
}

public class TestImmutability{
	public static void main(String[] args) {
		CreateImmutableClss c=new CreateImmutableClss("Immutable class");
		System.out.println(c.getClassname());
	}
}