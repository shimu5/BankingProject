<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>
	<h2>Modify Account Info</h2>	
	<s:div>
		<s:text name="Please check the data carefully in the form below:" />	
		<br> Account Holder Name: <s:property value="bankaccount.accountHolderName" />
		<br> Father Name: <s:property value="bankaccount.fatherName" />
		<br> Mother Name: <s:property value="bankaccount.motherName" />
		<br> Permanent Address: <s:property value="bankaccount.permanentAddress" />
		<br> Current Address: <s:property value="bankaccount.currentAddress" />
		<br> Contact Number: <s:property value="bankaccount.contactNumber" />
		<br> Email:<s:property value="bankaccount.emailAddress" />		
		<br> Occupation : <s:property value="bankaccount.occupation" />
		<br> National Id/ Passport Number:<s:property value="bankaccount.nid_pin" />		
		<br> Yearly Income:<s:property value="bankaccount.yearlyIncome" />		
		<br> Login Id :<s:property value="bankaccount.username" />
		<br> Password: <input type="password" disabled="disabled" value="%{bankaccount.password}" />
		<br> Account Number: <s:property value="bankaccount.bankAccNumber" />
	</s:div>
	<s:div>
		<s:form action="SuccessModifyingAccount">
			<s:hidden key="bankaccount.bankAccNumber" />
			<s:hidden key="bankaccount.accountHolderName" />
			<s:hidden key="bankaccount.accountHolderName" />
			<s:hidden key="bankaccount.fatherName" />
			<s:hidden key="bankaccount.motherName" />
			<s:hidden key="bankaccount.permanentAddress" />
			<s:hidden key="bankaccount.currentAddress" />
			<s:hidden key="bankaccount.contactNumber" />
			<s:hidden key="bankaccount.emailAddress" />
			<s:hidden key="bankaccount.occupation" />
			<s:hidden key="bankaccount.nid_pin" />			
			<s:hidden key="bankaccount.yearlyIncome" />			
			<!--<s:hidden key="activeStatus" />-->
			<s:hidden key="bankaccount.username" />
			<s:hidden key="bankaccount.password" />			
			<s:submit value="Confirm" />
		</s:form>
	</s:div>