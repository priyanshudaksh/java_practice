<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 style = 'color:red'>${msg}</h3>
	<form action = "StoreServlet" method= "post">
		Enter Name: <input type = "text" name = "n1"><br>
		Enter Password: <input type = "password" name="n2"><br>
		Birthday <input type = "text" name = "n3"><br>
		<input type = "submit" value = "register">
	</form>
</body>
</html>