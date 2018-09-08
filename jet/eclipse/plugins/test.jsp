 <%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%> 
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%> 
<html> 
	<head>
		<meta name = "Generator" content = "Easy Struts Xslt generator for Eclipse (http://easystruts.sf.net).">

		<title>Struts Form for testForm</title>
	</head>
	<body>
		<html:form action="/[ACTION_PATH]">
			name : <html:text property="name"/><html:errors property="name"/></br>
			<html:submit/><html:cancel/>
		</html:form>
	<body>
</html>
