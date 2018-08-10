<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=#8cd1cc>
<center>
<h1 style="background-color:#ff9999">Registration Form</h1>
	    <div>

		<form action="register" method="post">
			<table style="with:50%">
				<tr>
					<td>Emp Id</td>
					<td><input type="text" name="id"  /></td>
				</tr>
				<tr>
					<td>Emp Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Emp Age</td>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><input type="text" name="salary" /></td>
				</tr>
				<tr>
					<td>DOB</td>
					<td><input type="text" name="dob" /></td>
				</tr>
				<tr>
					<td>Designation</td>
					<td><input type="text" name="designation" /></td>
				</tr>
			</table><br>
			<input type="submit" value="Register" />
		</form>
	</div>
</center>
</body>
</html>

