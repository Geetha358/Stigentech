<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#ffbb99">

<c:if test="${notsuccess }">
	<div style="color:red;">Employee Datails not found </div>
</c:if>

<br>
<br>
<center>
<h2>Get All Emp Details</h2>
<form action="allemployeedetails" method="post">
<input type="submit" value="GetRecords">


</form>
</center>
</body>
</html>