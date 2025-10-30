

class Basket {
    int data;
    boolean empty = true;

    synchronized void produce(int value) {
        while (!empty) {
            try {
                 wait();
             } catch (InterruptedException e) {
                System.out.println(e);
             }
        }
        data = value;
        empty = false;
        System.out.println("Produced: " + data);
        notify();
    }
    synchronized int consume() {
        while (empty) {
            try { wait();   
             } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        empty = true;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

class Producer extends Thread {
    Basket b;
    Producer(Basket b) { 
        this.b = b;
     }

    public void run() {
        for (int i = 1; i <= 5; i++) {
        b.produce(i);
        }
    }
}

class Consumer extends Thread {
    Basket b;
    Consumer(Basket b) {
         this.b = b;
         }

    public void run() {
        for (int i = 1; i <= 5; i++) {
         b.consume();
        }
    }
}

public class InterThreadCom{
    public static void main(String[] args) {
        Basket basket = new Basket();
        new Producer(basket).start();
        new Consumer(basket).start();
        
    }
}
