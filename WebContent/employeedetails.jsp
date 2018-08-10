<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#e6f7ff">
<h1 align="center">Employee details by Id</h1>
<br>
<br>
<table style="width:50%" border="1px" align="center">
<tr bgcolor="orange">
	<th>Name</th>
	<th>Age</th>
	<th>Salary</th>
	<th>DOB</th>
	<th>Desig</th>
	</tr>
	
	
<tr bgcolor="#D2AAAF" align="center">	
<td><c:out value = "${name }" ></c:out><br></td>
<td><c:out value = "${age }" ></c:out><br></td>
<td><c:out value = "${salary }" ></c:out><br></td>
<td><c:out value = "${dob }" ></c:out><br></td>
<td><c:out value = "${designation }" ></c:out></td>
</tr>
</table>
</body>
</html>