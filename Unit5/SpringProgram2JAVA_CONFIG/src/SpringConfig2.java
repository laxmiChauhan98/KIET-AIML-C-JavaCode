import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig2 {
    @Bean("bean1")
    public Student2 stdId1(){
        Student2 stObj1=new Student2();
        stObj1.setName("LaxmiJava");
        stObj1.setRollno(9);
        stObj1.setEmail("Java@gmail.com");
        return stObj1;
    }
      @Bean("bean2")
    public Student2 stdId2(){
        Student2 stObj1=new Student2();
        stObj1.setName("Shikha");
        stObj1.setRollno(10);
        stObj1.setEmail("Shikha@gmail.com");
        return stObj1;
    }
    
}
