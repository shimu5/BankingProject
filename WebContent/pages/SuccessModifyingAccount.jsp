<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>
	<h2>Success Modify Account Info</h2>	
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
		<br> Yearly Income:<s:property value="bankaccount.yearlyIncome" />		
		<br> Login Id :<s:property value="bankaccount.username" />
		<br> Password: <input type="password" disabled="disabled" value="%{bankaccount.password}" />
	</s:div>
