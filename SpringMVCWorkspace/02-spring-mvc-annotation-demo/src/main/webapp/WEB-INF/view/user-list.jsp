<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h2>User List</h2>
	<ul>
	<c:forEach var = "user" items="${ul}">
		<li>${user.name}, ${user.age}, ${user.email}, ${user.country}</li>
	</c:forEach>
	</ul>
	
</body>
</html>