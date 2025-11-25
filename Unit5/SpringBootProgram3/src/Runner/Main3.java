package Runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import MyApp.SpringConfig3;
import MyApp.Student3;



public class Main3 {
    public static void main(String[] args) {

      
     @SuppressWarnings("resource")
     ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig3.class);
   
            Student3 st1 = (Student3) context.getBean(Student3.class);
            st1.display();


        
    }
    
}

/* 1. spring-beans-xxx.jar
   2. spring-core-xxx.jar
   3. spring-context-xxx.jar
   4. common-logging-xxx.jar
   5. spring-expression-xxx.jar
   
*/ 

