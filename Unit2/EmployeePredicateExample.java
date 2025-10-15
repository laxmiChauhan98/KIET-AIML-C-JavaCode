package Unit2;

import java.util.ArrayList;
import java.util.function.Predicate;


// interface Predicate<T> {
//     boolean test(T t);
// }
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeePredicateExample {
    public static void main(String[] args) {

        // Creating an ArrayList of employees
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Laxmi", 50000));
        employees.add(new Employee("Neha", 60000));
        employees.add(new Employee("Riya", 40000));

        // Predicate to check if employee salary > 50000
        Predicate<Employee> highSalary = e -> e.salary > 50000;

        // Filter and print
        for (Employee e : employees) {
            if (highSalary.test(e)) {
                System.out.println(e.name + " has high salary");
            }
        }
    }
}

