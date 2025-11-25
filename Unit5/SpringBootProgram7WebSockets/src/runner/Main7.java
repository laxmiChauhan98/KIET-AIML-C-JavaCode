package runner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import MyApp.NotificationController;
import MyApp.StudentRepository;
import MyApp.StudentService7;
import MyApp.WebSocketConfig;

public class Main7 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        ApplicationContext context =
                new AnnotationConfigApplicationContext(WebSocketConfig.class, 
                                                       StudentService7.class, 
                                                       StudentRepository.class, 
                                                       NotificationController.class);

        // Get service bean
        StudentService7 service = context.getBean(StudentService7.class);

        // Add student (business logic)
        service.addStudent();

        // Send notification
        NotificationController controller = context.getBean(NotificationController.class);
        controller.sendStudentAddedNotification("Laxmi");

        System.out.println("Spring WebSocket and Service demo finished.");
    }
}
