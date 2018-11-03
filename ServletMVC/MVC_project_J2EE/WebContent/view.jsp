<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<body bgcolor = "yellow">
<%@ page import="java.util.Date" %>
<strong>
Current Time is:<%=new Date()%>
</strong>
<br> 
<h2>
UserID of User ${myuser.uid}.
Name of User  ${myuser.name}.
Email of User  ${myuser.email}.
Address of User ${myuser.address}.
</h2>
</body>
</html>