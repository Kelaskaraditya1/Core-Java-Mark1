package Java8.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjects {
    public static void main(String[] args) {

        /* Stream is an Interface , so it's objects cannot be derived .
        * The Main Reason is to use various abstract methods from Stream interface which return Object of Stream.*/

        /*
        *   1)empty method
        *   returns an empty Stream Object
        * */
        Stream<Object> stream1=Stream.empty();
        stream1.forEach(e->{
            System.out.println("I am Ironman");  // Will not Print anything.
        });

        /*
        *   2) using Array or Collections using "of" method
        * pass Array to parameter to "of" method it will return object of Stream
        * */

        String namesArray[] = {"Aditya","Varad","Sandesh","Parth","Paaji","Saurabh"};
        Stream<String> stream = Stream.of(namesArray);
        stream.forEach(value->{
            System.out.print(value+" ");
        });

        /*  Using anonymous Array */
        IntStream stream2 = Arrays.stream(new int[]{1,2,3,4,5,6,7,8,9,10});
        stream2.forEach(value->{
            System.out.print(value+" ");
        });


        /*  Most Commonly Used Method    */
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream3 = list.stream();
        stream3.forEach(value->{
            System.out.print(value+" ");
        });

    }
}
