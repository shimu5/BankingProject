
<%@ taglib uri="/struts-tags" prefix="s"%>
<div>
	<div style="float: left; width: 70%;">
		<h1 class="site_title">BJIT Project of Shamima</h1>
	</div>
	<div style="float: right; width: 20%; padding-left: 5%;">
	<s:if test="#session.user != null">  
	
		<h4 class="section_title">Welcome - <s:property value="%{#session.bankinfo.accountHolderName}" /> <b>[<s:property value="%{#session.user.LoginId}" />]</b></h4>
	</s:if>
	</div>
	<div style="clear: both"></div>
</div>
<!--<s:property value="%{#session.user}" />
<s:property value="%{#session.bankinfo}" />-->
