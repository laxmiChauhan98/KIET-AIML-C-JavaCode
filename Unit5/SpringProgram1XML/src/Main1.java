import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main1 {
    public static void main(String[] args) {

        String config_loc="applicationContext.xml";

        ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
       Student1 st1 = (Student1) context.getBean("stdInfo1");
       st1.display();
       System.out.println("-----------------------------------");
        Student1 st2 = (Student1) context.getBean("stdInfo2");
       st2.display();

        
    }
    
}

/* 1. spring-beans-vvv.jar
   2. spring-core-vvv.jar
   3. spring-context-vvv.jar
   4. common-logging-vvv.jar
   5. spring-expression-vvv.jar
      
*/ 

