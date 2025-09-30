package Unit2;


class ThreadDemo extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("First thread is running");
             
    }
}
}

public class CreatingThread1 {
    public static void main(String[] args) {
        ThreadDemo t1=new ThreadDemo();
        t1.start();     
    }
    
}








// try{
//         Thread.sleep(1000);
//         }catch(InterruptedException ie){
//             System.out.println(ie);
//         }