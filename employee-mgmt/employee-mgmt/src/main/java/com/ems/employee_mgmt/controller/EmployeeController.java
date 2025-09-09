package com.ems.employee_mgmt.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import com.ems.employee_mgmt.model.Employee;
import com.ems.employee_mgmt.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Add new employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getOne(@PathVariable Integer id) {
        return employeeRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Employee> update(
            @PathVariable Integer id,
            @RequestBody Employee input) {

        return employeeRepository.findById(id).map(e -> {
            e.setFullName(input.getFullName());
            e.setEmail(input.getEmail());
            e.setSalary(input.getSalary());
            if (input.getDepartment() != null) {
                e.setDepartment(input.getDepartment());
            }
            return ResponseEntity.ok(employeeRepository.save(e));
        }).orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!employeeRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        employeeRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/by-dept/{deptId}")
    public List<Employee> getByDept(@PathVariable Integer deptId) {
        return employeeRepository.findByDepartment_DeptId(deptId);
    }
    @GetMapping("/min-salary/{amount}")
    public List<Employee> getBySalary(@PathVariable Double amount) {
        return employeeRepository.findBySalaryGreaterThanEqual(amount);
    }


}