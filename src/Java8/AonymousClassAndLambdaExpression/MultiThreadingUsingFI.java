package Java8.AonymousClassAndLambdaExpression;

public class MultiThreadingUsingFI {
    public static void main(String[] args) {
        Runnable runnable2 = ()->{
            for(int i=1;i<=10;i++){
                System.out.println("2 * "+i+" = "+2*i);
                try{
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable runnable3 =()->{
            for(int i=1;i<=10;i++){
                System.out.println("3 * "+i+" = "+3*i);
                try{
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        thread2.start();
        thread3.start();
        try {
            thread2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
