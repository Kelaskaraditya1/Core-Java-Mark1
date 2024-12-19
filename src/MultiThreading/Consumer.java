package MultiThreading;
public class Consumer extends Thread {
    public Company company;
    public Consumer(Company company){
        this.company=company;
    }
    @Override
    public void run() {
        while(true){
            company.consumeResource();
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
