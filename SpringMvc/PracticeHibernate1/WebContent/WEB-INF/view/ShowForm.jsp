<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Database Management device</h1>
	</center>
	<br>
	<form:form action="processForm" modelAttribute="student">
		<pre>      FIRST NAME      <form:input path="firstName" />
      LAST NAME       <form:input path="lastName" />
      Email           <form:input path="email" /> 
                      <input type="submit" value="Register" />
        
</pre>
	</form:form>
	<form:form action="getTable" modelAttribute="student">
		<pre>
                      <input type="submit" value="Table contents" />
</pre>
	</form:form>
	<br>
	<center>${message}</center>
	<br>
	<center>
		<table>
			<tr>
				<th>${id}</th>
				<th>${firstName}</th>
				<th>${lastName}</th>
				<th>${email}</th>
				<th>Delete</th>
				<c:forEach var="list" items="${list}">
				<c:url var="updateLink" value = "showUpdateForm">
						<c:param name="studentId" value="${list.id}"></c:param>
						</c:url>
					<tr>
						<td>${list.id}</td>
						<td>${list.firstName}</td>
						<td>${list.lastName}</td>
						<td>${list.email}</td>
						<td><form:form action="delete" >
								<input type="submit" value="${list.id}" name = "fname" title="Click to delete this row from the database" />
								

							</form:form></td>
						<td>
						<a href="${updateLink}">Update</a>
						
						</td>
					</tr>
				</c:forEach>
		</table>





	</center>
</body>
</html>