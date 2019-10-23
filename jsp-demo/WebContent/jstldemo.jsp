<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	<h2>Seeing Person information in table</h2>
	<table border="1">
		<tr>
			<th>Name</th><th>Age</th>
		</tr>
		<c:forEach var = "p" items = "${persons}">
		<tr>
			<td>${p.name}</td><td>${p.age}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>