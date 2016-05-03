<%@ taglib uri="/struts-tags"  prefix="s" %>
<div id="menuwrapper">
<ul class="tabs"> <h2 class="lpad20">Admin</h2><hr>
<li><a href="<s:url action="SearchAccount"/>" > Search Account</a></li>
<li><a href="<s:url action="DepositAmount"/>" > Deposit Amount </a></li>
<li><a href="<s:url action="WithdrawAmount"/>" > Withdraw Amount</a></li>
<li><a href="<s:url action="CalculateInterest"/>" >Interest Calculation</a></li>
<li><a href="<s:url action="Logout"/>" >Logout </a></li>
</ul>
</div>