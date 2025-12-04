package com.aiml2c.StudentCourseManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity  //class = table, variables = columns (This class will map with table in DB)
public class Student {

    @Id   //to define primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //DB will generate auto increment ID numbers
    private Long id;

    private String name;
    private String course;
    private int marks;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
}
