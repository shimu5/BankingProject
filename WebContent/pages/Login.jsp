<%@ taglib prefix="s" uri="/struts-tags"%>
<style> table {margin: 0 auto; }</style>
<div style="text-align:center">
	<s:url id="LocaleEN" namespace="/" action="locale">
		<s:param name="request_locale">en</s:param>
	</s:url>
	<s:url id="LocaleBD" namespace="/" action="locale">
		<s:param name="request_locale">bn_BD</s:param>
	</s:url>
	<s:url id="LocaleDE" namespace="/" action="locale">
		<s:param name="request_locale">de</s:param>
	</s:url>
	<div  id="navcontainer">
		<ul>
			<li><s:a href="%{LocaleEN}" > English </s:a></li>
			<li><s:a href="%{LocaleBD}" > Bangla </s:a>	</li>	
			<li><s:a href="%{LocaleDE}" > Germany </s:a></li>
		</ul>
	</div>
	<h2>Login</h2>
	<s:form action="validateUser" >
		<s:textfield key="global.username" name="username" />		
		<s:password key="global.password" name="password" />
		<s:select list="{'AccountHolder','Admin'}" name="loginType" key="global.loginType"></s:select>		
		<s:submit value="Submit" />					
	</s:form>
		<div>
			<b><a href="<s:url action="CreateAccount"/>" >Register</a></b>		
		</div>
</div>


