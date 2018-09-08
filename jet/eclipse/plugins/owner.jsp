<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%> 
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%> 
<html> 
	<head>
		<meta name = "Generator" content = "Easy Struts Xslt generator for Eclipse (http://easystruts.sf.net).">

		<title>Struts Form for ownerForm</title>
	</head>
	<body>
		<html:form action="/owner">
			greet : <html:select property="greet">
			        <html:option value=""> </html:option>
			        <html:option value="Mr.">Mr.</html:option>
			        <html:option value="Miss">Miss</html:option>
			        <html:option value="Mrs.">Mrs.</html:option>
			        </html:select><html:errors property="greet"/> 
			name : <html:text property="name"/><html:errors property="name"/></br>
			address : <html:text property="address"/><html:errors property="address"/></br>
			email : <html:text property="email"/><html:errors property="email"/></br>
			tel : <html:text property="tel"/><html:errors property="tel"/></br>
			<html:submit/><html:cancel/>
		</html:form>
		<html:errors />
	<body>
</html>
