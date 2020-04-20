package hashcode;

/*Whenever it is invoked on the same object more than once during an execution of a Java application, 
    the hashCode method must consistently return the same integer,
    provided no information used in equals comparisons on the object is modified. 
    This integer need not remain consistent from one execution of an application to another execution of the same application.
	If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.
	It is not required that if two objects are unequal according to the equals(java.lang.Object) method, 
	then calling the hashCode method on each of the two objects must produce distinct integer results. However,
	the programmer should be aware that producing distinct integer results for unequal objects may improve the performance of hash tables.
*/

public class HashcodeImpl {
	
	public static void main(String[] args) {
		Student s1=new Student("priyo",21);
		Student s2=new Student("priyo",34);
		Student s3=new Student("priyo",21);
		
		System.out.println("s1 hashcode: "+s1.hashCode());
		System.out.println("s2 hashcode: "+s2.hashCode());
		System.out.println("s3 hashcode: "+s3.hashCode());
		System.out.println("s1,s2 both same: "+s1.equals(s2));
		System.out.println("s1,s3 both same: "+s1.equals(s3));
	}
}

class Student{
	private String name;
	private int rollno;
	
	public Student(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	@Override
	public boolean equals(Object obj) {
		Student s1=(Student)obj;
		return (this.name.equals(s1.name) && s1.rollno==this.rollno);
	}
	@Override
	public int hashCode() {
		//poor Hashcode implementation
		//return 10001*31;
		//return super.hashCode();
		return (this.rollno)*19;
		
	}
}
