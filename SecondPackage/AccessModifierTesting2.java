package SecondPackage;
import FirstPackage.*;

public class AccessModifierTesting2 extends Emp_AccessModifier {
    public static void main(String[] args) {   
        
        AccessModifierTesting2 amt=new AccessModifierTesting2();
        amt.Emp_id=3;
      //  amt.Salary=1111111;
      //  amt.Emp_Name="Rajesh";
        amt.Designation="Associate Professor";
        amt.employeeDetails();
    

    //  Emp_AccessModifier eam=new Emp_AccessModifier();
    //     eam.Emp_id=2;
    //     eam.Salary=2000000;   
    //     eam.Emp_Name="Shubhii";
    //     eam.Designation="Professor";
    // eam.employeeDetails();

    }
    
}
