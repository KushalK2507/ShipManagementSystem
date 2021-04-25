<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
User Details are shown below:
<%request.getAttribute("userDetails"); %>
</body>
</html>