<%@page import="com.hexaware.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>This is second page</h2>
<jsp:useBean id = "data1" class = "com.hexaware.Person" scope = "request"></jsp:useBean>
<jsp:useBean id = "data2" class = "com.hexaware.Person" scope = "session"></jsp:useBean>
<jsp:useBean id = "data3" class = "com.hexaware.Person" scope = "application"></jsp:useBean>
<h3>person 1 info</h3>
Name: <jsp:getProperty property="name" name="data1"/>
Age: <jsp:getProperty property="age" name="data1"/>

<h3>person 2 info</h3>
Name: <jsp:getProperty property="name" name="data2"/>
Age: <jsp:getProperty property="age" name="data2"/>

<h3>person 3 info</h3>
Name: <jsp:getProperty property="name" name="data3"/>
Age: <jsp:getProperty property="age" name="data3"/>
<hr />
<h2>Java</h2>
<%
Person p1 = (Person)request.getAttribute("data1");
out.print("<p>Request Data: "+p1.getName()+"</p>");
%>
<hr />
<h4>By using expression</h4>
<h4>Person 1 information</h4>
Name: ${data1.name} and 
Age: ${data1.age}
<h4>Person 2 information</h4>
Name: ${data2.name} and
Age: ${data2.age}

<a href = "third.jsp">Third</a>

</body>
</html>