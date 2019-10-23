<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body  {
  background-image: url("flight.png");
  background-color: #cccccc;
  background-size: cover;
}
</style>
<title>Booking History  ${name}</title>
</head>
<body>
${name}
<h3>PNR   FLIGHTID  FLIGHTNAME  SRC	 DES  DOJ	TOJ  SEATS  B.TIME   AMT  CLASS  NOP</h3><br>
<c:forEach var="o" items = "${ord}"> 
<h3>${o.pnr}  ${o.flightid}   ${o.flightname} ${o.source} ${o.destination} ${o.doj}  ${o.toj} ${o.seats} ${o.booktime} ${o.amount}  ${o.passangers} ${o.cateogory }</h3>
<br>
</c:forEach>

</body>
</html>