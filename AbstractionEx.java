abstract class College{
    
    abstract void Registration();
    abstract void Infrastructure();
    abstract void Employees();
    abstract void Student();


    void medicalFacilities(){
        System.out.println("Medical facilities are there.");
    }
}
class Kiet extends College{
   public void Registration(){
        System.out.println("College is registered");
    }
   public void Infrastructure(){
        System.out.println("Insfrasturcture is ready");
    }
    void Employees(){
        System.out.println("All Hirings are completed");
    }
    void Student(){
        System.out.println("Counselling has been done, We are good to go");
    }
    void medicalFacilities(){
        
        System.out.println("There is a hospital in kiet");
    }

}


public class AbstractionEx {
    public static void main(String[] args) {
        
    College c=new Kiet();
    c.Registration();
    c.Infrastructure();
    c.Employees();
    c.Student();
    c.medicalFacilities();
    

    }

}