<%@ taglib prefix="s" uri="/struts-tags"%>
<style> table {margin: 0 auto; }</style>
	
	<s:div cssClass="tcent">
		<div  id="navcontainer"><ul><li><s:a href="login.action" > Login </s:a></li></ul></div>

<h2>Account Create Successful</h2>
<s:div>

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
		<br> Login Id :<s:property value="bankaccount.username" />
		<br> Password: <input type="password" disabled="disabled" value="%{bankaccount.password}" />
</s:div>
</s:div>
