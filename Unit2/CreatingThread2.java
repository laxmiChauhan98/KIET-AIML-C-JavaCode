

class MyTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running...");
        try{
        Thread.sleep(10000);
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
}
public class CreatingThread2 {
    public static void main(String[] args) {
        // Runnable object
        MyTask task = new MyTask();

        // pass Runnable to Thread 
        Thread t = new Thread(task);  
        t.start();

        Thread t2 = new Thread(task);
        t2.start();

        Thread t3 = new Thread(task);
        t3.start();

        System.out.println("Current Thread: " + Thread.currentThread().getName());
    } 
}
