class EmployeeEncap{
    private int salary;            //Data hiding
    private String password="KIET@123";

    public void setSalary(int salary, String pswd){
        if(pswd.equals(password)){

        this.salary=salary;

        System.out.println("Salary is credited succesfully");
        }
        else{
            System.out.println("No Info Available");
        }
    }

    public int getSalary(String pswd){
        if(pswd.equals(password)){
            System.out.println("Amount is: "+salary);
            //  return salary;
        }
        else{
            System.out.println("Wrong Password: Access Denied");
        }
        return -1;
       
    }
}
public class EncapsuLation{
    public static void main(String[] args) {
        
    EmployeeEncap ee=new EmployeeEncap();
    ee.setSalary(10000000, "KIET@123");
    ee.getSalary("KIET@123");

    }
    
}
