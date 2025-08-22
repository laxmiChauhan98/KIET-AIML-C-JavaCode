class Employee{
    int Emp_id;
    String Emp_name;
    static String Organisation="KIET";
    
    void details(){
        System.out.println("  Emp ID: " +Emp_id +"\n"+"  Name: "+Emp_name+"\n"+"  Organisation: "+Organisation);
    }
}

class Faculty extends Employee{
    String Department;
    String subject;
    String Designation;
    void facultyDetails(){
        System.out.println("  Department: "+Department +"\n"+"  Subject: "+subject+"\n"+"  Designation:"+Designation);
    }  
    
}

class Staff extends Employee{
    String expertise;
    char shift;
    void staffDetails(){
        System.out.println(Emp_name+" is working as "+expertise+"\n"+"  Shift is: " +shift);
    }
}

public class InheritanceHierarchial {

    public static void main(String[] args) {

    Faculty f=new Faculty();
    f.Emp_id=101;
    f.Emp_name="Deepak Kumar";
    f.Department="AIML";
    f.subject="Maths";
    f.Designation="Assitant Professor";


    System.out.println("Details of the Faculties are:" );    
    f.details();
    f.facultyDetails();

    System.out.println("--------------------------------------");

    Staff s1=new Staff();

    s1.Emp_id=111;
    s1.Emp_name="Sudesh";
    s1.expertise="Electrician";
    s1.shift='A';

    System.out.println("Details of Staff Members:");
    s1.details();
    s1.staffDetails();

     System.out.println("--------------------------------------");

    Staff s2=new Staff();
    s2.Emp_id=222;
    s2.Emp_name="Rama";
    s2.expertise="Security Guard";
    s2.shift='B';

    s2.details();
    s2.staffDetails();


        
    }
    
}
