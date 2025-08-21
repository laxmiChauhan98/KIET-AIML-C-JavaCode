public class EmployeeStatic {

    int id;
    String name;
    static String department;   //to store the common properties
    static String Org;

    public void showDetails(){

        Org="Kiet";
        
        System.out.println("Id: "+id +"\n Name: "+name+" \n Department: "+department+ "\n Organisation:" +Org);
    }

    static{
        System.out.println(".....Static block is calling here.....");
        Org="KIET Groups of Institutions";
        System.out.println("Department name in static block is: "+Org);
       
    }

    public static void main(String[] args) {


        
        EmployeeStatic es1=new EmployeeStatic();   //object creation

        es1.id=101;
        es1.name="Laxmi";
        EmployeeStatic.department="AIML";
        EmployeeStatic.Org="KIET";

       // es1.showDetails();

        EmployeeStatic es2=new EmployeeStatic();
        es2.id=102;
        es2.name="Laxmi Chauhan";
    

       // es2.showDetails();

        EmployeeStatic es3=new EmployeeStatic();
        es3.id=103;
        es3.name="Abhijeet";

         // es3.showDetails();

        System.out.println(" \n Department: "+department+ "\n Organisation:" +Org);

      


    }
    
}
