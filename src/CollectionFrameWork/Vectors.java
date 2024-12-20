package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Decleration
        Vector<Integer> vector = new Vector<>();
        // input
        System.out.println("Enter the no of elements");
        int no=s.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<no;i++)
        {
            int val = s.nextInt();
            vector.add(val);
        }
        // output
//        System.out.println(vector);

//        size of arraylist
//        System.out.println(vector.size());

        //1) insert at position

//        arraylist.add(1,100);
//        System.out.println(vector);

        // 2)remove function

//        vector.remove(4);
//        vector.remove(Integer.valueOf(5));
//        System.out.println(vector);

        // 3)for clearing the list

//        System.out.println(vector);
//        vector.clear();
//        System.out.println(vector);

//        4)update function

//        System.out.println(vector);
//        vector.set(2,100);
//        System.out.println(vector);

//        5) contains function

//        System.out.println(vector);
//        System.out.println(vector.contains(100));

//        6) iterating through List

//        for(int value:vector)
//            System.out.print(value+" ");

    }
}
