import MultiThreading.MyThread;
import MultiThreading.RunnableThread;

import java.util.Scanner;

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

        MyThread thread1 = new MyThread();
        RunnableThread thread2 = new RunnableThread();
        Thread thread = new Thread(thread2);
        thread1.run();
        thread.run();

    }
}
