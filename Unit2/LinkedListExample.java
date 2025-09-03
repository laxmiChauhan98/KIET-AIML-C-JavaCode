package Unit2;
import java.util.*;

public class LinkedListExample{
    public static void main(String[] args) {

        // Create LinkedList of Employees
        LinkedList<String> employees = new LinkedList<>();

        // -------------------- ADD Methods --------------------
        employees.add("John");                          // add at end
        employees.add(1, "Raj");           // add at index
        employees.addFirst("Sophia");                 // add at beginning
        employees.addLast("Arjun");                  // add at end

        System.out.println("Employees after adding: " + employees);   



        // -------------------- ACCESS Methods --------------------
        System.out.println("Get First: " + employees.getFirst());
        System.out.println("Get Last: " + employees.getLast());
        System.out.println("Get index 2: " + employees.get(2));



        // -------------------- SET Method --------------------
        employees.set(2, "Priya"); // replace index 2
        System.out.println("After set(2, 'Priya'): " + employees);



        // -------------------- REMOVE Methods --------------------
        employees.remove();                     // remove first
        employees.remove("Raj");             // remove by object
        employees.remove(1);            // remove at index
        employees.removeFirst();             // remove first element
        employees.removeLast();             // remove last element
        System.out.println("Employees after removals: " + employees);



        // -------------------- SEARCH Methods --------------------
        employees.add("Meena");
        employees.add("John");
        System.out.println("Contains 'John'? " + employees.contains("John"));
        System.out.println("Index of 'John': " + employees.indexOf("John"));
        System.out.println("Last index of 'John': " + employees.lastIndexOf("John"));



        // -------------------- SIZE --------------------
        System.out.println("Size of list: " + employees.size());



        // -------------------- ITERATION --------------------
        System.out.println("\nIterating with for-each:");
        for(String emp : employees){
            System.out.println(emp);
        }

        System.out.println("\nIterating with Iterator:");
        Iterator<String> it = employees.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Traversing the list of elements in reverse order 
        
        // System.out.println("\nReverse Order:");
        // Iterator i =employees.descendingIterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }


        // -------------------- CLEAR --------------------
        employees.clear();
        System.out.println("\nAfter clear: " + employees);
    }
}

