interface Collegee {
    int a=10;  //public static final

    void Registration();
    void Infrastructure();
    void Employees();
    void Student();

    private void concreteMethod(){
        System.out.println("Private concrete inside interface");
    }
    default void defMethod(){
        concreteMethod();
        System.out.println("Default concrete inside interface");
    }
    static void conMethod(){
        System.out.println("Static concrete inside interface");
    }

}

class Kiett implements Collegee{
    public void Registration(){
        System.out.println("College is registered");
    }
   public void Infrastructure(){
        System.out.println("Insfrasturcture is ready");
    }
    public void Employees(){
        System.out.println("All Hirings are completed");
    }
   public void Student(){
        System.out.println("Counselling has been done, We are good to go");
    }
    
}
public class InterFaceEx {
    public static void main(String[] args) {
        Collegee c;
     
        c=new Kiett();
        c.Registration();
        c.Infrastructure();
        c.Employees();
        c.Student();

        c.defMethod();
        Collegee.conMethod();

        System.out.println(Collegee.a);
    }
}
