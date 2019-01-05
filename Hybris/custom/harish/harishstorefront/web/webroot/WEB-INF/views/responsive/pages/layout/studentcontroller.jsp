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
${student.email}<br>
${student.phoneNumber}<br>
</c:forEach>



<form:form method="post" commandName="student" action="registration">
	
	<formElement:formInputBox idKey="register.firstName"
		labelKey="ID" path="id" inputCSS="form-control"
		mandatory="true" />
	<formElement:formInputBox idKey="register.lastName"
		labelKey="NAME" path="name" inputCSS="form-control"
		mandatory="true" />
	<formElement:formInputBox idKey="register.email"
		labelKey="EMAIL" path="email" inputCSS="form-control"
		mandatory="true" />
		
			<formElement:formInputBox idKey="register.email"
		labelKey="PHONE NUMBER" path="phoneNumber" inputCSS="form-control"
		mandatory="true" />
	
	
	<button type="submit" class="btn btn-default btn-block">
				<spring:theme code='hbjbjh' />
			</button>
		
	
</form:form>
