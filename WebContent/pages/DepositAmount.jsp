<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<h2>Deposit Amount</h2>
<h3><s:if test="%{#msg!=''}">
	<s:property value="msg" />
	</s:if>
</h3>
<s:div>
		<s:form action="ContinueToDepositAmount" >
			<s:textfield key="Account Number" name="ledgeraccount.bankAccNumber" required="required" />
			<s:textfield key="Deposit Amount" name="ledgeraccount.depositAmount" required="required" />
			<s:textfield key="Ref/Check Number" name="ledgeraccount.refInfo" required="required" />
			<s:textfield key="Description" name="ledgeraccount.description" required="required" />
			<s:submit value="Continue" />
		</s:form>		
</s:div>