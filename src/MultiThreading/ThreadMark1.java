package MultiThreading;
class Thread1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<100)
        {
            System.out.println("I am Ironman");
            i++;
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<100)
        {
            System.out.println("I am Batman");
            i++;
        }
    }
}
public class ThreadMark1 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
}
