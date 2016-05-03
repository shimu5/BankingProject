<%@ taglib prefix="s" uri="/struts-tags"%>
<style> table {margin: 0 auto; }</style>
	
	<s:div cssClass="tcent">
		<div  id="navcontainer"><ul><li><s:a href="login.action" > Login </s:a></li></ul>
		</div>
		
		<h2>Create a New Account</h2>
		<s:form action="ContinueCreateAccount">
			<s:select list="accountTypes" name="bankaccount.bankAccountType" listKey="id" listValue="name"
				key="Account Type" ></s:select>
			<s:textfield key="Account Holder Name" name="bankaccount.accountHolderName" required="required"/>	
			<s:textfield key="Father Name" name="bankaccount.fatherName" required="required"/>	
			<s:textfield key="Mother Name" name="bankaccount.motherName" required="required"/>	
			<s:textfield key="Permanent Address" name="bankaccount.permanentAddress" required="required"/>	
			<s:textfield key="Current Address" name="bankaccount.currentAddress" />	
			<s:textfield key="Contact Number" name="bankaccount.contactNumber" />	
			<s:textfield key="Email Address" name="bankaccount.emailAddress" />	
			<s:textfield key="Occupation" name="bankaccount.occupation" />				
			<s:textfield key="National Id/ Passport Number" name="bankaccount.nid_pin" />	
			<s:select list="currencies" name="bankaccount.currency" listKey="currency_code" listValue="currency_name"
				key="Currency" ></s:select>							
			<s:textfield key="Yearly Income" name="bankaccount.yearlyIncome" />	
			<s:textfield key="Balance" name="bankaccount.balance" required="required" />							
			<s:textfield key="Login Id" name="bankaccount.username" required="required" />	
			<s:password key="Password" name="bankaccount.password" required="required" />							
			<s:submit value="Continue" />
		</s:form>
	</s:div>
