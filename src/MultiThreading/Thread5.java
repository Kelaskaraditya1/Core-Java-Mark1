package MultiThreading;

public class Thread5 extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("5 * "+i+" = "+5*i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
