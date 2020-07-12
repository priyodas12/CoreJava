package lambda;
/*
invokeStatic->call static method
invokeSpecial->constructor and private method
invokeVirtual->instance method virtual method.
*/
public class Abc implements Comparable{

    int a=10;

    public static void staticMethod(){
        System.out.println("static method");
    }

    public final double instanceMethod(double val){
        System.out.println("instance method");
        return val*2;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        staticMethod();
        Abc abc=new Abc();
        abc.instanceMethod(2);
        Comparable<Abc> c=abc;
        abc.compareTo(abc);
    }
}
