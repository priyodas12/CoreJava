package basic.types;
//Same as Runnable
public class InterfaceImplementation {

	public static void main(String[] args) {
		UseMe um=new UseMe() {
			public void greet() {
				System.out.println("Hello World!");
			}
		};
		um.greet();

	}

}

interface UseMe{
	void greet();
}