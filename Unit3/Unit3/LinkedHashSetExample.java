package Unit3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);

        System.out.println("LinkedHashSet is: "+numbers);


        HashSet<Integer> hs=new HashSet<>();
        hs.add(12); 
        hs.add(21);
         
         hs.add(111);
         System.out.println("HashSet is: "+hs);

        LinkedHashSet<Integer> number1=new LinkedHashSet<>();
         number1.add(21);
         number1.add(12);
         number1.add(111);
        
         System.out.println("LinkedHashSet is: "+number1);   

         TreeSet<Integer> ts=new TreeSet<>();
         ts.add(21);
         ts.add(12);
         ts.add(111);
         System.out.println("TreeSet is: "+ts);





         //union- addALL , intersection- retainAll , difference- removeAll

         number1.addAll(numbers);
         System.out.println("After union Set2: "+number1);

         number1.removeAll(numbers);
         System.out.println(number1);

         number1.retainAll(numbers);

         System.out.println(number1);
    }
    
}
