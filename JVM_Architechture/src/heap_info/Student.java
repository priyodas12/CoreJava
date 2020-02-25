package heap_info;

public class Student implements JeePrep{
	private int marks;
	private String email;
	
	public Student() {
		
	}
	public Student(int marks, String email) {
		super();
		this.marks = marks;
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public void prepForJee() {
		System.out.println("Prep for Jee Mains");
	}
	
	public class InnerClass1 {
	      public InnerClass1() {
	         System.out.println("Inner Class1");
	      }
	   }

	   public class InnerClass2 {
	      public InnerClass2() {
	         System.out.println("Inner Class2");
	      }
	   }


}
