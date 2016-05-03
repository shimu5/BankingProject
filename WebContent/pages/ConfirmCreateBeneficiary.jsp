<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<h2>Success Create Beneficiary</h2>
<s:div>
		<br> Account Holder Name: <s:property value="beneficiary.aliasName" />
		<br>Bank Account Number	<s:property value="beneficiary.bankAccNumber" />
		<br>Account Holder Name	<s:property value="beneficiary.accountHolderName" />
		<br>Mobile Number	<s:property value="beneficiary.mobileNumber" />		
		<br>Email Address	<s:property value="beneficiary.emailId" />	
		<br>Amount	<s:property value="beneficiary.amount" />				
</s:div>