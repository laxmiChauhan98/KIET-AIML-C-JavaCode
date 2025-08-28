// Abstract class
abstract class Employeee {
    String name="Shikha";

    // Abstract method (no body --→ must be implemented in child)
    abstract void calculateSalary();

    // Normal method
    void empDetails() {
        System.out.println("Employee Name: " + name);
    }
}

// Child class
class FullTimeEmployee extends Employeee {
    int workingDays;
    int perDaySalary;

    // Implement abstract method
    @Override
    void calculateSalary() {
        System.out.println("Full-time Employee's Salary: " +(workingDays*perDaySalary) );
    }
}

// Another Child class
class PartTimeEmployee extends Employeee {
    int hourlyRate, hours;

    PartTimeEmployee(String name, int hourlyRate, int hours) {
        super();
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    // Implement abstract method
    @Override
    void calculateSalary() {
        System.out.println("Part-time Salary: " + (hourlyRate * hours));
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Employeee e1 = new FullTimeEmployee();
        Employeee e2 = new PartTimeEmployee("Suman", 200, 50);

        e1.empDetails();
        e1.calculateSalary();

        e2.empDetails();
        e2.calculateSalary();
    }
}
