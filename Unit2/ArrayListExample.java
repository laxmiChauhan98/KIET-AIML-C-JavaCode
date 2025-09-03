package Unit2;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        

        // Create ArrayList
        ArrayList<String> employees = new ArrayList<>();

        // 1. add() - to add elements 
        employees.add("John");
        employees.add("Alice");
        employees.add("Bob");
        employees.add("Eve");
        System.out.println("Employees: " + employees);

        // 2. add(index, element) - Adding at particular index 
        employees.add(2, "Charlie");
        System.out.println("After adding Charlie at index 2: " + employees);

        // 3. get(index) - element fetch 
        System.out.println("Employee at index 1: " + employees.get(1));

        // 4. set(index, element) - element update 
        employees.set(3, "David");
        System.out.println("After updating index 3: " + employees);

        // 5. remove(index) - index se remove
        employees.remove(2);
        System.out.println("After removing index 2: " + employees);

        // 6. remove(object) - object se remove
        employees.remove("Eve");
        System.out.println("After removing Eve: " + employees);

        // 7. contains(object) - check whether element exists or not 
        System.out.println("Contains Alice? " + employees.contains("Alice"));

        // 8. size() - total elements
        System.out.println("Size of ArrayList: " + employees.size());

        // 9. isEmpty() - check whether list is empty or not
        System.out.println("Is ArrayList empty? " + employees.isEmpty());

        // 10. Iterating using for-each loop
        System.out.println("\nIterating employees:");
        for (String emp : employees) {
            System.out.println(emp);
        }

        // 11. clear() - saare elements delete
        employees.clear();
        System.out.println("After clear(): " + employees);
    }
}
