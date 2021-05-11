package com.mohit.ProjectApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mohit.ProjectApp.entity.Employee;
import com.mohit.ProjectApp.service.EmployeeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	

	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveall(employee);
	}
	
	@GetMapping("/{id}")
	public Employee findEmployeeById(@PathVariable("id") long id) {
		return employeeService.findEmpById(id);
	}
	
	@GetMapping("/all")
	@ResponseBody 
	public  List<Employee> listAllEmployees(Employee employee) {
		return employeeService.findAll(employee);
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	public Employee DeleteEmployee(@PathVariable("id") long id) {
		return employeeService.delete(id);
	}
	
}
