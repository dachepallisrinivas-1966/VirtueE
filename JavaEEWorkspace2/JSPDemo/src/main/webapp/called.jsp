<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Called Page</title>
</head>
<body>
	<h1>Called Page</h1>
	p1 = ${param.p1}
	<p></p>
	p2 = ${param.p2}
	<p></p>
	p3 = ${param.p3}
	<p></p>
	Color = ${requestScope.color }
	<p></p>
	Hobby = ${sessionScope.hobby }
	<p></p>
	Hero = ${applicationScope.hero }
</body>
</html>