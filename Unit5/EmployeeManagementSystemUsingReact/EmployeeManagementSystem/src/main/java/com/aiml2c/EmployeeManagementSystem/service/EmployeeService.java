package com.aiml2c.EmployeeManagementSystem.service;

import com.aiml2c.EmployeeManagementSystem.entity.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee addEmployee(Employee emp);
    Employee updateEmployee(Long id, Employee emp);
    void deleteEmployee(Long id);
}

