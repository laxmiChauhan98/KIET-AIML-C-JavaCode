class EmployeePoly{
    String Emp_name;
    

    void Emp_details(){
        System.out.println("Name of the Employee is: "+Emp_name);
    }

    //Method overloading or Compile time Polymorphism

    void Emp_details(int salary){
        System.out.println("Salary of the Employee is: " +salary);
    }    

    void Emp_details(String company){
        System.out.println("Institute name is: " +company);

    }
}
class Faculties extends EmployeePoly{

    void Emp_details(){
        super.Emp_details();
        super.Emp_details("ABES");
        System.out.println("Welcome "+Emp_name);
    }

}
public class PolyMorphism {
      public static void main(String[] args) {
        EmployeePoly emp=new EmployeePoly();
        emp.Emp_name="Ayushi";
        emp.Emp_details();

        emp.Emp_details(300000);

        emp.Emp_details("KIET");

        Faculties f=new Faculties();
        f.Emp_name="Shikha Chauhan";
        f.Emp_details(); 
}
}
