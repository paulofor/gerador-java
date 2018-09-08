// Created by Xslt generator for Eclipse.
// XSL :  not found (java.io.FileNotFoundException:  (Bad file descriptor))
// Default XSL used : easystruts.jar$org.easystruts.xslgen.JavaClass.xsl

package com.asprise.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.asprise.struts.form.OwnerForm;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/** 
 * OwnerAction.java created by EasyStruts - XsltGen.
 * http://easystruts.sf.net
 * created on 03-04-2004
 * 
 * XDoclet definition:
 * @struts:action path="/owner" name="ownerForm" input="/owner.jsp" validate="true"
 * @struts:action-forward name="/success.jsp" path="/success.jsp"
 */
public class OwnerAction extends Action {

	// --------------------------------------------------------- Instance Variables

	// --------------------------------------------------------- Methods

	/** 
	 * Method execute
	 * @param ActionMapping mapping
	 * @param ActionForm form
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 * @return ActionForward
	 * @throws Exception
	 */
	
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws Exception {
		OwnerForm ownerForm = (OwnerForm) form;
		String greet = ownerForm.getGreet();
		String name = ownerForm.getName();  
		request.setAttribute("name", name);
    	request.setAttribute("greet", greet);
		
		String address = ownerForm.getAddress();
		String email = ownerForm.getEmail();
		int tel = ownerForm.getTel();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		DataSource dataSource = (DataSource)servlet.getServletContext().getAttribute("org.apache.struts.action.DATA_SOURCE");
		try{
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			int id = 0;
			rs = stmt.executeQuery("select max(id) as counter from owner");
			while(rs.next()){
				id = rs.getInt("counter");
			}
			id += 1;
			stmt.executeUpdate("insert into owner values("+id+", '"+greet+"', '"+name+"', '"+email+"', '"+address+"', "+tel+")");
			rs.close();
			stmt.close();
			conn.close();	
		}
		catch(SQLException e){	
			throw new SQLException("database error");
		}
		// Forward control to the specified success target 
		return (mapping.findForward("success"));
	}
}
