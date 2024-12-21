package Java8.StreamApi;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        /*  Filter
        *   Filter is a method which operates on each and every element on the basis of a condition
        *   condition is called as Predicate.
        *   Predicate is a boolean valued Lambda Fnc.*/
        List<String> list = List.of("Aditya","Varad","Sandesh","Parth","Paaji","Saurabh");

        // Directly Printing

//        Stream<String> stream1 = list.stream();
//        stream1.filter(value->value.startsWith("P")).forEach(value->{
//            System.out.print(value+" ");
//        });

        // Storing into a new Collection

        Stream<String> stream2 = list.stream();
        List<String> list1 = stream2.filter(value->value.startsWith("P")).toList();


        /*  Map
            it is used to transform each and every element of the List.
            like add 1 to every element.
            done using map function which takes a
        * */

//        List<Integer> list2 = List.of(1,2,3,4,5,6,7,8,9,10);
//        Stream<Integer> stream3=list2.stream();
//         stream3.map(value->Math.pow(value,2)).forEach(value->{
//            System.out.println(value+" ");
//        });

         // Sort method.

        List<Integer> list3 = List.of(10,5,9,6,2,3,1,4,7,8);
        System.out.println("Sorted List");
        list3.stream().sorted().forEach(value->{
            System.out.print(value+" ");
        });
    }
}
