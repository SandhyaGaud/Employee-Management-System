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
    <th>Action</th>
</tr>
<form action="searchEmployee" method="get">
    <input type="text" name="keyword" placeholder="Search by name or email">
    <button type="submit">Search</button>
</form>
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
    
	<td>
    	<a href="updateEmployee?id=<%= employee.getEmpId() %>">Edit</a>
   		<a href="deleteEmployee?id=<%= employee.getEmpId() %>"
  			 onclick="return confirm('Are you sure you want to delete this employee?');">
  				 Delete
  				 </a>	 
  			</td>
</tr>
  <!--<thAction</th>-->

<%
    }
%>

</table>

</body>
</html>