package interface_changes;

public interface Parent2 {
	
	public void m1();
	public default void m2() {
		System.out.println("Default Implementation:p2");
	}

}
