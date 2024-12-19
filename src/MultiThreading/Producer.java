package MultiThreading;

public class Producer extends Thread{
    public Company company;
    public Producer(Company company){
        this.company=company;
    }
    @Override
    public void run() {
        int i=0;
        while(true){
            company.produceResources(i++);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
