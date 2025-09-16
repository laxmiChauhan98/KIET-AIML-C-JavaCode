package Unit3;

import java.util.LinkedHashSet;


public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);

        System.out.println("LinkedHashSet is: "+numbers);

        LinkedHashSet<Integer> number1=new LinkedHashSet<>();
         number1.add(21);
         number1.add(12);
         number1.add(111);
        
         System.out.println("HashSet 2: "+number1);

         //union- addALL , intersection- retainAll , difference- removeAll

         number1.addAll(numbers);
         System.out.println("After union Set2: "+number1);

         number1.removeAll(numbers);
         System.out.println(number1);

         number1.retainAll(numbers);

         System.out.println(number1);
    }
    
}
