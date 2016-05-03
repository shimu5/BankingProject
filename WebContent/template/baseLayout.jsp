<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<META HTTP-EQUIV="PRAGMA" CONTENT="NO-CACHE">
<META HTTP-EQUIV="EXPIRES" CONTENT="Mon, 22 Jul 2002 11:12:01 GMT">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link href="<s:url value="/css/style.css"/>" rel="stylesheet"
	type="text/css" />
<link href="<s:url value="/css/layout.css"/>" rel="stylesheet"
	type="text/css" />
<link href="<s:url value="/css/jquery-ui.css"/>" rel="stylesheet"
	type="text/css" />
<script type="text/javascript"
	src="<s:url value="/js/jquery-1.11.3.min.js"/>"></script>
	<script type="text/javascript"
	src="<s:url value="/js/jquery-ui.js"/>"></script>
<s:head />
</head>
<body>

		<section id="header">
			<hgroup>
				<tiles:insertAttribute name="header" />
			</hgroup>
		</section>
		<section id="sidebar" class="column">
			<tiles:insertAttribute name="menu" />
			<tiles:insertAttribute name="footer" />			
		</section>
		<section id="main" class="column">
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
			<div class="module_content">
				<tiles:insertAttribute name="body" />
			</div>
		</section>	
		<script>
			$( ".datepick" ).datepicker({
			  dateFormat: "mm/dd/yy"
			});
		</script>
</body>
</html>


