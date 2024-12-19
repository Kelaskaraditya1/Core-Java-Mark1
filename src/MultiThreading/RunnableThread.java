package MultiThreading;
public class RunnableThread implements Runnable{
    @Override
    public void run() {
        for(int i=10;i>=1;i--){
            System.out.println("2 * "+i+" = "+2*i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
