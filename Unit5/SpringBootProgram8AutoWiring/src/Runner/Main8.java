package Runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Beans.SpringConfig8;
import Beans.Student8;



public class Main8 {
    public static void main(String[] args) {

      
     
     ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig8.class);
   
            Student8 st1 = (Student8) context.getBean(Student8.class);
            st1.display();
        
    }
    
}

/* 1. spring-beans-xxx.jar
   2. spring-core-xxx.jar
   3. spring-context-xxx.jar
   4. common-logging-xxx.jar
   5. spring-expression-xxx.jar
   
*/ 

