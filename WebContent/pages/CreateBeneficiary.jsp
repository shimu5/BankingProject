<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<h2>Create Beneficiary</h2>
		<s:div>
			
		<s:form action="ContinueBeneficiary">			
			<s:textfield label="Alias Name" name="beneficiary.aliasName" required="required" />	
			<s:textfield label="Bank Account Number" name="beneficiary.bankAccNumber"  required="required" />
			<s:textfield label="Account Holder Name" name="beneficiary.accountHolderName" required="required" />
			<s:textfield label="Mobile Number" name="beneficiary.mobileNumber" required="required" />		
			<s:textfield label="Email Address" name="beneficiary.emailId" required="required" />	
			<s:textfield label="Amount" name="beneficiary.amount" required="required" />								
			<s:submit value="Continue" />
		</s:form>
	</s:div>
	
