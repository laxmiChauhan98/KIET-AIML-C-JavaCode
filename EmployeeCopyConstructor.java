public class EmployeeCopyConstructor {
    int Emp_id;
    String Emp_name;
    
    EmployeeCopyConstructor(int i, String name){
        Emp_id=i;
        Emp_name=name;
    }
    EmployeeCopyConstructor(EmployeeCopyConstructor s2){
        Emp_id=s2.Emp_id;
        Emp_name=s2.Emp_name;
    }

    void printInfo(){
        
        System.out.println("Details of Employee are: " +Emp_id +" "+Emp_name);
    }

    public static void main(String[] args) {
        EmployeeCopyConstructor ecc=new EmployeeCopyConstructor(101, "Divya");
        ecc.printInfo();

        EmployeeCopyConstructor copy=new EmployeeCopyConstructor(ecc);
        copy.printInfo();

        copy.Emp_id=200;
        System.out.println("Details after changeing the values");
        copy.printInfo();
        ecc.printInfo();




        // EmployeeCopyConstructor copy;
        // copy=ecc;
        // copy.printInfo();

        // copy.Emp_id=2;
        // copy.Emp_name="Shubhi";
        // System.out.println("Details after chnage by copy: ");
        // copy.printInfo();
        // ecc.printInfo();

    }

}
