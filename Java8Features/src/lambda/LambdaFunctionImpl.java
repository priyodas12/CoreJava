package lambda;
/*
    Lambda expressions basically express instances of functional interfaces
    (An interface with single abstract method is called functional interface.
    An example is java.lang.Runnable)

    each lamda call under the hood calls invokedynamic(
*/
public class LambdaFunctionImpl {

    public static void main(String[] args) {
        //implementation part
        LambdaFunction l1=()->{
            System.out.println("pointing to m1 method actually!");
        };
        l1.m1();
    }
}
