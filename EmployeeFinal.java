 public class EmployeeFinal{
    
    final String org_name;
    EmployeeFinal(){
        org_name="KIET";
    }

     void methodDemo(){
        System.out.println("This is a final method!");
    }

    void CollegeName(){
        System.out.println("Organisation is: "+org_name);
    }


    
}

class FinalDemo extends EmployeeFinal{

    void methodDemo(){
        super.methodDemo();
        System.out.println("Overrided Demo method");
    }
   public static void main(String[] args) {
        // EmployeeFinal ef=new EmployeeFinal();
        
        // ef.CollegeName();

        // EmployeeFinal ef2=new EmployeeFinal();
       
        // ef2.CollegeName();

        FinalDemo fd=new FinalDemo();
        fd.CollegeName();
        fd.methodDemo();


    }

}
 
