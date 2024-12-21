import java.util.*;


class MaxRange extends Exception{
    @Override
    public String getMessage() {
        return "Inputted number should be lesser than 100000";
    }
}
class DivisionByZero extends Exception{
    @Override
    public String getMessage() {
        return "Entered number should not be 0";
    }
}

class Calculator {
    public int a,b;
    public Calculator(int a,int b){
        this.a=a;
        this.b=b;
    }
    public Calculator(){

    }
    public int addition(int a,int b) throws MaxRange{
        if(a>=100000||b>=100000)
            throw new MaxRange();
        else
            return a+b;
    }
    public int subtraction(int a,int b) throws MaxRange{
        if(a>=100000||b>=100000)
            throw new MaxRange();
        else
            return a-b;
    }
    public int multiplication(int a,int b) throws MaxRange{
        if(a>=100000||b>=100000)
            throw new MaxRange();
        else
            return a*b;
    }
    public double ratio(double a,double b) throws MaxRange,DivisionByZero{
        if(a>=100000||b>=100000)
            throw new MaxRange();
        else if(b==0)
            throw new DivisionByZero();
        else
            return a/b;
    }
}

class ScientificCalculator{
    public int a,b;
    public ScientificCalculator(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int addition(int a,int b){
        int sum=0;
        if(a>100000||b>100000){
            try{
                throw new MaxRange();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else
           sum=a+b;
        return sum;
    }
    public int subtraction(int a,int b){
        int difference=0;
        if(a>100000||b>100000){
            try{
                throw new MaxRange();
            }catch (Exception e){
                e.printStackTrace();
            }
        }else
            difference=a-b;
        return difference;
    }
    public int product(int a,int b){
        int product=0;
        if(a>100000||b>100000){
            try{
                throw new MaxRange();
            }catch (Exception e){
                e.printStackTrace();
            }
        }else
            product=a*b;
        return product;
    }
    public double ratio(double a,double b){
        double ratio=0;
            if(a>100000||b>100000){
                try{
                    throw new MaxRange();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else if(b==0){
                try{
                    throw new DivisionByZero();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }else
                ratio=a/b;
            return a/b;

    }
}

public class Test {
    public static void iterateHashMap(Map<Integer,String> map){
        for(var pair:map.entrySet())
            System.out.println(pair.getKey()+" "+pair.getValue());
    }
    public static void main(String[] args) {

        //   Strings

//        String str1 = "Aditya";
//        String str2="Aditya K";
//         char arr[] = str1.toCharArray();
//         for(int i=0;i<arr.length;i++)
//             System.out.print(arr[i]+" ");
//        System.out.println();
//        System.out.println(str1.length());
//        if(str2.isEmpty())
//            System.out.println("The String is Empty");
//        else
//            System.out.println("The String is not Empty");
//        if(str1.equals(str2))
//            System.out.println("String are equal ");
//        else
//            System.out.println("Strings are not Equal");
//        if(str1.compareTo(str2)==0)
//            System.out.println("Strings are Equal");
//        else if(str1.compareTo(str2)>0)
//            System.out.println("String 1 is larger than String2");
//        else
//            System.out.println("String 2 is larger");
//        System.out.println(str2.substring(0,6));
//        if(str1.contains(str2))
//            System.out.println("String 1 is present in String 2");
//        else
//            System.out.println("String 1 is absent in String 2");


        // String Buffer

//        StringBuffer stringBuffer1 = new StringBuffer("Aditya Kelaskar");
//        StringBuffer stringBuffer2 = new StringBuffer("Kelaskar");
//        System.out.println(stringBuffer1);
//        System.out.println(stringBuffer1.length());
//        System.out.println(stringBuffer1.toString());
//        if(stringBuffer1.toString().contains(stringBuffer2))
//            System.out.println("string 1 is present in string 2");
//        else
//            System.out.println("String 1 is not present in String 2");
//        if(stringBuffer1.compareTo(stringBuffer2)==0)
//            System.out.println("Both Strings are equal");
//        else if(stringBuffer1.compareTo(stringBuffer2)>0)
//            System.out.println("String1 is bigger than String 2");
//        else
//            System.out.println("String 2 is greater than String 1");
//
//        System.out.println(stringBuffer1.delete(7,stringBuffer1.length()));


//        File Handling

//        File file = new File("C:\\Users\\Aditya\\Desktop\\Programing files all\\Java Backend\\CoreJava\\src\\FileHandling\\test.txt");
//        if(file.exists())
//            System.out.println("File is present");
//        else
//            System.out.println("File is absent");
//        System.out.println(file.length());

        // writing to the file using FileoutputStream
        Scanner s = new Scanner(System.in);
//        FileOutputStream fileOutPutStream = null;
//        try{
//            fileOutPutStream = new FileOutputStream(file,true) ;
//            String data = s.nextLine();
//            char[] dataArray = data.toCharArray();
//            int i=0;
//            while(i<dataArray.length)
//                fileOutPutStream.write(dataArray[i++]);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        finally {
//            fileOutPutStream.close();
//        }
//
        // Using Buffered Writter

//        FileWriter fileWriter = new FileWriter(file,true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        try{
//
//            String data = s.nextLine();
//            bufferedWriter.write(data);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        finally {
//            bufferedWriter.close();
//            System.out.println("File updated Successfully!!");
//        }


//        Reading Using Scanner

//        Scanner scanner = new Scanner(file);
//        while(scanner.hasNext())
//            System.out.println(scanner.nextLine());

//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line ="";
//        do{
//            line=bufferedReader.readLine();
//            System.out.println(line);
//        }
//        while(line!=null);

//        Exception Handling

//        System.out.println("Enter the 1st number");
//        int a = s.nextInt();
//        System.out.println("Enter the 2nd number");
//        int b = s.nextInt();
//        try{
//
//            System.out.println("The ratio of a and b is:"+a/b);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        finally {
//            System.out.println("Thike bhai mai chalta hu!!");
////        }
//        System.out.println("Enter a");
//        int a = s.nextInt();
//        System.out.println("Enter b");
//        int b = s.nextInt();
//        Calculator calculator = new Calculator(a,b);
//        try{
//            System.out.println("The Addition of a and b is:"+calculator.addition(a,b));
//            System.out.println("The Subtraction of a and b is:"+calculator.subtraction(a,b));
//            System.out.println("The Product of a and b is:"+calculator.multiplication(a,b));
//            System.out.println("The Ratio of a and b is:"+calculator.ratio(a,b));
//        } catch (MaxRange|DivisionByZero e) {
//            System.out.println("Error:"+e.getMessage());
//        }

//        MyThread thread1 = new MyThread();
//        RunnableThread thread2 = new RunnableThread();
//        Thread thread = new Thread(thread2);
//        thread1.run();
//        thread.run();

//        Arraylist

//        ArrayList<Integer> arrayList =new ArrayList<Integer>();
//        System.out.println("Enter the number of elements");
//        int no=s.nextInt();
//        System.out.println("Enter the elements");

        // input

//        for(int i=0;i<no;i++){
//            int element = s.nextInt();
//            arrayList.add(element);
//        }

        //  output

//        System.out.println(arrayList);

        //iteration

//        for(int val:arrayList)
//            System.out.print(val+" ");

        // remove

//        int element = s.nextInt();
//        arrayList.remove(Integer.valueOf(element));
//        System.out.println("Enter the index on which value has to be removed");
//        int index=s.nextInt();
//        arrayList.remove(index);
//        System.out.println(arrayList);

        // update

//        System.out.println("Enter the element which has to be entered");
//        int element = s.nextInt();
//        System.out.println("Enter the index at which it has to be entered");
//        int index = s.nextInt();
//        arrayList.set(index,element);
//        System.out.println(arrayList);

//        contains

//        System.out.println("Enter the element which has to be searched ");
//        int element=s.nextInt();
//        if(arrayList.contains(element))
//            System.out.println("Element is present");
//        else
//            System.out.println("Element is absent");

//        clear

//        arrayList.clear();
//        System.out.println(arrayList);

//        addAll

//        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
//        arrayList1.add(1);
//        arrayList1.add(2);
//        arrayList1.add(3);
//        arrayList1.add(4);
//        arrayList1.addAll(arrayList);
//        System.out.println(arrayList1);


//        Deque

//        Deque<Integer> deque = new ArrayDeque<Integer>();
//        System.out.println("Enter the number of elements");
//        int no = s.nextInt();

//        Input

//        System.out.println("Enter the elements");
//        for(int i=0;i<no;i++){
//            int element = s.nextInt();
//            deque.add(element);
//        }

//        Output

//        System.out.println(deque);

//        front and rare operations

//        System.out.println("Enter the element at front");
//        int front = s.nextInt();
//        System.out.println("Enter the element at rare");
//        int rare=s.nextInt();
//        deque.addFirst(front);
//        deque.addLast(rare);
//        System.out.println(deque);
//        System.out.println("Element at front is:"+deque.peek());
//        System.out.println("Element at peek Front is:"+deque.peekFirst());
//        System.out.println("Element at Last element is:"+deque.peekLast());

//        Remove element

//        deque.remove();
//        System.out.println(deque);
//        System.out.println("Enter the element to be removed");
//        int element = s.nextInt();
//        deque.remove(Integer.valueOf(element));
//        System.out.println(deque);
//        deque.removeFirst();
//        deque.removeLast();
//        System.out.println(deque);

//        iteration

//        for(int val:deque)
//            System.out.print(val+" ");

//        contains

//        System.out.println("Enter the element to be searched in the deque");
//        int element = s.nextInt();
//        if(deque.contains(Integer.valueOf(element)))
//            System.out.println("Element is present");
//        else
//            System.out.println("Element is absent");

//        HashMap

        Map<Integer,String> map = new HashMap<Integer,String>();
//        System.out.println("Enter the no of key-value pair");
//        int no = s.nextInt();

        // input

//        System.out.println("Enter the key-value pair");
//        for(int i=0;i<no;i++){
//            System.out.println("Enter the Key");
//            int key=s.nextInt();
//            System.out.println("Enter the value");
//            String value=s.next();
//            map.put(key,value);
//        }
        map.put(1,"Aditya");
        map.put(2,"Paaji");
        map.put(3,"Parth");
        map.put(4,"Sandesh");
        map.put(5,"Varad");
//        System.out.println(map);

//        iteration

//        on Key based

//        for(var key:map.keySet())
//            System.out.print(key+" ");

//        on Value based

//        for(var value:map.values())
//            System.out.print(value+" ");

//        both key and value base

//        for(var pair:map.entrySet())
//            System.out.println(pair.getKey()+" "+pair.getValue());


//        Remove Element from Map

//        System.out.println("Enter the key which has to be removed from the HashMap");
//        int key = s.nextInt();
//        System.out.println("Enter the value which has to be removed from HashMap");
//        String value = s.next();
//        map.remove(key,value);
//        iterateHashMap(map);

//        update

//        System.out.println("Enter the key for which the value has to be updated");
//        int key = s.nextInt();
//        System.out.println("Enter the value which has to be updated");
//        String value = s.next();
//        map.put(key,value);
//        iterateHashMap(map);

//        Contains

//        System.out.println("Enter the key which has to be searched in the Map");
//        int key = s.nextInt();
//        if(map.containsKey(key))
//            System.out.println("Key is Present in the Map");
//        else
//            System.out.println("Key is not present in the Map");
//
//        System.out.println("Enter the value to be searched in the Map");
//        String value = s.next();
//        if(map.containsValue(value))
//            System.out.println("value is Present in the Map");
//        else
//            System.out.println("value is not present in the Map");


//        HashSet

//        HashSet<Integer> hashSet = new HashSet<>();
//        System.out.println("Enter the number of elements");
//        int no = s.nextInt();

        // Input

//        System.out.println("Enter the elements");
//        for(int i=0;i<no;i++)
//            hashSet.add(s.nextInt());


//        Output

//        System.out.println(hashSet);

        // Iteration:
//        for(var value:hashSet)
//            System.out.println(value+" ");

//        Remove

//        System.out.println("Enter the value to be removed from hashset");
//        int value = s.nextInt();
//        hashSet.remove(Integer.valueOf(value));
//        System.out.println(hashSet);

//        Contains

//        System.out.println("Enter the value which has to be searched from the hashset");
//        int value = s.nextInt();
//        if(hashSet.contains(value))
//            System.out.println("Element is present in the Hashset");
//        else
//            System.out.println("Element is absent in the Hashset");


//        Stack

        Stack<String> stack = new Stack<>();

//        Input

//        System.out.println("Enter the number of elements to be entered in the Stack");
//        int no = s.nextInt();
//        System.out.println("Enter the names ");
//        for(int i=0;i<no;i++){
//            String name = s.next();
//            stack.push(name);
//        }
        stack.add("Aditya");
        stack.add("Varad");
        stack.add("Parth");
        stack.add("Paaji");
        stack.add("Sandesh");

//        System.out.println(stack);

//        Iteration

//        for(var value:stack)
//            System.out.println(value+" ");

//        Pop

//        stack.pop();
//        System.out.println(stack);

//        Remove

//            System.out.println(stack);
//        System.out.println("Enter the value to be removed");
//        String value = s.next();
//        stack.remove(value);
//        System.out.println("enter the index at which value has to be removed");
//        int index = s.nextInt();
//        stack.remove(index);
//        stack.removeElementAt(index);
//        System.out.println(stack);

//        Contains

//        String value = s.next();
//        if(stack.contains(value))
//            System.out.println("Value is Present in the Stack");
//        else
//            System.out.println("value is Absent in the Stack");

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        System.out.println("Enter the number of the ");
//        int no = s.nextInt();
//        System.out.println("Enter the elements");
//        for(int i=0;i<no;i++){
//            int value = s.nextInt();
//            linkedList.add(Integer.valueOf(value));
//        }
//        for(var value:linkedList)
//            System.out.println(value+" ");




    }
}