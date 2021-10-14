<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Form</title>
</head>
<body>
	<form method="post" action="loan">
		<div>
			<label>Principle:</label> 
			<input type="text" name="p" required value="0" />
		</div>
		<div>
			<label>Time Period:</label> 
			<input type="text" name="t" required value="0" />
		</div>
		<div>
			<label>Rate of Interest:</label> 
			<input type="text" name="r" required value="0" />
		</div>
		<div>
			<button type="reset">Clear</button>
			<button>Compute Interest</button>
		</div>
	</form>
</body>
</html>