public final class EmployeeFinal{
    final String companyName = "KIET Groups";  // final member variable
    String Emp_name;

 
    // Constructor to initialize empId
    // EmployeeFinal(int empId, String name) {
    //     System.out.println(empId);
    //     this.empId = empId;
    //     this.name = name;
    // }

    final void displayInfo() {
        System.out.println("Company: " + companyName);
        //System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + Emp_name);
    }



    public static void main(String[] args) {
        EmployeeFinal e1 = new EmployeeFinal();
        e1.Emp_name="Laxmi";
      //  e1.companyName="KGIT";
        e1.displayInfo();

       // e1.companyName="KIET";

       //  e1.empId = 202; // ERROR: Cannot assign a value to final variable empId
    }
}

// class Test extends EmployeeFinal{



    // public void displayInfo(){  //this can not be override
    //     System.out.println("Overriding Final Method");
    // }
    

//}

 
