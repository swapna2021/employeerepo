<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2px">
<thead>
	<tr>
			<th>Employee Name</th>
			<th>Employee Id</th>
			<th>Employee Salary</th>
			<th>Update</th>
			<th>Delete</th>
	</tr>
	</thead>
	<tbody>
		<c:forEach var="emp" items="${employees}">
			<tr>
				<td>${emp.employeeName }</td>
				<td>${ emp.employeeId}</td>
				<td>${emp.employeeSalary }</td>
				
				<td>
					<a href="/update-employee/${emp.employeeId}">Update</a>
				</td>
				<td>
					<a href="/delete-employee/${emp.employeeId}">Delete</a>
				</td>
			</tr>
		
		</c:forEach>
	
	</tbody>
</table>

</body>
</html>