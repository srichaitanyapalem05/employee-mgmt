package com.ems.employee_mgmt.repository;

import com.ems.employee_mgmt.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}