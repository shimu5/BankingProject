<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<h2>Success Interest Calculation</h2>
<s:div>

	<table style="width: 100%; border: 1px solid gray;">
		<tr style="background: #CCCCCC;">
			<th>Account Number</th>
			<th>Account Holder Name</th>
			<th>Balance</th>
			<th>Interest Rate</th>
			<th>Total Interest</th>
			<th>Total Balance</th>
		</tr>
		<s:if test="%{bankInterestList.isEmpty()}">
			<tr>
				<td colspan="6">No Rows Found</td>
			</tr>
		</s:if>
		<s:else>		
		<tr><td><s:text name="Interest has been added in following account successfully." /></td></tr>	
				<s:iterator value="bankInterestList" status="rowStatus"
					var="accntlist">
					<tr>
						<s:set var="totalinterest" value="%{0}" />
						<s:set var="totalbalance" value="%{0}" />
						<s:if test="#rowStatus.even == true">
							<s:iterator value="#accntlist[1]" var="bankaccnt">
								<td style="background: #CCCCCC"><s:property
										value="#bankaccnt.bankAccNumber" /></td>
								<td style="background: #CCCCCC"><s:property
										value="#bankaccnt.accountHolderName" /></td>
								<td style="background: #CCCCCC"><s:property
										value="#bankaccnt.balance" /></td>
								
							</s:iterator>
							<s:iterator value="#accntlist[0]" var="intRate">
								<td style="background: #CCCCCC"><s:property
										value="#intRate.annualInterestRate" />%</td>
										<s:set var="totalinterest" value="%{#bankaccnt.balance*#intRate.annualInterestRate/100}" />
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
									<s:set var="totalinterest" value="%{#bankaccnt.balance*#intRate.annualInterestRate/100}" />
							</s:iterator>
						</s:else>
						<td style="background: #CCCCCC"><s:property
										value="#totalinterest" /></td>
						<td style="background: #CCCCCC"><s:property
										value="%{#totalinterest+#bankaccnt.balance}" /></td>		
					</tr>
				</s:iterator>
					
		</s:else>
	</table>
	
</s:div>