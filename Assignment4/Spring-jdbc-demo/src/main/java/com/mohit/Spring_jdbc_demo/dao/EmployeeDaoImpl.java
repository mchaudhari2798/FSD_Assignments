package com.mohit.Spring_jdbc_demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mohit.Spring_jdbc_demo.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addEmployee(Employee employee) {
		
		String sql = "insert into employeedetails values(?,?,?) ";
		int result = jdbcTemplate.update( sql,employee.getId(), employee.getName(),employee.getEmail());
//		System.out.println(result);
//		if(result == 1) {
//			System.out.println("RECORD INSERTED ....");
//		}
//		else {
//			System.out.println("FAILED TO INSERT....");
//		}
		
		return result;
	}

	public int updateEmployee(Employee employee) {

		String sql = "update employeedetails set Name ='"+employee.getName()+"' where id = "+employee.getId()+" ";
		int result = jdbcTemplate.update(sql);
		return result;
	}

	public int deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql =  " delete from employeedetails where id = "+employee.getId()+" ";
		int result = jdbcTemplate.update(sql);
		
		return result;
		
		
		
	}

	public void getEmployee(int id) {
		// TODO Auto-generated method stub
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter id");
//		int Empid = sc.nextInt();
		
	
		String sql = "select * from  employeedetails where id= ? ";
		List<Map<String, Object>> result = jdbcTemplate.queryForList(sql, id);
		
		
		System.out.println(result);
		
	
		
		 
	}

	public List<Employee> getAllEmployes() {
		// TODO Auto-generated method stub
		
		String sql =" select * from employeedetails";
		 List<Map<String, Object>> result= jdbcTemplate.queryForList(sql);
		 
		 
	        System.out.println("All Employee data");
	        
	        System.out.println(result);
		
		
		return null;
	}

}
