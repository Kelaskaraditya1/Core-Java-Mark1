package CoreJava;
public class Student {
    public String name,sid;
    public int roll_no;
    public char div;

    public Student(String sid,String name,int roll_no,char div)
    {
        this.sid=sid;
        this.name=name;
        this.roll_no=roll_no;
        this.div=div;
    }
    public Student(String name,int roll_no,char div)
    {
        this.name=name;
        this.roll_no=roll_no;
        this.div=div;
    }
    public Student()
    {}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public char getDiv() {
        return div;
    }

    public void setDiv(char div) {
        this.div = div;
    }
    public static void printStudent(Student student)
    {
        System.out.println("The sid of the Student is:"+student.sid);
        System.out.println("The name of the Student is:"+student.name);
        System.out.println("The roll no of the Student is:"+student.roll_no);
        System.out.println("The div of the Student is:"+student.div);
    }
}
