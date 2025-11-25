package MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService7 {

    @Autowired
    private StudentRepository repo;

    public void addStudent() {
        repo.save();
    }
}

