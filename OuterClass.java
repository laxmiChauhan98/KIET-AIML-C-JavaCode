public class OuterClass{
static String msg = "Kiet group of institutions";
public static class NestedStaticClass{
   public static void printMessage(){
    System.out.println("Message " +msg);
  }
}
public static void main(String[] args) {
    OuterClass.NestedStaticClass.printMessage();  //no need to make an object here
    
}
} 

