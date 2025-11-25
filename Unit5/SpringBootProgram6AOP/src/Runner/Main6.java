package Runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import MyApp.SpringConfig6;
import MyApp.StudentService6;

public class Main6 {
    public static void main(String[] args) {

        ApplicationContext context =
            new AnnotationConfigApplicationContext(SpringConfig6.class);

        StudentService6 service = context.getBean(StudentService6.class);

        service.addStudent();
        service.updateStudent();
        service.deleteStudent();
    }
}



/* 1. spring-beans-xxx.jar
   2. spring-core-xxx.jar
   3. spring-context-xxx.jar
   4. common-logging-xxx.jar
   5. spring-expression-xxx.jar
   
*/ 

