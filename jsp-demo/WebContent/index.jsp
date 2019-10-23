<%@ page import = "java.time.LocalDate" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello JSP</h2><hr />
	<%!
		int counter = 0;
	%>
	<%-- JSP comment --%>
	<!-- Html comment -->
	<%
	LocalDate dob = LocalDate.of(1990, 10, 20);
	int localcounter = 0;
	localcounter++;
	counter++;
	%>
	<%@include file = "abc.txt" %>
	<%@include file = "abc.txt" %>
	<%@include file = "abc.txt" %>
	<h2>Local Counter: <%=localcounter %></h2>
	<h2>Instance Counter: <%=counter %></h2>
	<h2>Birthday: <%=dob %></h2>
	<%@include file = "abc.txt" %>
	<%@include file = "abc.txt" %>
	<form action = "TestServlet" method = "post">
	Name <input type = "text" name = "n1"><br />
	Age <input type = "text" name = "n2"><br />
	<input type= "submit" value = "submit">
	</form>
	<a href = "ShowAllUsers">ShowAllUsers</a>
</body>
</html>