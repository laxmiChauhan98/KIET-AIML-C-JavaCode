package FirstPackage;

public class Emp_AccessModifier {

    
    public int Emp_id;     //public access modifier
    private int Salary;        //private access modifier
    String Emp_Name;                 //Default access modifier
    protected String Designation; //protetced


    public void employeeDetails(){
        System.out.println("Details: " +"\n"+Emp_id+" "+Salary+" "+Emp_Name+" "+Designation);
    }

public static void main(String[] args) {
    Emp_AccessModifier eam=new Emp_AccessModifier();
        eam.Emp_id=2;
        eam.Salary=2000000;   
        eam.Emp_Name="Shubhii";
        eam.Designation="Professor";
    eam.employeeDetails();
}
    
}
