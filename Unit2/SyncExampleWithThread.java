

class BankAccount extends Thread {
    static int balance = 5000;
    int amount;
    BankAccount(int amount){
        this.amount=amount;
    }

    static synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        }
         else {
            System.out.println(Thread.currentThread().getName() + " - Not enough balance!");
        }
    }
      public void run(){
        withdraw(amount);
    }
}

public class SyncExampleWithThread {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(4000);
        b1.start();



         BankAccount b2 = new BankAccount(3000);
         b2.start();
         
   
    }
}

