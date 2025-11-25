package Runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Beans.SpringConfig5;
import Beans.Student5;



public class Main5 {
    public static void main(String[] args) {

      
     @SuppressWarnings("resource")
     ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig5.class);
   
            Student5 st1 = (Student5) context.getBean(Student5.class);
            st1.display();
        
    }
    
}

/* 1. spring-beans-xxx.jar
   2. spring-core-xxx.jar
   3. spring-context-xxx.jar
   4. common-logging-xxx.jar
   5. spring-expression-xxx.jar
   
*/ 

