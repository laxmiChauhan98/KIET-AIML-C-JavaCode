package Beans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Beans")
public class SpringConfig4 {

    @Bean
    public Address AddId1(){
        Address adObj1=new Address();
        adObj1.sethouseNo(6929);
        adObj1.setCity("Delhi");
        adObj1.setPinCode(201003);
        return adObj1;
    }
    @Bean
    public Student4 stdId4(){
        Student4 stObj1=new Student4();
        stObj1.setName("Vidhi");
        stObj1.setRollno(10);
        stObj1.setAddress(AddId1());
        return stObj1;
    }
    
}
