<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>${message}</center>

<table>
<tr>
<th>${id}</th>
<th>${firstName}</th>
<th>${lastName}</th>
<th>${email}</th>
<c:forEach var = "tempStudent" items = "${print}">
<tr>
<td>${tempStudent.id}</td>
<td>${tempStudent.firstName}</td>
<td>${tempStudent.lastName}</td>
<td>${tempStudent.email}</td>
</tr>
</c:forEach>

</table>

<br>
<br>

</body>
</html>