<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
</head>

<body>

    <h2>Add New Employee</h2>

    <form action="addEmployee" method="post">

        <label>Employee Name:</label>
        <input type="text" name="empName" required>
        <br><br>

        <label>Email:</label>
        <input type="email" name="email" required>
        <br><br>

        <label>Department:</label>
        <input type="text" name="department" required>
        <br><br>

        <label>Salary:</label>
        <input type="number" name="salary" step="0.01" required>
        <br><br>

        <input type="submit" value="Add Employee">

    </form>

</body>
</html>