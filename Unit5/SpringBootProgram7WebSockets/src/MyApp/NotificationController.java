package MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    @Autowired
    private SimpMessagingTemplate template;

    public void sendStudentAddedNotification(String name) {
        template.convertAndSend("/topic/updates",
                "New Student Added: " + name);
    }
}
