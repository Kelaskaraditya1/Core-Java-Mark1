package MultiThreading;

public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("Programme Started .....");
        Thread.currentThread().setName("Optimus Prime");

//        Thread.sleep() should be used during implementation and not with Object of Thread.
//        try{
//            // for holding the Thread
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(Thread.currentThread().getName());
//        MyThread thread1 = new MyThread();
//        thread1.setPriority(Thread.NORM_PRIORITY);
//        RunnableThread thread2 = new RunnableThread();
//        Thread thread = new Thread(thread2);
//        thread.setPriority(Thread.NORM_PRIORITY);
//        thread.start();
        
        /*  Thread.join() method
         thread 1 will start after complete execution of Thread
         execution of 1 thread will be stopped until complete execution of another thread.
        */
//        try{
//            thread.join();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        thread1.start();
//        System.out.println("The priority of Runnable Thread is:"+thread.getPriority());
//        System.out.println("The priority of Normal Thread is:"+thread1.getPriority());


        /*Thread.yield()
        * */
//        Thread3 thread3 = new Thread3();
//        Thread4 thread4 = new Thread4();
//        Thread5 thread5 = new Thread5();
//        thread3.setPriority(Thread.NORM_PRIORITY);
//        thread4.setPriority(Thread.NORM_PRIORITY);
//        thread5.setPriority(Thread.NORM_PRIORITY);
//        thread3.start();
//        thread4.start();
//        thread5.start();

        /* Interrupt method
        for interrupt thread should be in sleep state / waiting state.
        it can be done using thread.sleep() or thread.join()
        once it is in waiting stage than , interrupt method can be executed so that the thread cannot be executed further.
        if thread is not in waiting state than it will continue execution normally.
        * */

//        Thread3 thread3 = new Thread3();
//        Thread4 thread4 = new Thread4();
//        thread3.start();
//        thread3.interrupt();
//        thread4.start();
//        System.out.println("Programme ended ....");


        // Producer and consumer Problem
        Company company = new Company();
        Consumer consumer = new Consumer(company);
        Producer producer = new Producer(company);
        consumer.start();
        producer.start();

    }

}
