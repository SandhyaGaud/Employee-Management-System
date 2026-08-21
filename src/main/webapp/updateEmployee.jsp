<%@ page import="com.ems.model.Employee" %>

<%
    Employee employee = (Employee) request.getAttribute("employee");
%>

<html>
<head>
    <title>Update Employee</title>
</head>

<body>

<h2>Update Employee</h2>

<form action="updateEmployee" method="post">

    <input type="hidden" name="empId"
           value="<%= employee.getEmpId() %>">

    Name:
    <input type="text" name="empName"
           value="<%= employee.getEmpName() %>">
    <br><br>

    Email:
    <input type="email" name="email"
           value="<%= employee.getEmail() %>">
    <br><br>

    Department:
    <input type="text" name="department"
           value="<%= employee.getDepartment() %>">
    <br><br>

    Salary:
    <input type="text" name="salary"
           value="<%= employee.getSalary() %>">
    <br><br>

    <button type="submit">Update Employee</button>

</form>

</body>
</html>