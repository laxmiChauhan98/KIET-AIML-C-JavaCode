package Beans;


public class Student5 {
    
    private String name;   
    private int rollno;
    private Address2 address;

    public Student5(int rollno, String name, Address2 address){
        this.rollno=rollno;
        this.name=name;
        this.address=address;
    }


    public void display(){
        System.out.println("Roll No: "+rollno+"\n"+"Name: "+name +"\n"+ "Address : "+address);
    }

    
    
}
