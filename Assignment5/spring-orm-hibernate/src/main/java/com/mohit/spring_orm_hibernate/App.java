   package com.mohit.spring_orm_hibernate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mohit.spring_orm_hibernate.dao.EmployeeDao;
import com.mohit.spring_orm_hibernate.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{ public static void main( String[] args )
{
    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);
    
//   
    // update
    
//    Employee newEmployee1 = new Employee();
//    newEmployee1.setId(2);
//    newEmployee1.setName("Mohit");    
//    int result1 =  dao.updateEmployee(newEmployee1);
//    System.out.println("("+result1+") rows inserted...");
    
    boolean flag = true;
    while(flag) {
    System.out.println("*****************");
    System.out.println("PRESS 1 : INSERT ");
    System.out.println("PRESS 2 : UPDATE ");
    System.out.println("PRESS 3 : DELETE");
    System.out.println("PRESS 4 : GET EMPLOPYEE BY ID ");
    System.out.println("PRESS 5 : GET ALL EMPS ");
    System.out.println("PRESS 6 : Exit ");
    System.out.println("*****************");
    
   
	    try {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	
	    	System.out.println("Enter choice");
	    	int choice = Integer.parseInt(br.readLine());
			
	    	 switch (choice) {
	    	 
	    	 	case 1:
	    	 			System.out.println("Enter Id : " );
	    	 			int empid = Integer.parseInt(br.readLine());
	    	 			
	    	 			System.out.println("Enter Name : ");
	    	 			String name = br.readLine();
	    	 			
	    	 			System.out.println("Enter Email  :");
	    	 			String email= br.readLine();
	    	 			
	    	 			Employee newEmployee = new Employee();
	    	 		    newEmployee.setId(empid);
	    	 		    newEmployee.setName(name);
	    	 		    newEmployee.setEmail(email);
	    	 		    
	    	 		    int result =  dao.addEmployee(newEmployee);
	    	 		    System.out.println("("+result+") rows inserted sucessfully...");
	    	 		    	    	 			
	    	 		    break;
	    			
				case 2:
//						System.out.println("Enter Id : " );
//	    	 			int updateEmpid = Integer.parseInt(br.readLine());
//						
//	    	 			System.out.println("Enter Name : ");
//	    	 			String updateName = br.readLine();
//	    	 			
//	    	 			Employee newEmployee1 = new Employee();
//	    	 		    newEmployee1.setId(updateEmpid);
//	    	 		    newEmployee1.setName(updateName);
//	    	 				    	 			
//	    	 			dao.updateEmployee(newEmployee1);
//		    	 		System.out.println("rows updated...");

						System.out.println("Enter id name and email");
						int updateId = Integer.parseInt(br.readLine());
						String updateName = br.readLine();
						String updateEmail = br.readLine();
						
						Employee employee1 = new Employee();
						employee1.setId(updateId);
						employee1.setName(updateName);
						employee1.setEmail(updateEmail);
						
						dao.updateEmployee(employee1);
						System.out.println("Update data sucessfully");
			    	 	
						break;
						
					case 3:
						System.out.println("Enter id ");
						int did = Integer.parseInt(br.readLine());
						Employee employee3 = new Employee();
						employee3.setId(did);
						dao.deleteEmployee(did);
						
						break;
						
				case 4:
						System.out.println("Enter id...");
						int eid = Integer.parseInt(br.readLine());
						Employee emp = new Employee();
						emp.setId(eid);
						Employee employee2 = dao.getEmployeeById(eid);
						System.out.println(employee2);
						
						break;
				
				case 5:
						System.out.println("All the Employee Details:");
						List<Employee> employees = dao.getAllEmployee();
						for (Employee emp1 : employees) {
							System.out.println(emp1);
						}
	
						break;
					
				
				case 6:
						System.out.println("Thank you");
						System.out.println("Closing....");
						flag = false;
						break;
				    			
				default:
		    			break;
		    		}
		    	 
	    	 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Enter a valid choice");
			flag =  false;
		}
    
   
    
    }
    
    
}
}
