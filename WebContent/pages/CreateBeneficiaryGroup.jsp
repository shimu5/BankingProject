<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<h2>Create Beneficiary Group</h2>

<s:form action="ContinueBeneficiaryGroup" theme = "simple">
	<table class="wwFormTable">

		<tbody>
			<tr>
				<td class="tdLabel"><label class="label" for="ContinueBeneficiary_beneficiary_aliasName">Group Name:</label></td>
				<td><s:textfield label="Group Name" name="groupName" required="required" /></td>
			</tr>
		</tbody>
	</table>
	<div><h3>Beneficiary List</h3></div>
		<table class="listTable">		
			<tr style="background: #CCCCCC;">
				<th>&nbsp;</th>
				<th>Alias Name</th>
				<th>Account Number</th>
				<th>Account Holder Name</th>
				<th>Mobile Number</th>
				<th>Email</th>
				<th>Amount</th>
			</tr>
			<s:iterator value="beneficList" var="benlist">
				<tr>					
					<td>&nbsp;<s:checkbox name="aliasNames" theme="simple" fieldValue="%{#benlist.aliasName}"/> </td>
					<td><s:property value="%{#benlist.aliasName}" /></td>
					<td><s:property value="%{#benlist.bankAccNumber}" /></td>
					<td><s:property value="%{#benlist.accountHolderName}" /></td>
					<td><s:property value="%{#benlist.mobileNumber}" /></td>
					<td><s:property value="%{#benlist.emailId}" /></td>
					<td><s:property value="%{#benlist.amount}" /></td>
				</tr>
			</s:iterator>
		</table>
		<div class="tcent"><s:submit value="Create" /> </div>
</s:form>
