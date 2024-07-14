<%@page import="com.springmvc.Entities.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dispalyUsers</title>

<style>
body {
	margin: 0px;
	padding: 0px;
	display: flex;
	flex-direction: column;
	height: 100vh;
	justify-content: center;
	align-items: center;
	font-family: cursive;
}

table, tr, td, th {
	border: 1px solid black;
	padding: 3px;
}

a {
	text-decoration: none;
}
</style>

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
			<c:forEach items="${users}" var="currentUser">
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