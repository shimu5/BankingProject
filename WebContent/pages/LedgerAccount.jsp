<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<h2>Ledger Account Details</h2>
<s:div>

	<table style="width: 100%; border: 1px solid gray;">

		<s:if test="%{bankLedgerlist.isEmpty()}">
			<tr>
				<td colspan="4">No Rows Found</td>
			</tr>
		</s:if>
		<s:else>
			<s:iterator value="bankLedgerlist" var="ledger">
				<s:if test="#ledger[1]==1">
					<s:set var="accntType" value="%{'Savings'}" />
				</s:if>
				<s:elseif test="#ledger[2]==2">
					<s:set var="accntType" value="%{'Current'}" />
				</s:elseif>
				<s:else>
					<s:set var="accntType" value="%{'Super Saver'}" />
				</s:else>
				<tr style="background: #CCCCCC;">
					<th colspan="6">Account : <s:property value="#accntType" />
						Details
					</th>
				</tr>
				<tr>
					<th>Account Number</th>
					<td><s:property value="#ledger[0]" /></td>
					<th>Currency</th>
					<td><s:property value="#ledger[3]" /></td>
					<th>Status</th>
					<td><s:property value="#ledger[4]" /></td>
				</tr>
				<tr>
					<th>Available Balance</th>
					<td><s:property value="#ledger[2]" /></td>
					<th>Ledger Balance</th>
					<td><s:property value="#ledger[5]+#ledger[7]-#ledger[6]" /></td>
					<th>Total Balance</th>
					<td><s:property value="#ledger[2]" /></td>
				</tr>
			</s:iterator>
		</s:else>
	</table>
	<br />
	<table style="width: 100%; border: 1px solid gray;">
		<tr style="background: #CCCCCC;">
			<th>Date</th>
			<th>Ref./Cheque Number</th>
			<th>Description</th>
			<th>Deposit</th>
			<th>Withdraw</th>
			<th>Interest</th>
		</tr>
		<s:iterator value="Ledgerlist" var="ledlist">
			<tr>
				<s:set var="ledgerdate" value="%{#ledlist.ledgerDate}" />
				
				<td><s:date name="ledgerdate" format="dd-MM-yyyy" /></td>
				<td><s:property value="%{#ledlist.refInfo}" /></td>
				<td><s:property value="%{#ledlist.description}" /></td>
				<td><s:property value="%{#ledlist.depositAmount}" /></td>
				<td><s:property value="%{#ledlist.widrawAmount}" /></td>
				<td><s:property value="%{#ledlist.interestAmount}" /></td>
			</tr>
		</s:iterator>
	</table>
</s:div>