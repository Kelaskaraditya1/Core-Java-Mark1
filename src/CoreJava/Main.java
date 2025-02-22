package CoreJava;
import java.util.*;
public class Main {
    public String name;
    public static void main(String[] args) {
        // printing to console
        System.out.println("I am Ironman");
        // input
        Scanner s = new Scanner(System.in);
        String sid=s.next();
        String name=s.next();
        int roll_no=s.nextInt();
        char div=s.next().charAt(0);
        Student student1 = new Student(sid,name,roll_no,div);
        Student.printStudent(student1);
    }
}
