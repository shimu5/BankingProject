<%@ taglib prefix="s" uri="/struts-tags"%>

<h2>Create Beneficiary Group</h2>
<s:form action="ConfirmBeneficiaryGroup" >

<table>
	<tr><th colspan="2">Confirm Beneficiary Information</th></tr>
	<tr>
		<td><b>Group Name:</b></td><td><s:property value="groupName" /></td>
		</tr>
	<tr><td><b>Alias Name/ Beneficiaries:</b></td><td>
			<ul>
			<s:iterator value="aliasNames" id="aliasname">
	            <li><s:property value="aliasname"/><br /><li>
			</s:iterator>
			</ul>
		</td>
	</tr>
	<s:hidden key="groupName" />
	<s:iterator id="bnames" value="aliasNames">
				<s:hidden key="aliasNames" value="%{bnames}" />
	</s:iterator>
	<s:submit value="confirm" />



</s:form>