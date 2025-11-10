
import java.util.ArrayList;
import java.util.function.Consumer;

// @FunctionalInterface
// interface Consumer<T> {
//     void accept(T t);
// }

class Employeee {
    String name;
    double salary;

    Employeee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeConsumerExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Employees
        ArrayList<Employeee> employees = new ArrayList<>();

        employees.add(new Employeee("Laxmi", 50000));
        employees.add(new Employeee("Neha", 60000));

        // Consumer to give bonus
        Consumer<Employeee> giveBonus = (e) -> e.salary += 5000;

        // Consumer to display employee details
        Consumer<Employeee> show = (e) ->
            System.out.println(e.name + " => " + e.salary);

        employees.forEach(giveBonus);
        employees.forEach(show);

         // // Apply both Consumers using andThen()
        // employees.forEach(giveBonus.andThen(show));
    }
}
