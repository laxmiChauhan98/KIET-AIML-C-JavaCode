package Beans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Beans")
public class SpringConfig5 {

    @Bean
    public Address2 AddId1(){
        Address2 adObj1=new Address2(6929,"Ghaziabad",201007);
        // adObj1.sethouseNo(6929);
        // adObj1.setCity("Delhi");
        // adObj1.setPinCode(201003);
        return adObj1;
    }
    @Bean
    public Student5 stdId5(){
        Student5 stObj1=new Student5(101,"Shivani",AddId1());
        // stObj1.setName("Vidhi");
        // stObj1.setRollno(10);
        // stObj1.setAddress(AddId1());
        return stObj1;
    }
    
}
