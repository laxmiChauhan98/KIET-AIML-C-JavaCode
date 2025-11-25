package Beans;

public class Address8 {

    private int houseNo;
    private String city;
    private int pinCode;

    public void sethouseNo(int houseNo) {
        this.houseNo = houseNo;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    
    public String toString(){
        return houseNo+", "+city+"- "+pinCode;
    }
}
