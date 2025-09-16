package Unit3;



import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector <String> vc=new Vector<>(4,1);

        System.out.println(vc.capacity());
        
        vc.add("1");
        vc.add("2");
        vc.add("3");
        vc.add("4");
        vc.add("5");
        
        System.out.println(vc.capacity());
        
 
        System.out.println(vc.size());

        System.out.println("Vector is: "+vc);

        //Add All

         Vector <String> vc2=new Vector<>();
          vc2.add("A");
          vc2.add("B");
          vc2.add("C");

        System.out.println("Second vector is: "+vc2);

        vc.addAll(vc2);
        System.out.println(vc);

        //First Element

        System.out.println(vc.firstElement());


        //Last Element


        System.out.println(vc.lastElement());

        //------clear method
        vc.clear();
        System.out.println("Values of VC are: "+vc);

        // System.out.println("---------------");

        // System.out.println("First element is: "+vc.firstElement());

        // System.out.println("Last element is: "+vc.lastElement());


      

    }
}
