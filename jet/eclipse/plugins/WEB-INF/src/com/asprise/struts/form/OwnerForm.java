// Created by Xslt generator for Eclipse.
// XSL :  not found (java.io.FileNotFoundException:  (Bad file descriptor))
// Default XSL used : easystruts.jar$org.easystruts.xslgen.JavaClass.xsl

package com.asprise.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
//bold this line
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * OwnerForm.java created by EasyStruts - XsltGen.
 * http://easystruts.sf.net
 * created on 03-04-2004
 * 
 * XDoclet definition:
 * @struts:form name="ownerForm"
 */
public class OwnerForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** Email property */
	private String email;

	/** Greet property */
	private String greet = "Mr.";

	/** Address property */
	private String address;

	/** Tel property */
	//bold this line
	private int tel = 0;

	/** Name property */
	private String name;

	// --------------------------------------------------------- Methods

	/** 
	 * Method validate
	 * @param ActionMapping mapping
	 * @param HttpServletRequest request
	 * @return ActionErrors
	 */
	//bold this method
	public ActionErrors validate(
		ActionMapping mapping,
		HttpServletRequest request) {
			ActionErrors errors = new ActionErrors();
			if (greet == null || greet.trim().equals("")) { 
			  errors.add("greet", new ActionError("error.greet"));
			}
			if (name == null || name.trim().equals("")) { 
			  errors.add("name", new ActionError("error.name"));
			}
			if (address == null || address.trim().equals("")) { 
			  errors.add("address", new ActionError("error.address"));
			}
			if (email == null || email.trim().equals("")) { 
			  errors.add("email", new ActionError("error.noEmail"));
			}
			else if (email.indexOf("@")==-1) { 
			  errors.add("email", new ActionError("error.wrongEmail"));
		  	}
			if (tel==0) { 
			  errors.add("tel", new ActionError("error.tel"));
			}
			return errors;
	}

	/** 
	 * Method reset
	 * @param ActionMapping mapping
	 * @param HttpServletRequest request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		email = "";
		greet = "Mr.";
		address = "";
		//bold this line
		tel = 0;
		name = "";

	}

	/** 
	 * Returns the Email.
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/** 
	 * Set the Email.
	 * @param Email The Email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/** 
	 * Returns the Greet.
	 * @return String
	 */
	public String getGreet() {
		return greet;
	}

	/** 
	 * Set the Greet.
	 * @param Greet The Greet to set
	 */
	public void setGreet(String greet) {
		this.greet = greet;
	}

	/** 
	 * Returns the Address.
	 * @return String
	 */
	public String getAddress() {
		return address;
	}

	/** 
	 * Set the Address.
	 * @param Address The Address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/** 
	 * Returns the Tel.
	 * @return Integer
	 */
	//bold this line
	public int getTel() {
		return tel;
	}

	/** 
	 * Set the Tel.
	 * @param Tel The Tel to set
	 */
	//bold this line
	public void setTel(int tel) {
		this.tel = tel;
	}

	/** 
	 * Returns the Name.
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/** 
	 * Set the Name.
	 * @param Name The Name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
