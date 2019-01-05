<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>


<spring:theme code="text.quote.dateformat.datepicker.selection" var="dateFormatForDatePicker" />
<spring:theme code="text.quote.dateformat.datepicker.selection.hint" var="dateFormatHint" />


<div class="account-section-header">
	<div class="row">
		<div class="container-lg col-md-6">
			<spring:theme code="text.account.profile.updatePersonalDetails" />
		</div>
	</div>
</div>
<div class="row">
	<div class="container-lg col-md-6">
		<div class="account-section-content">
			<div class="account-section-form">
				<form:form action="update-profile" method="post"
					commandName="updateProfileForm">

					<formElement:formSelectBox idKey="profile.title"
						labelKey="profile.title" path="titleCode" mandatory="true"
						skipBlank="false" skipBlankMessageKey="form.select.empty"
						items="${titleData}" selectCSSClass="form-control" />
					<formElement:formInputBox idKey="profile.firstName"
						labelKey="profile.firstName" path="firstName" inputCSS="text"
						mandatory="true" />
					<formElement:formInputBox idKey="profile.lastName"
						labelKey="profile.lastName" path="lastName" inputCSS="text"
						mandatory="true" />
					<formElement:formInputBox idKey="Phone" labelKey="Phone Number"
						path="mobileNumber" inputCSS="form-control" mandatory="true" />

                
                    <div class="form-element-icon datepicker quote__expiration" id="js-quote-expiration-time"
                         data-date-format-for-date-picker="${dateFormatForDatePicker}">
                        <formElement:formInputBox idKey="expirationTime"
                                                  labelKey="Date of Birth"  path="dateOfBirth"
                                                  inputCSS="text quote__expiration--input" mandatory="true" placeholder="${dateFormatHint}"/>
                        <i class="glyphicon glyphicon-calendar js-open-datepicker-quote-expiration-time"></i>
                    </div>

           <formElement:formTextArea labelKey="Age" idKey="Age" path="age"/>
		
				
					<div class="row">
						<div class="col-sm-6 col-sm-push-6">
							<div class="accountActions">
								<ycommerce:testId
									code="personalDetails_savePersonalDetails_button">
									<button type="submit" class="btn btn-primary btn-block">
										<spring:theme code="text.account.profile.saveUpdates"
											text="Save Updates" />
									</button>
								</ycommerce:testId>
							</div>
						</div>
						<div class="col-sm-6 col-sm-pull-6">
							<div class="accountActions">
								<ycommerce:testId
									code="personalDetails_cancelPersonalDetails_button">
									<button type="button"
										class="btn btn-default btn-block backToHome">
										<spring:theme code="text.account.profile.cancel" text="Cancel" />
									</button>
								</ycommerce:testId>
							</div>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</div>