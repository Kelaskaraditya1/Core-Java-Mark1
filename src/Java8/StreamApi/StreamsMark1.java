package Java8.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMark1 {
    public static void main(String[] args) {

        // Method 1 of creating List

         List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9,10);
//        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(list1);
        ArrayList<Integer> list2 = new ArrayList<>();

        // for creating a list which has only evan numbers.

        // Normal Method

        for(var value:list){
            if((value&1)==0)
                list2.add(value);
        }
//        System.out.println(list2);

        // Using Streams

        Stream<Integer> stream = list.stream();
        List<Integer> list3=stream.filter(x->x%2==0).toList();
        System.out.println(list3);

        // getting all numbers greater than 5 from list1.

        List<Integer> list4 = list.stream().filter(x->x>5).toList();
        System.out.println(list4);
    }
}
