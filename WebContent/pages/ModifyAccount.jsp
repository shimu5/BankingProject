<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Modify Account</h2>
	<s:div>
		<s:form action="ContinueModifyAccount">
			<s:hidden key="bankaccount.bankAccNumber" />
			<s:textfield key="Account Holder Name" name="bankaccount.accountHolderName" readonly="true"/>	
			<s:textfield key="Father Name" name="bankaccount.fatherName" readonly="true"/>	
			<s:textfield key="Mother Name" name="bankaccount.motherName" readonly="true"/>	
			<s:textarea key="Permanent Address" name="bankaccount.permanentAddress" cols="30" rows="5"/>	
			<s:textarea key="Current Address" name="bankaccount.currentAddress"  cols="30" rows="5"/>	
			<s:textfield key="Contact Number" name="bankaccount.contactNumber" />	
			<s:textfield key="Email Address" name="bankaccount.emailAddress" />	
			<s:textfield key="Occupation" name="bankaccount.occupation" />				
			<s:textfield key="National Id/ Passport Number" name="bankaccount.nid_pin" readonly="true"/>	
										
			<s:textfield key="Yearly Income" name="bankaccount.yearlyIncome" />	
			<s:textfield key="Balance" name="bankaccount.balance" />							
			<s:textfield key="Login Id" name="bankaccount.username" readonly="true"/>	
			<s:password key="Password" name="bankaccount.password" />							
			<s:submit value="Continue" />
		</s:form>
	</s:div>