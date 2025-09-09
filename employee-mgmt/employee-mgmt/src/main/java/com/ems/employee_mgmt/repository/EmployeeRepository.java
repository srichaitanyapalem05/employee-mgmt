package com.ems.employee_mgmt.repository;

import com.ems.employee_mgmt.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



    List<Employee> findByDepartment_DeptId(Integer deptId);
    List<Employee> findBySalaryGreaterThanEqual(Double salary);
}