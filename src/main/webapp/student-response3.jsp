<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="jakarta.tags.core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Response</title>
</head>
<body>

<c:set var="student" value="<%=session.getAttribute(\"studentObj\") %>"/>
<h1>Student Is Confirmed Redirect</h1>

<h3>First name = ${student.firstName}</h3>
<h3>Last name = ${student.lastName}</h3>

</body>
</html>