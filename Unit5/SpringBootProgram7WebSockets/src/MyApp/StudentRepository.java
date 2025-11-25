package MyApp;


import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public void save() {
        System.out.println("Student saved to DB!");
    }
}
