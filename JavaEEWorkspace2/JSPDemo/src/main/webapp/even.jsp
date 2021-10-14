<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Even Program Page</title>
<style>
	body {
		background-color: tan;
	}
</style>
</head>
<body>
	<h2>Check if Even</h2>
	<hr />
	<form action="even.jsp">
		Enter Number: <input type="text" name="num" size="10"  value="${param.num}" required />
		<p />
		<button>Submit</button>
	</form>
	
	<%
		String num = request.getParameter("num");
		if (num != null && !num.isEmpty()) {
			int n = Integer.parseInt(num);

			if (n % 2 == 0)
				out.println("<h2>Even Number</h2>");
			else
				out.println("<h2>Odd Number</h2>");
		}
	%>
</body>
</html>