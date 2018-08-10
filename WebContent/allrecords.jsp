<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="powderblue">
<center>
<h2 style="color:#005c99;">WELCOME TO STIGENTECH</h2>
<table style="width:70%" bordercolor="#f2f2f2">
<br>
<tr bgcolor="#ff4d4d">
	<th>ID</th>
	<th>Name</th>
	<th>Age</th>
	<th>Salary</th>
	<th>DOB</th>
	<th>Desig</th>
	</tr>
<c:forEach items="${list}" var="Employee">

        <tr bgcolor="#4dd2ff" align="center">
       <td >${Employee.id}</td> 
       <td>${Employee.name}</td> 
       <td>${Employee.age}</td> 
       <td>${Employee.salary}</td>
       <td>${Employee.dob}</td> 
       <td>${Employee.designation}</td>  
   		</tr> 
</c:forEach>
</table>
</center>
</body>
</html>