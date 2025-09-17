package Unit3;

import java.util.TreeSet;


public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> fruits =new TreeSet<>();
       
        fruits.add(3);
        fruits.add(2);
        fruits.add(4);
        fruits.add(1);

        System.out.println("TreeSet elements are: "+fruits);

        TreeSet<String> ts=new TreeSet<>();
        ts.add("Apple");
        ts.add("apple");
        ts.add("Banana");
        ts.add("Grapes");
       
        System.out.println(ts);        
    }
    
}
