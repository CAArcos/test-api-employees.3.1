package com.carcos.employeeapi.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carcos.employeeapi.entity.Employee;
import com.carcos.employeeapi.repository.EmployeeRepository;
import com.carcos.employeeapi.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository repoEmp;

	@Override
	public List<Employee> listarEmpleados() {
		return repoEmp.findAll();
	}

	@Override
	public void guardar(Employee employee) {
		repoEmp.save(employee);
	}

	@Override
	public void eliminar(int id) {
		repoEmp.deleteById(id);
	}

}
