package KIET;

public class AccessModifierTesting {

    public static void main(String[] args) {
        Emp_AccessModifier eam=new Emp_AccessModifier();
        eam.Emp_id=1;
      //  eam.Salary=2000000;   //This is not visible
        eam.Emp_Name="Divya";
        eam.Designation="Assistant Professor";

        eam.employeeDetails();
    }


    
}
