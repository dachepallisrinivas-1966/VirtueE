<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	<%
		LocalDate today = LocalDate.now();
		out.println(today);
	%>
	
	<hr />
	
	<%= LocalDate.now() %>
	
	
</body>
</html>