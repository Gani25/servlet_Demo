<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/process3" method="post">
	First Name:
	<input type="text" name="first-name">
	<br><br>
	Last Name:
	<input type="text" name="last-name">
	<br><br>
	
	<input type="submit" value="save student" >
	</form>

</body>
</html>