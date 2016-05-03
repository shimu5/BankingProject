<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<h2>Create Beneficiary</h2>
	<s:div>
		<s:form action="ConfirmBeneficiary">			
			<s:textfield label="Alias Name" name="beneficiary.aliasName" />	
			<s:textfield label="Bank Account Number" name="beneficiary.bankAccNumber" />
			<s:textfield label="Account Holder Name" name="beneficiary.accountHolderName" />
			<s:textfield label="Mobile Number" name="beneficiary.mobileNumber" />		
			<s:textfield label="Email Address" name="beneficiary.emailId" />	
			<s:textfield label="Amount" key="beneficiary.amount" />								
			<s:submit value="Submit" />
		</s:form>
	</s:div>