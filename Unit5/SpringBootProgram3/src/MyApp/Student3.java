package MyApp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student3 {
    @Value("Vidhi Chauhan")
    private String name;
    @Value("11")
    private int rollno;
    @Value("Vidhi@gmail.com")
    private String email;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void display(){
        System.out.println("Roll No: "+rollno+"\n"+"Name: "+name +"\n"+ "Email: "+email);
    }
    
    
}
