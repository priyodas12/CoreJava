package basic;

public class TestImmutable {

	public static void main(String[] args) {
		Student s1=new Student("somebody");
		s1.getName();
	}

}


final class Student 
{ 
    final String name; 
  
    public Student(String name) 
    { 
        this.name = name;  
    } 
    public String getName() 
    { 
        return name; 
    } 
    
} 