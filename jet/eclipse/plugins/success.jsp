<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%> 
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>


<logic:present name="name" scope="request">
Thank you, 
	<logic:present name="greet" scope="request">
	<bean:write name="greet" scope="request"/>
	</logic:present>
<bean:write name="name" scope="request"/>
</logic:present>
