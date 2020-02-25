package interface_changes;

public interface Parent1 {
	
	public void m1();
	public default void m2() {
		System.out.println("Default Implementation:p1");
	}
	public static void m3() {
		System.out.println("static method in interface:p1");
	}

}
