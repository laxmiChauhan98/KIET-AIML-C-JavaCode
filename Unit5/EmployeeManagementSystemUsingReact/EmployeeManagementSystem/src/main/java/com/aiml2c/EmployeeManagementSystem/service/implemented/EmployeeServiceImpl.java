package com.aiml2c.EmployeeManagementSystem.service.implemented;

import com.aiml2c.EmployeeManagementSystem.entity.Employee;
import com.aiml2c.EmployeeManagementSystem.repository.EmployeeRepository;
import com.aiml2c.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Employee addEmployee(Employee emp) {
        return repo.save(emp);
    }

    @Override
    public Employee updateEmployee(Long id, Employee emp) {
        Employee old = repo.findById(id).orElse(null);

        if (old != null) {
            old.setName(emp.getName());
            old.setEmail(emp.getEmail());
            old.setDepartment(emp.getDepartment());
            old.setSalary(emp.getSalary());
        }
        return repo.save(old);
    }

    @Override
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
