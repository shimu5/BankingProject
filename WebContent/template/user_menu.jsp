<%@ taglib uri="/struts-tags"  prefix="s" %>

<s:url id="viewAccnt" namespace="/user" action="ViewSummary">
	<s:param name="bankAccNumber">
		<s:property value="%{#session.user.bankAccNumber}" />
	</s:param>
</s:url>
<s:url id="benefList" namespace="/user" action="BeneficiaryList">
	<s:param name="bankAccNumber">
		<s:property value="%{#session.user.bankAccNumber}" />
	</s:param>
</s:url>
<div id="menuwrapper">
<ul class="tabs"> <h2 class="lpad20">User</h2><hr>
<li><s:a href="%{viewAccnt}">View Account Summary</s:a> </li>
<li><a href="<s:url action="CreateBeneficiary"/>" >Create Beneficiary</a> </li>
<li><s:a href="%{benefList}">List of Beneficiary</s:a> </li>
<li><a href="<s:url action="CreateBeneficiaryGroup"/>" >Create Beneficiary Group</a> </li>
<li><a href="<s:url action="ListBeneficiaryGroup"/>" >List of Beneficiary Group</a> </li>
<li> <a href="<s:url action="AccountBalanceTransfer"/>" > Account Transfer (Single)</a> </li>
<li><a href="<s:url action="AccountBalanceTransferGroup"/>" > Account Transfer (Group)</a></li>
<li><a href="<s:url action="AccountTransferHistory"/>" > Account Transfer History</a></li>
<li><a href="<s:url action="BillPayment"/>" >Bill Payment</a></li>
<li><a href="<s:url action="BillPaymentHistory"/>" >Bill Payment History </a></li>
<li><a href="<s:url action="Logout"/>" >Logout </a></li>
</ul>
</div>