<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<h2>Transfer History </h2>
<s:div>
	<s:form action="AccountTransferHistory">
		<div>
			<div style="float:left;width:50%"><s:textfield key="From " name="fromDate" cssClass="datepick"/></div>
			<div style="float:left;width:50%"><s:textfield key="To " name="toDate" cssClass="datepick"/></div>
			<div style="clear:both"></div>
		</div>
		<div><s:submit value="Search" /> </div>
	</s:form>
</s:div>

<s:div>
	<table style="width: 100%; border: 1px solid gray;">
		<tr style="background: #CCCCCC;">
			<th>TransferId</th>
			<th>Date</th>
			<th>From Account </th>
			<th>To Account</th>
			<th>Transfer type</th>
			<th>Reason</th>
			<th>Amount</th>
		</tr>
	  	<s:iterator value="transHistoryList" var="histlist">
			<tr>
				<s:url id="deleteUrl" namespace="/user" action="DeleteBeneficiary">
						<s:param name="transferId">
							<s:property value="%{#histlist.transferId}" />
						</s:param>
					</s:url>  
				<td><s:property value="%{#histlist.transferId}" /></td>
				<td><s:property value="%{#histlist.actionDate}" /></td>
				<td><s:property value="%{#histlist.fromAccount}" /></td>
				<td><s:property value="%{#histlist.toAccount}" /></td>
				<td><s:property value="%{#histlist.transferType}" /></td>
				<td><s:property value="%{#histlist.remarks}" /></td>
				<td><s:property value="%{#histlist.amount}" /></td>
				
			</tr>
		</s:iterator>
	</table>
</s:div>
