public class OuterClass{
static String msg = "Kiet group of institutions";
public static class NestedStaticClass{
   public  void printMessage(){
    System.out.println("Message " +msg);
  }
}
public static void main(String[] args) {
    OuterClass.NestedStaticClass ns=new OuterClass.NestedStaticClass();
    ns.printMessage();  //no need to make an object here
    
}
} 

