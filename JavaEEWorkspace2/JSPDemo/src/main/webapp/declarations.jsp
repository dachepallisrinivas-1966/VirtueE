<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Declarations Program</title>
</head>
<body>
	<%!
		int a = 4;
	
		int factorial(int n) {
			int f = 1;
			for (int i = 1; i <= n; i++) {
				f = f * i;
			}
			return f;
		}
	%>

	<%
		out.println("a = " + a + "<br />");
		out.println("Factorial = " + factorial(a) + "<br />");
	%>
	
	<hr />
	
	<%= "a = " + a%>
	<br />
	<%= "Factorial = " + factorial(a)%>
	
</body>
</html>