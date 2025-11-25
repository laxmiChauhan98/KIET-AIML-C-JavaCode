package Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student8 {
    
    private String name;   
    private int rollno;
 
    @Autowired
    @Qualifier("AddId2")   //to remove confusion if we have 2 beans objects of same class
    private Address8 address;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
  
    /* Remove getter and setter also of Address8  */
    //     public Address8 getAddress() {
    //     return address;
    // }
    // public void setAddress(Address8 address) {
    //     this.address = address;
    // }

    public void display(){
        System.out.println("Roll No: "+rollno+"\n"+"Name: "+name +"\n"+ "Address : "+address);
    }

    
    
}
