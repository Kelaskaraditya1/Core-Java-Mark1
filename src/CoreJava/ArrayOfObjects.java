package CoreJava;
import java.util.*;
public class ArrayOfObjects {
    public static void printSudten(Student student)
    {
        System.out.println("The sid of the Student is:"+student.sid);
        System.out.println("The name of the Student is:"+student.name);
        System.out.println("The roll no of the Student is:"+student.roll_no);
        System.out.println("The div of the Student is:"+student.div);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of Students");
        int no=s.nextInt();
        Student student[] = new Student[no];
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter details of Student "+(i+1));
            System.out.println("Enter the sid of the Student");
            String sid=s.next();
            System.out.println("Enter the name of the Student");
            String name=s.next();
            System.out.println("Enter the roll no of the Student");
            int roll_no=s.nextInt();
            System.out.println("Enter the Div of Student");
            char div=s.next().charAt(0);
            student[i]=new Student(sid,name,roll_no,div);
        }
        System.out.println("Enter the no of student for printing");
        int n=s.nextInt();
        Student student1=student[n];
        ArrayOfObjects.printSudten(student1);
    }
}
