package com.ems.controller;//This class belongs to the com.ems.controller package

import java.io.IOException;
import java.util.List;

import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employees")
public class EmployeeListServlet extends HttpServlet {
	
	 private static final long serialVersionUID = 1L;
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)//When someone visits /employees thus get all the employees
	        throws ServletException, IOException {

		EmployeeDAO dao = new EmployeeDAO();//create DAO

		List<Employee> employees = dao.getAllEmployees();//Ask DAO for employees
		
		request.setAttribute("employees", employees);//putting the employee list into the request so the JSP can use i

		request.getRequestDispatcher("employeeList.jsp")//Take this request and send it to employeeList.jsp
	       .forward(request, response);
	}
}
