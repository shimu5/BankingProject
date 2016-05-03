<%@ taglib prefix="s" uri="/struts-tags"%>


<h2>Account Summary</h2>
<s:div>

	<table style="width: 100%; border: 1px solid gray;">
		<tr style="background: #CCCCCC;">
			<th>Account Number</th>
			<th>Account Type</th>
			<th>Available Balance</th>
			<th>Ledger Balance</th>
			<th>Currency</th>
			<th>Status</th>
		</tr>
		<s:if test="%{bankLedgerlist.isEmpty()}">
			<tr>
				<td colspan="4">No Rows Found</td>
			</tr>
		</s:if>
		<s:else>		
				<s:iterator value="bankLedgerlist" 
					var="ledger">
					<tr>			
					
							<s:if test="#ledger[1]==1">								
								<s:set var="accntType" value="%{'Savings'}" />
							</s:if>
							<s:elseif test="#ledger[2]==2">
								<s:set var="accntType" value="%{'Current'}" />
							</s:elseif>
							<s:else >							
								<s:set var="accntType" value="%{'Super Saver'}" />
							</s:else>
								
								<td>
									<s:url id="viewAccntDetail" namespace="/user" action="ledgerAccount">
										<s:param name="bankAccNumber">
											<s:property value="#ledger[0]" />
										</s:param>
									</s:url>
									<b>Detail</b> <s:a href="%{viewAccntDetail}">  [ <s:property value="#ledger[0]" /> ]</s:a>
								</td>
								<td><s:property value="#accntType" /></td>
								<td><s:property value="#ledger[2]" /></td>	
								<td><s:property value="#ledger[5]+#ledger[7]-#ledger[6]" /></td>																
								<td><s:property value="#ledger[3]" /></td>	
								<td><s:property value="#ledger[4]" /></td>								
					</tr>
				</s:iterator>
				
		</s:else>
	</table>

</s:div>