package com.mohit.Spring_jdbc_demo.dao;

import java.util.List;

import com.mohit.Spring_jdbc_demo.entities.Employee;

public interface EmployeeDao {
	public int addEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public int deleteEmployee(Employee employee);
	public void getEmployee(int id);
	
	public List<Employee> getAllEmployes();
}
