

class BankAccount1 {
   static int balance = 10000;

     static synchronized void withdraw(int amount) {
    //    System.out.println("Hello Customer");
    //    System.out.println("Pin verification");
    //    System.out.println("Hello Customer");
    //    System.out.println("Pin verification");

   
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Not enough balance!");
        
    }

    }
}


// Thread class
class WithdrawThreads extends Thread {
    BankAccount1 account;
    int amount;

    WithdrawThreads(BankAccount1 account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount); 
    }
}

public class SynchronizedExampleMutualExclusion {
    public static void main(String[] args) {
        BankAccount1 b1 = new BankAccount1();

        WithdrawThreads t1 = new WithdrawThreads(b1, 4000);
        WithdrawThreads t2 = new WithdrawThreads(b1,  3000);

        t1.start();
        t2.start();


         BankAccount1 b2 = new BankAccount1();

        WithdrawThreads t3 = new WithdrawThreads(b2, 4000);
        WithdrawThreads t4 = new WithdrawThreads(b2,  3000);

        t3.start();
        t4.start();

    }
}
