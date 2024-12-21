package Java8.AonymousClassAndLambdaExpression;

import Java8.AonymousClassAndLambdaExpression.AnonymousClass;

public class FunctionalInterface {
    /*  Functional Interface is an Interface with only one abstract method , if more than one abstract methods than it cannot be a functional Interface.
        can be implemented using lambda only for single method to be implemented.
        Lambda methods can be only used for Functional Interface.

        Lambda Function :

        type var = ()->{
        // Implementation
        }

        if single Line function than can be written in single line without {}
     */
    public static void main(String[] args) {
        SingleFunctionInterface singleFunctionInterface = ()-> {
            System.out.println("I am Ironman");
        };
        SingleFunctionInterface singleFunctionInterface1 = ()-> System.out.println("i am Batman");
        singleFunctionInterface1.greetme();
        singleFunctionInterface.greetme();

        AnonymmousInterfaceMark2 anonymmousInterfaceMark2 = (int a,int b)->{
            return a+b;
        };

        AnonymmousInterfaceMark2 anonymmousInterfaceMark3 = (a,b)->a+b;

        System.out.println(anonymmousInterfaceMark2.sum(10,20));
        System.out.println(anonymmousInterfaceMark3.sum(20,30));

    }
}
