<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="companyName" value="Virtue E Varsity"/>
	
	Lower Case String : ${fn:toLowerCase(companyName) } <br />
	Upper Case String : ${fn:toUpperCase(companyName) } <br />
	
	<hr />
	Length of String  : ${fn:length(companyName) } <br />
	
	<hr />
	<c:set var="str1" value="Welcome-to-JSP-Programming."/>  
	<c:set var="str2" value="${fn:split(str1, '-')}" />
	
	<c:forEach var="word" items="${str2 }">
		${word } <br />
	</c:forEach>  
	
	<hr />
	<c:set var="str3" value="${fn:join(str2, ' ')}" />   
	
	Modified String : ${str3 }
	<hr />
	
	
	
	
	
	
</body>
</html>