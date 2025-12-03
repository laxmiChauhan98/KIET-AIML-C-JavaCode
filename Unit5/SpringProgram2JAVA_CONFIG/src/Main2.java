import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main2 {
    public static void main(String[] args) {

      
     ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig2.class);
     //1. Calling object via method name 
       //  Student2 st1 = (Student2) context.getBean("stdId1");
      //   st1.display();

     //2. Calling object via class name  
        //    Student2 st1 = (Student2) context.getBean(Student2.class);
        //    st1.display();

    //3. Calling object via Bean name
            Student2 st1 = (Student2) context.getBean("bean1");
            st1.display();


       System.out.println("-----------------------------------");
    Student2 st2 = (Student2) context.getBean("bean2");
       st2.display();

        
    }
    
}

/* 1. spring-beans-xxx.jar
   2. spring-core-xxx.jar
   3. spring-context-xxx.jar
   4. common-logging-xxx.jar
   5. spring-expression-xxx.jar
   6. spring-aop-vvv.jar  ----extra jar
   
*/ 

