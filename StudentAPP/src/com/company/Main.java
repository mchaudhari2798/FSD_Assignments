package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();

        Scanner sc = new Scanner(System.in);
        System.out.println("<< PLEASE ENTER YOUR CHOICE >>");
        System.out.println("PRESS 1: Insert");
        System.out.println("PRESS 2:  Update");
        System.out.println("PRESS 3:  Delete");
        System.out.println("PRESS 4:  GetList");
        System.out.println("*****************************");

        int options = sc.nextInt();
        switch (options) {
            case 1: {
                insert();
                break;
            }
            case 2: {
                update();
                break;
            }
            case 3: {
                delete();
                break;
            }
            case 4: {
                getList();
                break;
            }

            default: {
                System.out.println("Invalid choice");
            }

        }


        // write your code here
//        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
//        Employee employee = new Employee(3, "rohit", "Ro@gmail.com");
//        dao.addEmployee(employee);

        //   taking input from user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter  EmpId: ");
//        int id = sc.nextInt();
//
//        System.out.println("Enter  Name: ");
//        String name = sc.next();
//
//        System.out.println("Enter  Email: ");
//        String email = sc.next();
//
//        Employee employee = new Employee(id,name,email);
//        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
//        dao.addEmployee(employee);

        //Displaying table
//        private static void getList();

    }

    private static void update() throws IOException, SQLException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name ");
        String n = br.readLine();
        System.out.println("Enter email to update");
        String e = br.readLine();
        Employee employee1 = new Employee(n ,e);
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        dao.updateEmployee(employee1);
    }

    private static void insert () throws SQLException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter  EmpId: ");
            int id = sc.nextInt();

            System.out.println("Enter  Name: ");
            String name = sc.next();

            System.out.println("Enter  Email: ");
            String email = sc.next();

            Employee employee = new Employee(id, name, email);
            EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
            dao.addEmployee(employee);
        }

    



    private static void delete() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  EmpId: ");
        int id = sc.nextInt();

        Employee employee = new Employee(id);
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        dao.deleteEmployee(employee);


    }

    private static void getList() throws SQLException {

        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        List<Employee > list = dao.getEmployees();
        for (Employee emp: list  ) {
            System.out.println(emp.toString());
        }
    }
}
