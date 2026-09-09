package com.ems.controller;

import java.io.IOException;

import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String empName = request.getParameter("empName");
        String email = request.getParameter("email");
        String department = request.getParameter("department");
        double salary = Double.parseDouble(request.getParameter("salary"));

        Employee employee = new Employee();

        employee.setEmpName(empName);
        employee.setEmail(email);
        employee.setDepartment(department);
        employee.setSalary(salary);

        EmployeeDAO dao = new EmployeeDAO();

        boolean result = dao.addEmployee(employee);

        if (result) {
            response.sendRedirect("index.jsp");
        } else {
            response.getWriter().println("Employee insertion failed!");
        }
    }
}