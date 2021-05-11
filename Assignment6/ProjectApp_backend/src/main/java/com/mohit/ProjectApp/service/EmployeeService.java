package com.mohit.ProjectApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.ProjectApp.entity.Employee;
import com.mohit.ProjectApp.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveall(Employee employee) {
		return employeeRepository.save(employee);
		
	}  
	
	public Employee findEmpById(long id) {
		return employeeRepository.findById(id);
	}
	
	public List<Employee> findAll(Employee employee){
		return employeeRepository.findAll();
	}

	public Employee delete(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.deleteById(id);
	}

	


	
	

}


