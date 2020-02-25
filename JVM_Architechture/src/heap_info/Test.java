package heap_info;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Class c=Class.forName("heap_info.Student");
		
		Method [] m=c.getMethods();
		System.out.println("Methods Info::");
		Arrays.stream(m).forEach(System.out::println);
		Field [] f=c.getDeclaredFields();
		System.out.println("Field Info::");
		Arrays.stream(f).forEach(System.out::println);
		Class[] c2= c.getDeclaredClasses();
		System.out.println("Class Info::");
		Arrays.stream(c2).forEach(System.out::println);
		
		//Class object for Student info will be created once:
		Student s1=new Student();
		Student s2=new Student();
		
		Class c4=s1.getClass();
		Class c3=s1.getClass();
		
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
	}

}
