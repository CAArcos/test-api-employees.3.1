package com.carcos.employeeapi.service;

import java.util.List;

import com.carcos.employeeapi.entity.Employee;

public interface IEmployeeService {

	List<Employee> listarEmpleados();
	void guardar(Employee employee);
	void eliminar(int id);
}
