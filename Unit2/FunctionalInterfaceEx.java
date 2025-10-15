package Unit2;

@FunctionalInterface
 interface Bird {
    void canFly();  
}

// class Eagle implements Bird{
//     public void canFly(){
//         System.out.println("Eagle can fly");
//     }
// }
public class FunctionalInterfaceEx {
    public static void main(String[] args) {

       /*---------------- Using class object------------- */ 
        // Eagle e=new Eagle();
        // e.canFly();

        /*--------------- Using anonymous class --------- */
        // Bird b=new Bird() {
        // public void canFly(){
        // System.out.println("Eagle can fly");
        //         }
        // };
        // b.canFly();

        /* --------------Using lambda ----------- */
        Bird b=()->{
            System.out.println("Eagle can fly");
        };
        b.canFly();
    }
}
