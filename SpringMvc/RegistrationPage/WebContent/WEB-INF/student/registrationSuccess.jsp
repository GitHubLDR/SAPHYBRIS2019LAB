<%@ page contentType="text/html; charset = UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<title>Student Registration Success</title>
	</head>
	<body>
		<div align="center">
		<c:choose>
		
			<c:when test="${msg}">
			<c:url value="/search-page" var="searchUrl"/>
				<font color="green">
				<h1> Registration has been Success </h1></font>
				<br>
				<a href="${searchUrl}"><font color="blue">Search Student</font></a>
			</c:when>
			<c:otherwise>
				<font color="red" <h1> Registration has been failed!!!! </h1>></font>
			</c:otherwise>
		</c:choose>
			
		</div>
	</body>
</html>