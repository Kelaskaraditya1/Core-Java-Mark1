package MultiThreading;
class Thread3 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("3 * "+i+" = "+3*i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Thread4 extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("4 * "+i+" = "+4*i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class RunnableInterfaceMark1 {
    public static void main(String[] args) {
        Thread3 thread3 = new Thread3();
        Thread thread1 = new Thread(thread3);
        Thread4 thread4 = new Thread4();
        Thread thread2 = new Thread(thread4);
        thread1.start();
        thread2.start();
    }
}
