<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User Details</title>
</head>
<body>
	<form action="employeeRegistration" method="post">
	<input type="hidden" name="id" value="<%request.getAttribute("id");%>">
		Name:<input type="text" name="name" value="<%request.getAttribute("userName");%>">
		Address:<input type="text" name="name" value="<%request.getAttribute("address");%>">
		Email:<input type="text" name="name" value="<%request.getAttribute("email");%>"> 
		<input type="submit" value="Update">
	</form>
</body>
</html>