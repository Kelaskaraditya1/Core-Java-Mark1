package MultiThreading;

public class Company {
    public int resource;
    boolean status=false;
    synchronized public void produceResources(int resource){
        if(status){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        this.resource=resource;
        System.out.println("The Resource "+this.resource+" has been produced ");
        status=true;
        notify();
    }
    synchronized public int consumeResource(){
        if(!status){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("The Resource "+this.resource+" has been consumed");
        status=false;
        notify();
        return this.resource;
    }
}
