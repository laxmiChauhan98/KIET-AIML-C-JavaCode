package com.aiml2c.StudentCourseManagementSystem.controller;

import com.aiml2c.StudentCourseManagementSystem.model.Student;
import com.aiml2c.StudentCourseManagementSystem.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController   //this class will handle REST API requests
@RequestMapping("/api/students")  //Sets a common base URL for all endpoints
@CrossOrigin("*")   //Allow ALL origins(React, Angular, Vue, Postman, Browser)
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {  //constructor dependency
        this.service = service;
    }

    // Create
    @PostMapping
    public Student add(@RequestBody Student s) { //JSON data from frontend is converted into a Student object.
        return service.addStudent(s);
    }

    // Read all
    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    // Read one
    @GetMapping("/{id}")
    public Student getOne(@PathVariable Long id) { //@pathvariable It convert URL's “/5” ko id=5.
        return service.getById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student s) {
        return service.updateStudent(id, s);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.deleteStudent(id);
    }
}
