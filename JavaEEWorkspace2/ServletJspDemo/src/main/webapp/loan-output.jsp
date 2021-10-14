<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Result</title>
</head>
<body>
	<table>
		<tbody>
			<tr>
				<td><strong>Principle:</strong></td>
				<td>${requestScope.loanModel.principle }</td>
			</tr>
			<tr>
				<td><strong>Time Period:</strong></td>
				<td>${requestScope.loanModel.timePeriod}</td>
			</tr>
			<tr>
				<td><strong>Rate of Interest:</strong></td>
				<td>${requestScope.loanModel.rateOfInterest}</td>
			</tr>
			<tr>
				<td><strong>Simple Interest:</strong></td>
				<td>${requestScope.loanModel.interest}</td>
			</tr>
			<tr>
				<td><strong>Payable Amount:</strong></td>
				<td>${requestScope.loanModel.payableAmount}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>