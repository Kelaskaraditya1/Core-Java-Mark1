package Java8.MethodReferences;

public class Reference1 {
    public Reference1(){

    }
    public static void getTable2(){
        for(int i=1;i<=10;i++){
            System.out.println("2 * "+i+" = "+2*i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void getTable4(){
        for(int i=1;i<=10;i++){
            System.out.println("4 * "+i+" = "+4*i );
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
