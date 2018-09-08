<%@ page import="java.sql.SQLException" %>
<%@ page import="com.asprise.struts.form.*" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%> 

<%
	OwnerForm myForm = (OwnerForm)request.getAttribute("myForm");
    if (myForm != null) {
    	out.println("<font color=red>Sorry, "+myForm.getGreet());
    	out.println(" "+myForm.getName()+"</font>");
	}
%>	
<ul><bean:message key="<%=request.getAttribute(\"myKey\").toString()%>" /> 
<%  
	Object obj = request.getAttribute("myException");
    if (obj != null) {
    	Throwable ex = (Throwable)obj;
    	out.println("<li><b>Type:</b>"+ex.toString());
    	out.println("<li><b>Message:</b>"+ex.getMessage());
	}
%>