package CollectionFrameWork;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapMark1 {
    //    Map is (Key,Value) Pair
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Decleration and Initialization
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        //input
//        System.out.println("Enter the no of elements to be entered in the map");
//        int no=s.nextInt();
//        for(int i=0;i<no;i++)
//        {
//            System.out.println("Enter the key");
//            int key=s.nextInt();
//            System.out.println("Enter the value");
//            String value = s.next();
//            map.put(key,value);
//        }
        map.put(1,"Aditya");
        map.put(2,"Sandesh");
        map.put(3,"Mayur");
        map.put(4,"Aaryaman");
        map.put(5,"Jivesh");
//        System.out.println(map);

        // for getting all the keys
//        System.out.println(map.keySet());

        //  for printing values only
//        System.out.println(map.values());

        // for getting value for a key
//        System.out.println(map.get(1));

        // for checking if the key exists.
//        System.out.println(map.containsKey(1));

//        for checking if the value exists in the map.
//        System.out.println(map.containsValue("Aditya"));

//        for removing the key value pair.
//        map.remove(2);
//        System.out.println(map);

//        for iterating over the map getting both key and value
        for(var e:map.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());

        for(var key:map.keySet())
            System.out.println("The key is:"+key);
        for(var value:map.entrySet())
            System.out.println("The value is:"+value);

    }
}
