<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login successful</title>
</head>
<body>
<h1>Login Successful</h1>
<h2>Welcome <%= request.getParameter("username") %>!</h2>

</body>
</html>