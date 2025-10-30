

import java.util.ArrayList;
import java.util.function.Predicate;


// interface Predicate<T> {
//     boolean test(T t);
// }
class Employeeee {
    String name;
    double salary;

    Employeeee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeePredicateExample {
    public static void main(String[] args) {

        // Creating an ArrayList of employees
        ArrayList<Employeeee> employees = new ArrayList<>();
        employees.add(new Employeeee("Laxmi", 50000));
        employees.add(new Employeeee("Neha", 60000));
        employees.add(new Employeeee("Riya", 40000));

        // Predicate to check if employee salary > 50000
        Predicate<Employeeee> highSalary = e -> e.salary > 50000;

        // Filter and print
        for (Employeeee e : employees) {
            if (highSalary.test(e)) {
                System.out.println(e.name + " has high salary");
            }
        }
    }
}

