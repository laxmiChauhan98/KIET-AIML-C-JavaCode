package Beans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Beans")
public class SpringConfig8 {

    @Bean
    public Address8 AddId1(){
        Address8 adObj1=new Address8();
        adObj1.sethouseNo(6929);
        adObj1.setCity("Delhi");
        adObj1.setPinCode(201003);
        return adObj1;
    }
    @Bean
    public Address8 AddId2(){
        Address8 adObj2=new Address8();
        adObj2.sethouseNo(2003);
        adObj2.setCity("Haridwar");
        adObj2.setPinCode(249402);
        return adObj2;
    }
    @Bean
    public Student8 stdId4(){
        Student8 stObj1=new Student8();
        stObj1.setName("Vidhi");
        stObj1.setRollno(10);
      //  stObj1.setAddress(AddId1());  //mannually Dependency Injection
        return stObj1;
    }
    
}
