package Runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Beans.SpringConfig4;
import Beans.Student4;



public class Main4 {
    public static void main(String[] args) {

      
   
     ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig4.class);
   
            Student4 st1 = (Student4) context.getBean(Student4.class);
            st1.display();
        
    }
    
}

/* 1. spring-beans-xxx.jar
   2. spring-core-xxx.jar
   3. spring-context-xxx.jar
   4. common-logging-xxx.jar
   5. spring-expression-xxx.jar
   
*/ 

