<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>This is Third page</h2>
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
<h3>By expression tag</h3>
<h3>First</h3>
Name: ${data1.name} and
Age: ${data1.age}
</body>
</html>