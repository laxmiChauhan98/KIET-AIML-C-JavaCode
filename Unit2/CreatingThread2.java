package Unit2;

class MyTask implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class CreatingThread2 {
    public static void main(String[] args) {
        // Runnable ka object
        MyTask task = new MyTask();

        // pass Runnable to Thread 
        Thread t = new Thread(task);
       
        t.start();

        System.out.println("Current Thread: " + Thread.currentThread().getName());
    } 
}
