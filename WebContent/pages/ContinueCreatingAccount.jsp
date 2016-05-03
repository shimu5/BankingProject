<%@ taglib prefix="s" uri="/struts-tags"%>
<style> table {margin: 0 auto; }</style>
	
	<s:div cssClass="tcent">
		<div  id="navcontainer"><ul><li><s:a href="login.action" > Login </s:a></li></ul></div>
	<h2>Create a New Account Confirmation</h2>
	
	<s:div>
		<s:text name="Please check the data carefully in the form below:" />
		<br> Account Type: <s:property value="bankaccount.bankAccountType" />
		<br> Account Holder Name: <s:property value="bankaccount.accountHolderName" />
		<br> Father Name: <s:property value="bankaccount.fatherName" />
		<br> Mother Name: <s:property value="bankaccount.motherName" />
		<br> Permanent Address: <s:property value="bankaccount.permanentAddress" />
		<br> Current Address: <s:property value="bankaccount.currentAddress" />
		<br> Contact Number: <s:property value="bankaccount.contactNumber" />
		<br> Email:<s:property value="bankaccount.emailAddress" />		
		<br> Occupation : <s:property value="bankaccount.occupation" />
		<br> National Id/ Passport Number:<s:property value="bankaccount.nid_pin" />
		<br> Currency: <s:property value="bankaccount.currency" />
		<br> Yearly Income:<s:property value="bankaccount.yearlyIncome" />
		<br> Balance:<s:property value="bankaccount.balance" />
		<!--  <br> Active Status: <s:property value="activeStatus" />-->
		<br> Login Id :<s:property value="bankaccount.username" />
		<br> Password: <input type="password" disabled="disabled" value="%{bankaccount.password}" />
	</s:div>
	<s:div>
		<s:form action="ConfirmCreateAccount">
			<s:hidden key="bankaccount.bankAccountType" />
			<s:hidden key="bankaccount.accountHolderName" />
			<s:hidden key="bankaccount.fatherName" />
			<s:hidden key="bankaccount.motherName" />
			<s:hidden key="bankaccount.permanentAddress" />
			<s:hidden key="bankaccount.currentAddress" />
			<s:hidden key="bankaccount.contactNumber" />
			<s:hidden key="bankaccount.emailAddress" />
			<s:hidden key="bankaccount.occupation" />
			<s:hidden key="bankaccount.nid_pin" />
			<s:hidden key="bankaccount.currency" />
			<s:hidden key="bankaccount.yearlyIncome" />
			<s:hidden key="bankaccount.balance" />	
			<s:hidden key="bankaccount.username" />
			<s:hidden key="bankaccount.password" />			
			<s:submit value="Confirm" />
		</s:form>
	</s:div>
	</s:div>