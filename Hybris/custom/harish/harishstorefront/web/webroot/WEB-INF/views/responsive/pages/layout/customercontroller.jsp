

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>


<c:forEach items="${students}" var="student">

${student.id}<br>
${student.name}<br>


</c:forEach>
<br>
<form:form action="registration" modelAttribute="student">

Please enter an id   :<form:input path="id" /><br>
<form:errors path="id"></form:errors><br>
Please enter your name  :<form:input path="name"/><br>
<form:errors path="name"></form:errors><br>
<input type ="submit" value = "REGISTER">


</form:form>




<form:form method="post" commandName="student" action="registration">
	
	<formElement:formInputBox idKey="register.firstName"
		labelKey="register.firstName" path="id" inputCSS="form-control"
		mandatory="true" />
	<formElement:formInputBox idKey="register.lastName"
		labelKey="register.lastName" path="name" inputCSS="form-control"
		mandatory="true" />

  


			<button type="submit" class="btn btn-default btn-block">
				<spring:theme code='Register' />
			</button>
	
</form:form>



