package Unit3;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector <String> vc=new Vector<>(3);

        System.out.println(vc.capacity());
        vc.add("1");
        vc.add("2");
        vc.add("3");
        System.out.println(vc.capacity());
        vc.add("4");
        // vc.addElement("4");
        System.out.println(vc.capacity());  
        System.out.println(vc.size());

        System.out.println(vc);


         Vector <String> vc2=new Vector<>();
          vc2.add("A");
          vc2.add("B");
          vc2.add("C");

        System.out.println(vc2);

        vc.addAll(vc2);
        System.out.println(vc);

        System.out.println("---------------");

        System.out.println(vc.firstElement());

        System.out.println(vc.lastElement());


      

    }
}
