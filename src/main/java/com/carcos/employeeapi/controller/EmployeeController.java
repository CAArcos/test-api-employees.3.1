package com.carcos.employeeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carcos.employeeapi.service.IEmployeeService;
import java.util.List;
import com.carcos.employeeapi.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private IEmployeeService serviceEmp;

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/empleados")
	public List<Employee> listarEmpleados() {
		return serviceEmp.listarEmpleados();
	}

	@PostMapping("/empleados/guardar")
	public Employee guardar(@RequestBody Employee employee) {
		serviceEmp.guardar(employee);
		return employee;
	}

	@PutMapping("/empleados/modificar")
	public Employee modificar(@RequestBody Employee employee) {
		serviceEmp.guardar(employee);
		return employee;
	}

	@DeleteMapping("/empleados/eliminar/{id}")
	public String eliminar(@PathVariable("id") int id) {
		serviceEmp.eliminar(id);
		return "Registro eliminado";
	}
}
