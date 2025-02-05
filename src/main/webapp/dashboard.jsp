<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table,th,td{
	border: 2px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>
<c:set var="students" value="<%=request.getAttribute(\"studentLists\") %>"/>

<table>
	<tr>
	<th>First Name</th>
	<th>Last Name</th>
	</tr>
	<c:forEach var="tempStudent" items="${students}">
		<tr>
			<td>${tempStudent.firstName}
			</td>
			<td>${tempStudent.lastName}
			</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>