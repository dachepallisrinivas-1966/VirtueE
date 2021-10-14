<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="emp" class="com.vev.bean.Employee">
	</jsp:useBean> 
	<jsp:setProperty property="id" value="1001" name="emp"/>
	<jsp:setProperty property="name" value="srinivas" name="emp"/> 
	
	Employee Details : <br />
	Id: <jsp:getProperty property="id" name="emp"/><br>  
	Name: <jsp:getProperty property="name" name="emp"/><br> 
</body>
</html>