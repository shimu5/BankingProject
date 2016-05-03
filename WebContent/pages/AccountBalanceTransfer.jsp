<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<h1>Account Balance Transfer</h1>
	<s:form action="ConfirmBalanceTransfer">
		<s:textfield label="From Account Number" name="fromAccount" value="%{#session.user.bankAccNumber}" readonly="1"/>
		<s:textfield label="Available Balance" name="fromBalance" value="%{#session.bankinfo.balance}" />
		<s:select label="Alias" headerKey="-1" headerValue="Select Beneficiary" id="beneficiaryId"
		list="beneficList" 
		name="beneficiaryAccount" listKey="bankAccNumber" listValue="aliasName" required="required" />

		<s:textfield label="To Account" name="toAccount"  required="required"/>
		<s:textfield label="Account Holder Name" name="toAccountHolderName"  required="required"/>
		<s:textfield label="Amount" name="transferAmount" required="required"/>
		<s:textarea label="Remarks" name="remarks" required="required" />
		<s:submit value="Confirm" />
	</s:form>
<script>
$( "#beneficiaryId" ).change(function() {	
	
	var benefiAccnt = $(this).val();    
    $.ajax({
        url: "BankAccountInfo.action",
        data: "bankAccNumber="+benefiAccnt,
        dataType: 'json',
        //contentType: 'application/json',
        type: 'POST',
        async: true,
        success: function (res) {    
        	console.log(res.bankaccount.accountHolderName);
        	$("#ConfirmBalanceTransfer_toAccountHolderName").val(res.bankaccount.accountHolderName);
            $("#ConfirmBalanceTransfer_toAccount").val(res.bankaccount.bankAccNumber);
        }
    });
});
</script>