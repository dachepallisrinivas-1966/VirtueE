<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Caller Page</title>
</head>
<body>
	<h1>Caller Page</h1>
	p1 = ${param.p1}
	<p />
	p2 = ${param.p2}
	<p />
	<%
		request.setAttribute("color", "Red");
		session.setAttribute("hobby", "Philately");
		application.setAttribute("hero", "Kamal Haasan");
	%>
	
	<jsp:forward page="called.jsp">
		<jsp:param name="p3" value="30"></jsp:param>
	</jsp:forward>
	
	<h2>Back in Caller</h2>
	
</body>