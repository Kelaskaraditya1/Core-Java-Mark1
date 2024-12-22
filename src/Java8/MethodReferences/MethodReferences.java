package Java8.MethodReferences;

import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        /* Method References is if we want to provide pre provided implementation to a function to a new function.
        done using Scope resolution operator.
        done to provide implementation of the functional interface , instead of lambda if we want to provide another implementation.
        */

        // Using Anonymous Class

//        Reference2 reference2 = new Reference2() {
//            @Override
//            public void getTable3() {
//                for(int i=1;i<=10;i++){
//                    System.out.println("3 * "+i+" = "+3*i);
//                    try{
//                        Thread.sleep(1000);
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        reference2.getTable3();

        // Using Lambda Expression

//        Reference2 reference3 = ()->{
//            for(int i=1;i<=10;i++){
//                System.out.println("3 * "+i+" = "+3*i);
//                try{
//                    Thread.sleep(1000);
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//            }
//        };
//        reference3.getTable3();

        /* Using Method References
            if we want to implement the interface "Reference2" and to it's function getTable3()
            we want to provide implementation of another function getTable2() which is in the class "Reference1"
            we have to use Method reference operator "::"
            The method from the class should be static.
            In case of non static method we have to use object to reference the method.
        * */

//        Reference2 reference2 = Reference1::getTable2;
//        reference2.getTable3();

        // For Runnable Interface

//        Runnable runnable = Reference1::getTable2;
//        Thread thread = new Thread(runnable);
//        thread.start();

        // for non Static method , use the object of the class.
//        Reference1 reference1 = new Reference1();
//        Runnable runnable1 = reference1::getTable4;
//        Thread thread1 = new Thread(runnable1);
//        thread1.start();

        var list = List.of(1,2,3,4,5,6,7,8,9,10);
//        list.stream().filter(value->(value&1)==0).forEach(value->{
//            System.out.print(value+" ");
//        });
        list.stream().map(value->Math.pow(value,2)).forEach(System.out::print);
    }
}
