// Parent class
 sealed class EmployeeSystem permits Manager, Developer, Intern {

    String name;
    double salary;

    public EmployeeSystem(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void display(){
        System.out.println(name + " earns " + salary);
    }
}

// only these 3 are allowed to extend Employee

final class Manager extends EmployeeSystem{
    public Manager(String name, double salary){
        super(name, salary);
    }
}

non-sealed class Developer extends EmployeeSystem {
    public Developer(String name, double salary){
        super(name, salary);
    }
}

final class Intern extends EmployeeSystem{
    public Intern(String name, double salary){
        super(name, salary);
    }
}


public class sealedDemo {
    public static void main(String[] args) {

        EmployeeSystem e1 = new Manager("Priya", 95000);
        EmployeeSystem e2 = new Developer("Rahul", 80000);
        EmployeeSystem e3 = new Intern("Ananya", 15000);

        e1.display();
        e2.display();
        e3.display();
    }
}


