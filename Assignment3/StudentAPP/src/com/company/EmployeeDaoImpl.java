package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    private static Statement statement = null;
    private Connection conn;

    public EmployeeDaoImpl() throws SQLException {
        conn = ConnectionFactory.getConnection();
        statement = conn.createStatement();
    }

    @Override
    public void addEmployee(Employee employee) throws SQLException {
      String sql = "insert into details values ("+employee.getEmpId()+", '"+employee.getName()+"', '"+employee.getEmail()+"')";
      int count = 0 ;

      count =statement.executeUpdate(sql);

      if(count > 0 ){
          System.out.println("Employee Record saved...");
      }
      else{
          System.out.println("Employee failed");
      }


    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {
        String sql = "update details set Email='"+employee.getEmail()+"' where Name='"+ employee.getName()+"'";
        int count = 0;
        count = statement.executeUpdate(sql);

        if (count > 0) {
            System.out.println("Employee Updated Successfully");
        } else {
            System.out.println("Not completed");
        }


    }

    @Override
    public void deleteEmployee(Employee employee) throws SQLException {
        String sql = "Delete from details where Empid = "+employee.getEmpId()+" ";
        int count = 0;
        count = statement.executeUpdate(sql);

        if (count > 0) {
            System.out.println("Employee Deleted Successfully");
        } else {
            System.out.println("Deletion Not completed");
        }




    }

    @Override
    public Employee getEmployeeById(int empId) {
        return null;
    }


    @Override
    public List<Employee> getEmployees() throws SQLException {

        List<Employee> list = new ArrayList<>();
        String sql = "select * from details";
        ResultSet rs = statement.executeQuery(sql);

        while(rs.next()){
            int id = rs.getInt("Empid");
            String name = rs.getString("Name");
            String email = rs.getString("Email");

            Employee employee = new Employee(id,name,email);
            list.add(employee);

        }

        return list;
    }
}