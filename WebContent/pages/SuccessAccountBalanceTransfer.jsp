<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<s:div cssClass="infoDiv">
	<h3>Successful Balance Transfer</h3>	
	<h4>From Account : <s:property value="fromAccount" /> to Account : <s:property value="toAccount" />	
	<br/>Amount : <s:property value="transferAmount" /></h4>
</s:div>
