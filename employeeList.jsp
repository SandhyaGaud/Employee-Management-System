<%@ page import="java.util.List" %>
<%@ page import="com.ems.model.Employee" %>

<html>
<head>
    <title>Employee List</title>
    <style>
    table {
        border-collapse: collapse;
        width: 80%;
    }

    th, td {
        padding: 10px;
        text-align: center;
    }

    th {
        background-color: #eeeeee;
    }
</style>
</head>

<body>

<h2>Employee List</h2>

<table border="1" cellpadding="10">

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Department</th>
    <th>Salary</th>
</tr>

<%
    List<Employee> employees =
        (List<Employee>) request.getAttribute("employees");

    for (Employee employee : employees) {
%>

<tr>
    <td><%= employee.getEmpId() %></td>
    <td><%= employee.getEmpName() %></td>
    <td><%= employee.getEmail() %></td>
    <td><%= employee.getDepartment() %></td>
    <td><%= employee.getSalary() %></td>
</tr>

<%
    }
%>

</table>

</body>
</html>