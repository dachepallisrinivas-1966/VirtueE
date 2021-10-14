<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <c:out value="${param.fname }"></c:out>
	<br />
	<c:out value="${param.lname }"></c:out> --%>
	
	<c:if test="${param.num%2==0 }">
		<c:out value="${param.num } is even"></c:out>
	</c:if>
	
	<c:if test="${param.num%2!=0 }">
		<c:out value="${param.num } is odd"></c:out>
	</c:if>
	<hr />
	
	<c:forEach var="i" begin="1" end="${param.num}">
		<c:out value="${i }"></c:out>
	</c:forEach>
	<hr />
	
	<c:forTokens items = "oracle : c++ :  java :  python" delims = ":" var = "courseName">
         <c:out value = "${courseName}"/><p>
     </c:forTokens>
   </body>
	
	<hr />
	<c:set var = "salary" scope = "session" value = "${2000*2}"/>
      <p>Your salary is : <c:out value = "${salary}"/></p>
      
      <c:choose>
         
         <c:when test = "${salary <= 0}">
            Salary is very low to survive.
         </c:when>
         
         <c:when test = "${salary > 1000}">
            Salary is very good.
         </c:when>
         
         <c:otherwise>
            No comment sir...
         </c:otherwise>
      </c:choose>
   
		
	
</body>
</html>