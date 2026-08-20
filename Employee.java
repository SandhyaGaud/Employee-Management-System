package com.ems.model;

public class Employee {

	
	    private int empId;
	    private String empName;
	    private String email;
	    private String department;
	    private double salary;

	    public Employee() {
	    }

	    public Employee(int empId, String empName, String email, String department, double salary) {
	        this.empId = empId;
	        this.empName = empName;
	        this.email = email;
	        this.department = department;
	        this.salary = salary;
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    public void setEmpId(int empId) {
	        this.empId = empId;
	    }

	    public String getEmpName() {
	        return empName;
	    }

	    public void setEmpName(String empName) {
	        this.empName = empName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee [empId=" + empId + ", empName=" + empName
	                + ", email=" + email + ", department=" + department
	                + ", salary=" + salary + "]";
	    }
	}
