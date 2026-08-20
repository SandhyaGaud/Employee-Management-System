package com.ems.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ems.model.Employee;
import com.ems.util.DBConnection;

public class EmployeeDAO {

    public boolean addEmployee(Employee employee) {

        String sql = "INSERT INTO employee (emp_name, email, department, salary) VALUES (?, ?, ?, ?)";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, employee.getEmpName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getDepartment());
            ps.setDouble(4, employee.getSalary());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }//getAllEmployee method
    public List<Employee> getAllEmployees() {
    	//creating empty list
    	List<Employee> employees = new ArrayList<>();
    	//want everything from employee table
    	String sql = "SELECT * FROM employee";
    	
    	try {  //connect to my
    		Connection con = DBConnection.getConnection();
    		//preparing request
    		PreparedStatement ps = con.prepareStatement(sql);
    		//asking my to execute
    		ResultSet rs = ps.executeQuery();
    		
    		while (rs.next()) {
    			//create employee object
    			Employee employee = new Employee();
    			
    			employee.setEmpId(rs.getInt("emp_id"));
    			employee.setEmpName(rs.getString("emp_name"));
    			employee.setEmail(rs.getString("email"));
    			employee.setDepartment(rs.getString("department"));
    			employee.setSalary(rs.getDouble("salary"));
    			//putting employee into our list
    			employees.add(employee);
    			
    		}
    		
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    	return employees;
}
}