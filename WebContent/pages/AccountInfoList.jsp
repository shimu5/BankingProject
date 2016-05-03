<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Account Search Result</h2>
<s:div>
<table>
		<thead>
			<tr>
				<th>Action</th>
				<th>Bank Account No.</th>
				<th>Account Type</th>
				<th>Account Holder Name</th>
				<th>Father Name</th>
				<th>Mother Name</th>
				<th>Permanent Address</th>
				<th>Current Address</th>
				<th>Contact Number</th>
				<th>Email Address</th>
				<th>Balance</th>				
			</tr>
		</thead>
		<s:iterator id="bankaccount" value="accountList">
			<tr>
				<td>
					<s:url id="editUrl" namespace="/admin" action="ModifyAccount">
						<s:param name="bankAccNumber">
							<s:property value="%{#bankaccount.bankAccNumber}" />
						</s:param>
					</s:url>
					<s:url id="deleteUrl" namespace="/admin" action="DeleteAccount">
						<s:param name="bankAccNumber">
							<s:property value="%{#bankaccount.bankAccNumber}" />
						</s:param>
					</s:url>  
					<s:a href="%{editUrl}" >Edit</s:a> 
					<s:a href="%{deleteUrl}" cssClass="delete">Delete</s:a>
				</td>
				<td><s:property value="%{#bankaccount.bankAccNumber}" /></td>
				<td><s:if test="#bankaccount.bankAccountType==1">																
								Savings
							</s:if>
							<s:elseif test="#bankaccount.bankAccountType==2">
								Current				
							</s:elseif>
							<s:else >	
								Super Saver													
							</s:else>
				</td>
				<td><s:property value="%{#bankaccount.accountHolderName}" /></td>
				<td><s:property value="%{#bankaccount.fatherName}" /></td>
				<td><s:property value="%{#bankaccount.motherName}" /></td>				
				<td><s:property value="%{#bankaccount.permanentAddress}" /></td>
				<td><s:property value="%{#bankaccount.currentAddress}" /></td>
				<td><s:property value="%{#bankaccount.contactNumber}" /></td>
				<td><s:property value="%{#bankaccount.emailAddress}" /></td>
				<td><s:property value="%{#bankaccount.balance}" /></td>			
			</tr>
		</s:iterator>
	</table>
	</s:div>