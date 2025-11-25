package com.aiml2c.StudentCourseManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aiml2c.StudentCourseManagementSystem.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Simple CRUD methods are already provided by JpaRepository
}
