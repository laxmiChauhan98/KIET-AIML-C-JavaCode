

class Counter1 extends Thread {
    int count = 0;

    synchronized void increment() {
         for (int i = 0; i < 1000; i++){
           count++;
         }
           
    }
    public void run(){
        increment();
    }
}


public class ThreadSyncExample1 {
    public static void main(String[] args) throws InterruptedException {
        Counter1 t1 = new Counter1();

        Counter1 t2=new Counter1();
       

        t1.start();
        t2.start();

        t1.join();
        t2.join();

         System.out.println("Final Count c1: " + t1.count);
        System.out.println("Final Count c2: " + t2.count);
       
    }
}
