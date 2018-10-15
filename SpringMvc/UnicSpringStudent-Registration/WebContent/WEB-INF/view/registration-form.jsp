<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
     .error{color:red}
</style>
</head>
<body>
<center><h1>Student Registration</h1></center>
<br>
<form:form action = "processForm" modelAttribute = "student">
<br>
ID         <center><form:input path="id" onfocus = "this.value" value = ""/></center>
                   <center><form:errors path = "id" cssClass="error"/></center>
<br>
firstName  <center><form:input path="firstName" /></center>
                   <center><form:errors path = "firstName" cssClass="error"/></center>
<br>
lastName   <center><form:input path="lastName" /></center>
                   <center><form:errors path = "lastName" cssClass="error"/></center>
<br>
email      <center><form:input path="email" type="email" /></center>
                   <center><form:errors path = "email" cssClass="error"/></center>
<br>
 <center>  <input type="submit" value = "Register"/></center>


</form:form>
<br>
<br>
<form action = "searchTable" >
<br>
SEARCH BY NAME   <center><input type="text" name = "search" required/></center>
                   
<br>
 <center>  <input type="submit" value = "Search"/></center>
</form>


</body>
</html>