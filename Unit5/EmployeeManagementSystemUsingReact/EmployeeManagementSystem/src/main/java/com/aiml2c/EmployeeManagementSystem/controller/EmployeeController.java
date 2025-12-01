package com.aiml2c.EmployeeManagementSystem.controller;


import com.aiml2c.EmployeeManagementSystem.entity.Employee;
import com.aiml2c.EmployeeManagementSystem.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:3000")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAll() {
        log.info("Fetching all employees");
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) {
        log.info("Fetching employee with ID: {}", id);
        return service.getEmployeeById(id);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp) {
        log.info("Adding new employee");
        return service.addEmployee(emp);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee emp) {
        log.info("Updating employee {}", id);
        return service.updateEmployee(id, emp);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        log.info("Deleting employee {}", id);
        service.deleteEmployee(id);
    }
}

