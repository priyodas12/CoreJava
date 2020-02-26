package basic;

public class TestStructure {

	public static void main(String[] args) {
		Structure s1=new Structure();
		Structure s2=new Triangle();
		Triangle s3=new Triangle();
		s1.maxArea();
		//checks whether child class has implemented the method or not,if yes then call child class method.else parent class method.
		s2.maxArea();
		s3.maxArea();
		System.out.println(s1 instanceof Triangle);//type of Structure
		System.out.println(s2 instanceof Triangle);
		System.out.println(s3 instanceof Triangle);
		
	}

}
