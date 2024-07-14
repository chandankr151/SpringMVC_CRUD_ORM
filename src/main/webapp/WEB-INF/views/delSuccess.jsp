<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>List of Users</h1>
	<table border="1">
		<thead>
			<tr>
				<th>Username</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${user}" var="currentUser">
				<tr>
					<td>${currentUser.id}</td>
					<td>${currentUser.fullName}</td>
					<td>${currentUser.email}</td>
					<td>${currentUser.password}</td>
					<td>${currentUser.image}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>