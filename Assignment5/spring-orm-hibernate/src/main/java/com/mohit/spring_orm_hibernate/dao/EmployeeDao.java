package com.mohit.spring_orm_hibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.mohit.spring_orm_hibernate.entities.Employee;

public class EmployeeDao {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	// insert
	@Transactional
	public int addEmployee(Employee employee) {
		Integer rows = (Integer)hibernateTemplate.save(employee);
		return rows;
	}
	
	// updated
	
	@Transactional
	public void updateEmployee(Employee newEmployee1) {
		this.hibernateTemplate.update( newEmployee1);
	}
	
	//delete
	@Transactional
		public void deleteEmployee(int id) {
			Employee employee = hibernateTemplate.get(Employee.class, id);
			this.hibernateTemplate.delete(id);
		}
	
	// get all emplopyess list
		public List<Employee> getAllEmployee(){
			List<Employee> employee = this.hibernateTemplate.loadAll(Employee.class);
			return employee;
		}
	
	
	// get employee by id
	public Employee getEmployeeById(int id ) {
		Employee employee = hibernateTemplate.get(Employee.class, id);
		return employee;
	}
	
	
	

}
