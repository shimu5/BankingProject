<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<h2>Beneficiary List</h2>
<s:div>
	<table style="width: 100%; border: 1px solid gray;">
		<tr style="background: #CCCCCC;">
			<th>Alias Name</th>
			<th>Account Number</th>
			<th>Account Holder Name</th>
			<th>Mobile Number</th>
			<th>Email</th>
			<th>Amount</th>
			<th>&nbsp;</th>
		</tr>
	  	<s:iterator value="beneficList" var="benlist">
			<tr>
				<s:url id="deleteUrl" namespace="/user" action="DeleteBeneficiary">
						<s:param name="beneficiaryId">
							<s:property value="%{#benlist.beneficiaryId}" />
						</s:param>
					</s:url>  
				<td><s:property value="%{#benlist.aliasName}" /></td>
				<td><s:property value="%{#benlist.bankAccNumber}" /></td>
				<td><s:property value="%{#benlist.accountHolderName}" /></td>
				<td><s:property value="%{#benlist.mobileNumber}" /></td>
				<td><s:property value="%{#benlist.emailId}" /></td>
				<td><s:property value="%{#benlist.amount}" /></td>
				<td><s:a href="%{deleteUrl}">Delete</s:a></td>
			</tr>
		</s:iterator>
	</table>
</s:div>