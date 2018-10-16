<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib prefix = "c" uri= "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Employee Registration Form</h1></center><br>
<form:form action = "processForm" modelAttribute="employee">
<center>Employee Id <form:input path="empId"/></center>
                    <center><form:errors path="empId"></form:errors></center><br>
<center>First Name  <form:input path="firstName"/></center>
                    <center><form:errors path="firstName"></form:errors></center><br>
<center>Last Name   <form:input path="lastName"/></center>
                    <center><form:errors path="lastName"></form:errors></center><br>
<center>EMail       <form:input path="email" type="email"/></center>
                    <center><form:errors path="email"></form:errors></center><br>
<center>Phone       <form:input path="phone" type = "tel"/></center>
                    <center><form:errors path="phone"></form:errors></center><br>
                 <center>   <input type="submit" value ="Register"/></center>

</form:form>


</body>
</html>