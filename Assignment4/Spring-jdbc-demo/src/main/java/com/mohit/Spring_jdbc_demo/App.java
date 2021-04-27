package com.mohit.Spring_jdbc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;


import com.mohit.Spring_jdbc_demo.dao.EmployeeDaoImpl;
import com.mohit.Spring_jdbc_demo.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	System.out.println("Appplication Started....");
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	EmployeeDaoImpl daoimpl = context.getBean("empDao",EmployeeDaoImpl.class);
//    			
//    			Insert
//    	Employee employee = new Employee();
//    	employee.setId(9);
//    	employee.setName("Rohan");
//    	employee.setEmail("Rohan@gmail.com");
//    	
//    	 int result = daoimpl.addEmployee(employee);
//         System.out.println("("+result+") rows inserted..");
         
         
    	// delete
    	
//         Employee employee1 = new Employee();
//         employee1.setId(9);
//         int result1 = daoimpl.deleteEmployee(employee1);
//         System.out.println("("+result1+") rows Deleted..");
    	
    	// UPdate
    	
//        Employee employee2 = new Employee();
//        employee2.setName("Tushar");
//        employee2.setId(4);
//        int result2 = daoimpl.updateEmployee(employee2);
//        System.out.println("("+result2+") rows UPDATED....");
    	
    	
//    	//		 get employee
	    	 Employee employee3 = new Employee();
	    	 daoimpl.getEmployee(10);
	    	 
    	
    	//  get all emps
    	 Employee employee4 = new Employee();
    	 daoimpl.getAllEmployes();
    	 
	    	 
	    	 
	        
        

    }
}
