
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body bgcolor="#ffcccc">
<center>
<h1 style="color:#005c99;">Employee Details by Id</h1>
<br>

<c:if test="${notsuccess }">
	<div style="color:red;">Employee Datails Not found,</div>
</c:if>


<form action="employeedetailsform" method="post"><br>
<table>
<tr>
<td>Employee Id: <input type="text" name="id"></td><br><br>
                <td> <input type="submit" value="Submit"></td></tr></table>

</form>
</center>
</body>
</html>