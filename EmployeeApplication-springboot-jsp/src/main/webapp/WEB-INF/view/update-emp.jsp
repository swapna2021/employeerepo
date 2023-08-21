<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Employee update Form</h1>
	<form:form action="/emp-update/${employee.employeeId}"  method="post" modelAttribute="employee">
	<table>
	<tr>
		<td>
		<form:label path="employeeName">Employee Name:</form:label>
		</td>
		<td>
		<form:input type="text" path="employeeName"/>
		</td>
	</tr>	
	<tr>
	<td>
	<form:label path="employeeId" >Employee Id:</form:label>
	</td>
	<td>
		<form:input type="number" path="employeeId" />
		</td>
		</tr>
		<tr>
		<td>
	<form:label path="employeeSalary">Employee Salary:</form:label>
	</td>
	<td>
		<form:input type="number" path="employeeSalary"/>
		</td>
		</tr>
		<tr>
		<td colspan="2">
	<input type="submit" value="submit">
	</td>
	</tr>
	</table>
	</form:form>
</body>
</html>