package com.aiml2c.StudentCourseManagementSystem.service;

import org.springframework.stereotype.Service;
import com.aiml2c.StudentCourseManagementSystem.model.Student;
import com.aiml2c.StudentCourseManagementSystem.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {  //Constructor injection
        this.repo = repo;
    }

    public Student addStudent(Student s) {  
        /* addStudent method accepts a Student object.
           repo.save(s) inserts the student into the database. */
        return repo.save(s);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Student getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Student updateStudent(Long id, Student newData) {
        return repo.findById(id)
                .map(s -> {
                    s.setName(newData.getName());
                    s.setCourse(newData.getCourse());
                    s.setMarks(newData.getMarks());
                    return repo.save(s);
                }).orElse(null);
    }

    public String deleteStudent(Long id) {
        repo.deleteById(id);
        return "Deleted!";
    }
}

