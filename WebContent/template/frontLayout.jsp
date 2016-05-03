<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<META HTTP-EQUIV="PRAGMA" CONTENT="NO-CACHE">
<META HTTP-EQUIV="EXPIRES" CONTENT="0">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link href="<s:url value="/css/style.css"/>" rel="stylesheet"
	type="text/css" />
<link href="<s:url value="/css/layout.css"/>" rel="stylesheet"
	type="text/css" />
<script type="text/javascript"
	src="<s:url value="/js/jquery-1.11.3.min.js"/>"></script>
<s:head />
</head>
<body>

		<section id="header">
			<hgroup>
				<tiles:insertAttribute name="header" />
			</hgroup>
		</section>		
		<section id="main" >
			<s:if test="hasActionMessages()">
				<div class="welcome">
					<s:actionmessage />
				</div>
			</s:if>
			<s:if test="hasActionErrors()">
			    <div class="errorDiv">
			        <s:actionerror/>
			    </div>
			</s:if>			
			<div class="module_content vcent" >
				<tiles:insertAttribute name="body" />
			</div>
		</section>	
		

</body>
</html>


