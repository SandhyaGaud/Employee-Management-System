package com.ems.controller;

import java.io.IOException;

import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		EmployeeDAO dao = new EmployeeDAO();
		Employee employee = dao.getEmployeeById(id);
		
		request.setAttribute("employee", employee);

		request.getRequestDispatcher("updateEmployee.jsp")
		       .forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("empId"));
		String empName = request.getParameter("empName");
		String email = request.getParameter("email");
		String department = request.getParameter("department");
		double salary = Double.parseDouble(request.getParameter("salary"));
		
		EmployeeDAO dao = new EmployeeDAO();

		boolean updated = dao.updateEmployee(id, empName, email, department, salary);
		
		if (updated) {
		    response.sendRedirect("employees");
		} else {
		    response.getWriter().println("Employee update failed!");
		}
	}
}
