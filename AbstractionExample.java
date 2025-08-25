// Abstract class
abstract class Employee {
    String name;

    // Abstract method (no body --→ must be implemented in child)
    abstract void calculateSalary();

    // Normal method
    void empDetails() {
        System.out.println("Employee Name: " + name);
    }
}

// Child class
class FullTimeEmployee extends Employee {
    int workingDays;
    int perDaySalary;

    // Implement abstract method
    @Override
    void calculateSalary() {
        System.out.println("Full-time Employee's Salary: " +(workingDays*perDaySalary) );
    }
}


public class AbstractionExample {
    public static void main(String[] args) {


        FullTimeEmployee e1 = new FullTimeEmployee();
        e1.name="Shikha";
        e1.workingDays=25;
        e1.perDaySalary=2500;
        e1.empDetails();
        e1.calculateSalary();

        
    }
}
