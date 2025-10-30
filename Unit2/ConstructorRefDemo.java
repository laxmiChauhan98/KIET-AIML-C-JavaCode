

import java.util.*;
import java.util.stream.*;

class Student {
    int id;

    // Constructor
    Student(int id) {
        this.id = id;
        System.out.println("Student created with ID: " + id);
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(101, 102, 103);

        System.out.println("=== Traditional Way ===");
        List<Student> list1 = new ArrayList<>();
        for (int id : ids) {
            list1.add(new Student(id));   // Normal constructor call
        }

        System.out.println("\n=== Using Constructor Reference ===");
        List<Student> list2 = ids.stream()
                                 .map(Student::new)  // Method Reference
                                 .collect(Collectors.toList());
    }
}

