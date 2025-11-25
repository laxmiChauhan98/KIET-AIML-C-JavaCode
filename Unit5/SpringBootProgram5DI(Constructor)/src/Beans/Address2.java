package Beans;

public class Address2 {

    private int houseNo;
    private String city;
    private int pinCode;

   public Address2(int houseNo, String city, int pinCode){
    this.houseNo=houseNo;
    this.city=city;
    this.pinCode=pinCode;
   }
    public String toString(){
        return houseNo+", "+city+"- "+pinCode;
    }
}
