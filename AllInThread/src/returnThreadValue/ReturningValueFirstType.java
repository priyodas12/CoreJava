package returnThreadValue;

public class ReturningValueFirstType {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"thread starts...");
		
		
		System.out.println(Thread.currentThread().getName()+"thread ends...");
	}

}
