package com.aiml2c.EmployeeManagementSystem.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.aiml2c.EmployeeManagementSystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
