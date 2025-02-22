package CoreJava;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //deceleration and initialization

        String str ="Aditya";
        // iterating through string
//        char arr[]=str.toCharArray();
//        for(int i=0;i<arr.length;i++)
//            System.out.print(arr[i]+" ");
        // String functions

//        1)length of a string

//        System.out.println(str.length());

//        2) is empty or not?

//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());

//        3) for comparing 2 strings

        String str1=s.next();
        String str2=s.next();
//        if(str1.equals(str2))
//            System.out.println("Strings are equal");
//        else
//            System.out.println("Strings are not equal");

//        if(str1.compareTo(str2)==0)
//            System.out.println("String are equale");
//        else if(str1.compareTo(str2)>0)
//            System.out.println("String 1 is bigger");
//        else
//            System.out.println("String 2 is bigger");

//        4) searching for substring

//        if(str1.contains(str2))
//            System.out.println("String 1 is present in String 2");
//        else
//            System.out.println("String 1 is not present in string 2");

//        5) substring of a string

        System.out.println(str1.substring(2));
        System.out.println(str1.substring(1,4));

//        6) Cases functions (lower case,upper case)
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

    }
}
