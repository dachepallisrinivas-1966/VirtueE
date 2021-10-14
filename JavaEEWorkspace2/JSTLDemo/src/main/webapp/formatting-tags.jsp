<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formatting Tags</title>
</head>
<body>
	<h3>Formatting of Number:</h3>  
	<c:set var="amount" value="9.14115" />  

	<p> Formatted Number-1:  
	<fmt:formatNumber value="${amount}" type="currency" /></p>
	
	<p>Formatted Number-2:  
	<fmt:formatNumber type="number" groupingUsed="true" value="${amount}" /></p>  

	<p>Formatted Number-3:  
	<fmt:formatNumber type="number" maxIntegerDigits="3" value="${amount}" /></p>
	  
	<p>Formatted Number-4:  
	<fmt:formatNumber type="number" maxFractionDigits="2" value="${amount}" /></p>
	
	<p>Formatted Number-5: 
	<c:set var="p" value="0.5" /> 
	<fmt:formatNumber type="percent" maxIntegerDigits="4" value="${p}" /></p>  
	
	
	<hr />
	
	<h2>Different Formats of the Date</h2>  
	<c:set var="today" value="<%=new java.util.Date()%>" />  
	<p>  
		Formatted Date :  
		<fmt:formatDate type="date" value="${today}" />  
	</p>  
	<p>  
		Formatted Time :  
		<fmt:formatDate type="time" value="${today}" />  
	</p>  

	<p>  
		Formatted Date and Time :  
		<fmt:formatDate type="both" value="${today}" />  
	</p>  

	<p>  
		Formatted Date and Time in short style :  
		<fmt:formatDate type="both" dateStyle="short" timeStyle="short"  value="${today}" />
	</p>  
	<p>  
		Formatted Date and Time in medium style :  
		<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${today}" />  
	</p> 
 
	<p>  
		Formatted Date and Time in long style :  
		<fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${today}" />  
 	</p>  

</body>
</html>