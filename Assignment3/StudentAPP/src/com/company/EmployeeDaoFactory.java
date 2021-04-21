package com.company;


import java.awt.color.ICC_ColorSpace;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoFactory {

    private static EmployeeDao dao;

    public static EmployeeDao getEmployeeDao() throws SQLException {
        if(dao==null){
            dao = new EmployeeDaoImpl();
        }
        return dao;
    }


}

