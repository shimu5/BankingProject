<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<h2>Withdraw Amount</h2>
<s:div>
		<s:form action="ContinueToWithdrawAmount" >
			<s:textfield key="Account Number" name="ledgeraccount.bankAccNumber" required="required" />
			<s:textfield key="Withdraw Amount" name="ledgeraccount.widrawAmount" required="required" />
			<s:textfield key="Ref/Check Number" name="ledgeraccount.refInfo" required="required" />
			<s:textfield key="Description" name="ledgeraccount.description" required="required" />
			<s:submit value="Continue" />
		</s:form>		
</s:div>