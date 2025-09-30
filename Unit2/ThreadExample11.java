package Unit2;


class ThreadDemo1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){

               try{ Thread.sleep(500);
       }
       catch(InterruptedException e){
        System.out.println(e);
       }
        System.out.println(Thread.currentThread().getName()+" is running ");
    
        }

    }
}

public class ThreadExample11 {
    public static void main(String[] args) {
        ThreadDemo1 t1=new ThreadDemo1();
       t1.setName("First thread");
        t1.start();   
        

        ThreadDemo1 t2=new ThreadDemo1();
    
        t2.setName("Second thread");
        t2.start();



    }
    
}







//    try {
//             if (Thread.currentThread().getName().equals("Thread-0")) { 
//                 // sirf t thread (Thread-0) ke liye
//                 System.out.println(Thread.currentThread().getName() + " is going to sleep...");
//                 Thread.sleep(2000); // 2 sec ke liye rukega
//             }
//             System.out.println(Thread.currentThread().getName() + " is running...");
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }