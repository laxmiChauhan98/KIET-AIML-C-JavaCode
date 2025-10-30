
import java.util.ArrayList;
import java.util.function.Consumer;

// @FunctionalInterface
// interface Consumer<T> {
//     void accept(T t);
// }

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeConsumerExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Employees
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Laxmi", 50000));
        employees.add(new Employee("Neha", 60000));

        // Consumer to give bonus
        Consumer<Employee> giveBonus = (e) -> e.salary += 5000;

        // Consumer to display employee details
        Consumer<Employee> show = (e) ->
            System.out.println(e.name + " => " + e.salary);

        employees.forEach(giveBonus);
        employees.forEach(show);

         // // Apply both Consumers using andThen()
        // employees.forEach(giveBonus.andThen(show));
    }
}
