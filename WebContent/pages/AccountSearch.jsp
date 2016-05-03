<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Search Account</h2>
	<s:div>
		<s:form action="AccountSearchResult">
			
			<s:textfield key="Account Holder Name" name="bankaccount.accountHolderName" />	
			<s:textfield key="Father Name" name="bankaccount.fatherName" />	
			<s:textfield key="Mother Name" name="bankaccount.motherName" />	
			<s:textfield key="Permanent Address" name="bankaccount.permanentAddress" />	
			<s:textfield key="Current Address" name="bankaccount.currentAddress" />	
			<s:textfield key="Contact Number" name="bankaccount.contactNumber" />	
			<s:textfield key="Email Address" name="bankaccount.emailAddress" />	
			<s:textfield key="Occupation" name="bankaccount.occupation" />				
			<s:textfield key="National Id/ Passport Number" name="bankaccount.nid_pin" />								
			<s:textfield key="Yearly Income" name="bankaccount.yearlyIncome" />	
							
			<s:submit value="Search" />
		</s:form>
	</s:div>