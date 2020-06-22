package functionalInterface;

/*a functional interface has exactly one abstract method*/
@FunctionalInterface
public interface DemoFunctionalInterface {

    static void m1(){
        System.out.println("static method in interface");
    }

    default void m2(){
        System.out.println("default method in interface");
    }

    void m3();
}
