<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<h2>Interest Calculation Form</h2>
<s:div>
<s:form action="ContinueToInterestCalculation">
	<table style="width: 100%; border: 1px solid gray;">
		<tr style="background: #D7E6F7;">
			<th>Account Number</th>
			<th>Account Holder Name</th>
			<th>Balance</th>
			<th>Interest Rate</th>
		</tr>
		<s:if test="%{bankInterestList.isEmpty()}">
			<tr>
				<td colspan="4">No Rows Found</td>
			</tr>
		</s:if>
		<s:else>
			
				<s:iterator value="bankInterestList" status="rowStatus"
					var="accntlist">
					<tr>
						<s:if test="#rowStatus.even == true">
							<s:iterator value="#accntlist[1]" var="bankaccnt">
								<td style="background: #D7E6F7"><s:property
										value="#bankaccnt.bankAccNumber" /></td>
								<td style="background: #D7E6F7"><s:property
										value="#bankaccnt.accountHolderName" /></td>
								<td style="background: #D7E6F7"><s:property
										value="#bankaccnt.balance" /></td>

							</s:iterator>
							<s:iterator value="#accntlist[0]" var="intRate">
								<td style="background: #D7E6F7"><s:property
										value="#intRate.annualInterestRate" />%</td>
							</s:iterator>

						</s:if>
						<s:else>
							<s:iterator value="#accntlist[1]" var="bankaccnt">
								<td><s:property value="#bankaccnt.bankAccNumber" /></td>
								<td><s:property value="#bankaccnt.accountHolderName" /></td>
								<td><s:property value="#bankaccnt.balance" /></td>

							</s:iterator>
							<s:iterator value="#accntlist[0]" var="intRate">
								<td><s:property value="#intRate.annualInterestRate" />%</td>
							</s:iterator>
						</s:else>
					</tr>
				</s:iterator>
				<tr><td colspan="6"><s:submit value="Continue" /></td></tr>
			
		</s:else>
	</table>
	</s:form>
</s:div>