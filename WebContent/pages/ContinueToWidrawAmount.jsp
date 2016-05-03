<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<h2>Withdraw Amount </h2>
<s:div>
		<s:text name="Please check the data carefully in the form below:" />
		<br> Account Number: <s:property value="ledgeraccount.bankAccNumber" />
		<br> Withdraw Amount: <s:property value="ledgeraccount.widrawAmount" />
		<br> Ref/Check Number: <s:property value="ledgeraccount.refInfo" />
		<br> Description: <s:property value="ledgeraccount.description" />		
	</s:div>
<s:div>
		<s:form action="ConfirmWithdrawAmount">
			<s:hidden key="ledgeraccount.bankAccNumber" />
			<s:hidden key="ledgeraccount.widrawAmount" name="ledgeraccount.widrawAmount" />
			<s:hidden key="ledgeraccount.refCheckNumber" name="ledgeraccount.refInfo" />
			<s:hidden key="Description" name="ledgeraccount.description" />
			<s:submit value="Confirm" />
		</s:form>		
</s:div>