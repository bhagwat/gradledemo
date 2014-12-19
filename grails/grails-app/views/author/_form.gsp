<%@ page import="demo.Author" %>



<div class="fieldcontain ${hasErrors(bean: authorInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="author.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${authorInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: authorInstance, field: 'yearsOfExperience', 'error')} required">
	<label for="yearsOfExperience">
		<g:message code="author.yearsOfExperience.label" default="Years Of Experience" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="yearsOfExperience" type="number" value="${authorInstance.yearsOfExperience}" required=""/>

</div>

