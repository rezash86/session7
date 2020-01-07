<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>

	<div align="center">
		Cool Student List
		<table border="1">
			<tr>
				<th>first name</th>
				<th>last name</th>
				<th>age</th>
			</tr>

			<c:forEach var="student" items="${studList}">
				<tr>
					<td><c:out value="${student.firstName}"></c:out></td>
					<td><c:out value="${student.lastName}"></c:out></td>
					<td><c:out value="${student.age}"></c:out></td>
				</tr>
			</c:forEach>

		</table>


	</div>
</body>
</html>