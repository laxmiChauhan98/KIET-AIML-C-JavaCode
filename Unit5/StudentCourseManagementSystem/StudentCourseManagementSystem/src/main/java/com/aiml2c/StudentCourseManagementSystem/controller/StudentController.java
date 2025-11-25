package com.aiml2c.StudentCourseManagementSystem.controller;

import com.aiml2c.StudentCourseManagementSystem.model.Student;
import com.aiml2c.StudentCourseManagementSystem.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // Create
    @PostMapping
    public Student add(@RequestBody Student s) {
        return service.addStudent(s);
    }

    // Read all
    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    // Read one
    @GetMapping("/{id}")
    public Student getOne(@PathVariable Long id) {
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
