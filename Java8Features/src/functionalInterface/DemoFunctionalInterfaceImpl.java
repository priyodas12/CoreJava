package functionalInterface;

public class DemoFunctionalInterfaceImpl implements DemoFunctionalInterface{

    @Override
    public void m2() {
        System.out.println("implemented default method");
    }

    @Override
    public void m3() {
        System.out.println("implemented abstract method");
    }

    public static void main(String[] args) {

        DemoFunctionalInterface demoFunctionalInterface=new DemoFunctionalInterfaceImpl();
        demoFunctionalInterface.m2();
        demoFunctionalInterface.m3();

        DemoFunctionalInterface.m1();


    }
}
