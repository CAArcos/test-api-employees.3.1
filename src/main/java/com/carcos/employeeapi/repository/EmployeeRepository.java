package com.carcos.employeeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carcos.employeeapi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
