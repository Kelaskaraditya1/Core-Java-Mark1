import Java8.AonymousClassAndLambdaExpression.AbstractAnonymous;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

class Polygon {
    public int sides;
    public Polygon(int sides){
        this.sides=sides;
    }

    public Polygon(){

    }

    public void getSides(){
        System.out.println("There are "+this.sides+" no of sides of Polygon");
    }

    public class Triangle{
        public int height,base;

        public Triangle(int height,int base){
            this.base=base;
            this.height=height;
        }

        public Triangle(){

        }

        public static double getArea(Triangle triangle){
            return (0.5*triangle.base*triangle.base);
        }

        public static int getPerimeter(Triangle triangle){
            return 2*triangle.base+triangle.height;
        }
    }

    public static class EquilateralTriangle{
        int length;

        public EquilateralTriangle(int length){
            this.length=length;
        }

        public EquilateralTriangle(){

        }

        public static double getArea(EquilateralTriangle triangle){
            return (1.732*Math.pow(triangle.length,2.0));
        }

        public static int getPerimeter(EquilateralTriangle triangle){
            return (3*triangle.length);
        }
    }
}

class Anonymous{

    public int area(int length,int bredth){
        return length*bredth;
    }

    public int perimeter(int length,int bredth){
        return length+bredth;
    }
}

// Anonymous abstract class and interface

abstract class AnonymousAbstract{

    public abstract int area(int length,int breadth);

    public abstract int perimeter(int length,int breadth);

    public abstract int volume(int length,int breadth,int height);
}

interface AnonymousInterface{

    public int area(int length,int breadth);

    public int perimeter(int length,int bredth);

    public int volume(int length,int breadth,int height);
}


interface FunctionalInterfaceMark2{
    public int area(int length,int breadth);
}

interface FunctionalInterface{
    public String greetMe();
}

interface FunctionalInterfaceMark3{
    public int addition(int a,int b);
}

class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(1000);
                System.out.println("1 * "+i+" = "+i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(1000);
                System.out.println("2 * "+i+" = "+2*i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Thread3 implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(1000);
                System.out.println("3 * "+i+" = "+3*i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class TestMark2{

//    public static boolean binarySearch(List<Integer> list, int target){
//        Collections.sort(list);
//        int l=0,h=list.size()-1;
//        while(l<=h){
//            int mid=(l+h)/2;
//            if(list.get(mid)==target)
//                return true;
//            else if(list.get(mid)<target)
//                l=mid+1;
//            else
//                h=mid-1;
//        }
//        return false;
//    }

    public static boolean binarySearch(List<Integer> list,int target,int l,int h){
        while(l<=h){
            int mid = (l+h)/2;
            if(list.get(mid)==target)
                return true;
            else if(list.get(mid)<target)
                return binarySearch(list,target,mid+1,h);
            else
                return binarySearch(list,target,l,mid-1);
        }
        return false;
    }

    public static void setBits(int no){
        int count = 0,mostSignificant=-1,leastSignificant=-1,position=0;
        while(no!=0){
            if((no&1)==1){
                count++;
                if(leastSignificant==-1)
                    leastSignificant=position;
                mostSignificant=position;
            }
            no=no>>1;
            position++;
        }
        System.out.println("#"+count+"#"+leastSignificant+"#"+mostSignificant);
    }

    public static int getCount(String no){

        int i=0,count=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(i<no.length()){
            int num = no.charAt(i++)-48;
            if(!map.containsKey(num))
                map.put(num,0);
            else
                map.put(num,map.getOrDefault(num,0)+1);
        }
        for(var pair:map.entrySet()){
            if(pair.getValue()>0)
                count++;
        }
        return count;
    }

    public static String decoder(String encode){
        StringBuffer stringBuffer = new StringBuffer("");
        int i=0;
        while(i<encode.length()){
            stringBuffer.append((char) (encode.charAt(i++)+3)%26);
        }
        return stringBuffer.toString();

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        //        Inner Class Example

//        System.out.println("Enter the no of sides of Polygon");
//        int sides = s.nextInt();
//        Polygon polygon = new Polygon(sides);
//
//        System.out.println("Enter the base and height of the triangle");
//        int base = s.nextInt();
//        int height = s.nextInt();
//        Polygon.Triangle triangle = polygon.new Triangle(base,height);
//        System.out.println(Polygon.Triangle.getArea(triangle));
//
//        System.out.println("Enter the length of the Equilateral triangle");
//        int side = s.nextInt();
//        Polygon.EquilateralTriangle equilateralTriangle = new Polygon.EquilateralTriangle(side);
//        System.out.println(Polygon.EquilateralTriangle.getArea(equilateralTriangle));

        // Anonymous Classes

        Anonymous anonymous = new Anonymous(){

            @Override
            public int area(int length, int bredth) {
                return 2*length*bredth;
            }

            @Override
            public int perimeter(int length, int bredth) {
                return (length+bredth);
            }
        };


//        System.out.println("The area of th anonymous class is: "+anonymous.area(10,20));
//        System.out.println("The perimeter of the anonymous class is: "+anonymous.perimeter(10,20));

//        AnonymousAbstract anonymousAbstract = new AnonymousAbstract() {
//            @Override
//            public int area(int length, int breadth) {
//                return length*breadth;
//            }
//
//            @Override
//            public int perimeter(int length, int breadth) {
//                return length+breadth;
//            }
//
//            @Override
//            public int volume(int length, int breadth, int height) {
//                return length*breadth*height;
//            }
//        };


//        AnonymousInterface anonymousInterface = new AnonymousInterface() {
//            @Override
//            public int area(int length, int breadth) {
//                return length*breadth;
//            }
//
//            @Override
//            public int perimeter(int length, int bredth) {
//                return length+bredth;
//            }
//
//            @Override
//            public int volume(int length, int breadth, int height) {
//                return length*breadth*height;
//            }
//        };

//        System.out.println(anonymousAbstract.area(10,20));
//        System.out.println(anonymousInterface.volume(10,20,30));

        // Lambda expression

        FunctionalInterface functionalInterface = ()->{
           return "I am Ironman";
        };

//        System.out.println(functionalInterface.greetMe());

        FunctionalInterfaceMark3 functionalInterfaceMark3 = (int a,int b)->{
            return a+b;
        };

//        System.out.println(functionalInterfaceMark3.addition(10,20));


        // Stream - Api

//        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
//
//        List<String> names = Arrays.asList("Aditya","Sanjana","Sandeep","Mayur","Sandesh","Aaryaman","Jivesh","Vinay");
//
//        // for each
//
//        list.stream().
//                    forEach(value->{
//                         System.out.print(value+" ");
//                        });
//
//        System.out.println();
//
//        names.stream()
//                        .forEach(value->{
//                            System.out.print(value+" ");
//                        });
//
//        System.out.println();
//
//        // Filter function
//
//        list.stream()
//                .filter(value->value%2==0)
//                .forEach(value->{
//                    System.out.print(value+" ");
//                });
//
//        System.out.println();
//        names.stream()
//                .filter(
//                        value->(value.startsWith("A")||value.startsWith("S"))
//                )
//                .forEach(value->{
//                    System.out.print(value+" ");
//                });
//
//        // Map function
//
//        System.out.println();
//
//        list.stream()
//                .map(value->Math.pow(value,2))
//                .forEach(value->{
//                    System.out.print(value+" ");
//                });
//
//        System.out.println();

//        names.stream()
//                .map(value->value.toLowerCase())
//                .forEach(value->{
//                    System.out.print(value+" ");
//                });


        // Multi Threading

//        Thread2 thread2 = new Thread2();
//        thread2.start();

//        Thread3 thread3 = new Thread3();
//        Thread thread = new Thread(thread3);
//        thread.start();

//        Thread2 thread2 = new Thread2(){
//            @Override
//            public void run() {
//                for(int i=1;i<=10;i++){
//                    try{
//                        Thread.sleep(1000);
//                        System.out.println("4 * "+i+" = "+4*i);
//                    } catch (Exception e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        };

//        thread2.start();

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for(int i=1;i<=10;i++){
//                    try{
//                        Thread.sleep(1000);
//                        System.out.println("5 * "+i+" = "+5*i);
//                    } catch (Exception e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        };
//
//        Runnable runnable1 = ()->{
//            for(int i=1;i<=10;i++){
//                try{
//                    Thread.sleep(1000);
//                    System.out.println("6 * "+i+" = "+6*i);
//                } catch (Exception e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        Thread thread = new Thread(runnable);
//        Thread thread1 = new Thread(runnable1);
//        thread1.start();
//
//       try {
//           thread1.join();
//       }catch (Exception e){
//           e.printStackTrace();
//       }
//
//        thread.start();

        StringBuffer stringBuffer = new StringBuffer();
//
       Thread thread1 = new Thread(){
           @Override
           public void run() {
               for(int i=0;i<1000;i++)
                   stringBuffer.append("A");
           }
       };

       Thread thread2 = new Thread(){
           @Override
           public void run() {
               for(int i=0;i<1000;i++)
                   stringBuffer.append("B");
           }
       };

//
//       thread1.start();
//       thread2.start();
//
//       try{
//           thread1.join();
//           thread2.join();
//       } catch (Exception e) {
//           e.printStackTrace();
//       }
//
//        System.out.println(stringBuffer.toString().length());

//        thread1.start();
//        try{
//            thread1.join();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        thread2.start();

//        thread2.start();
//        thread1.start();
//
//        try{
//            thread2.join();
//            thread1.join();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        System.out.println("The length of the String buffer is: "+stringBuffer.length());


        // Collection Framework

//        ArrayList

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(10,20,30,40,50,60,70,80,90,100));

//        System.out.println(arrayList);

        // iteration

//        for(int value:arrayList)
//            System.out.print(value+" ");
//
//        System.out.println();
//
//        arrayList.stream().forEach(value->{
//            System.out.print(value+" ");
//        });


        // insert

//        int no = s.nextInt();
//        for(int i=0;i<no;i++)
//            arrayList.add(s.nextInt());
//
//        System.out.println(arrayList);

        // finding element

//        int element = s.nextInt();
//        int updateElement = s.nextInt();

//        if(arrayList.contains(element))
//            System.out.println("Element is present in arrayList");
//        else
//            System.out.println("Element is not present in arrayList");

//        if(!arrayList.stream()
//                .filter(value->value==element)
//                .toList()
//                .isEmpty())
//            System.out.println("Present");
//        else
//            System.out.println("Absent");

//        int index = arrayList.indexOf(element);
//        if(index!=-1) {
//            arrayList.set(index, updateElement);
//            System.out.println(arrayList);
//        }
//        else
//            System.out.println("Element is missing");

        // delete

//        arrayList.remove(Integer.valueOf(element));
//        System.out.println(arrayList);


        // Deque

        Deque<Integer> deque = new ArrayDeque<Integer>(List.of(10,20,30,40,50,60,70,80,90,100));
//        System.out.println(deque);

        // iteration:

//        for(int value:deque)
//            System.out.print(value+" ");
//
//        System.out.println();
//
//        deque.stream()
//                .forEach(value->{
//                    System.out.print(value+" ");
//                });

//        System.out.println("The element at the front of the deque is:"+deque.peekFirst());
//        System.out.println("The element at the rare of the deque is:"+deque.peekLast());

        // insert

//        int first = s.nextInt();
//        int last = s.nextInt();
//
//        deque.addFirst(first);
//        deque.addLast(last);
//
//        System.out.println(deque);

        // delete

//        deque.remove(Integer.valueOf(s.nextInt()));
//        System.out.println(deque);


        // Hashmap

        Map<Integer,String> map = new HashMap<>(Map.of(1,"Aditya",2,"Sanjana",3,"Sandeep",4,"Mayur",5,"Sandesh",6,"Aaryaman",7,"Parth"));
//        System.out.println(map);

        // Iteration:

//        for(var pair:map.entrySet())
//            System.out.println(pair.getKey()+" "+pair.getValue());
//
//        System.out.println( );
//
//        map.forEach((key,value)->{
//            System.out.println(key+" "+value);
//        });

        // find by key

//        int key = s.nextInt();
//        if(map.containsKey(key))
//            System.out.println("Present");
//        else
//            System.out.println("Absent");

        // find by value
//
//        String value = s.nextLine();
//
//        if(map.containsValue(value))
//            System.out.println("Present");
//        else
//            System.out.println("Absent");


//        System.out.println("Enter the number of elements");
//        int no = s.nextInt();
//
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<no;i++){
//            System.out.println("Enter the elements");
//            list.add(s.nextInt());
//        }
//
//        System.out.println("Enter the target to be found");
//        int target = s.nextInt();
//
//        if(binarySearch(list,target,0,list.size()-1))
//            System.out.println("Element is present in the list");
//        else
//            System.out.println("Element is not present in the list");


//        setBits(15);

//        System.out.println(getCount("578378923"));

        System.out.println(decoder("yhqgz"));


    }

}