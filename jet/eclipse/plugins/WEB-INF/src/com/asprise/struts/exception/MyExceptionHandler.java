package com.asprise.struts.exception;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.struts.action.*;
import org.apache.struts.config.*;

public class MyExceptionHandler extends ExceptionHandler {

  public ActionForward execute(
					   Exception ex,
					   ExceptionConfig ae,
					   ActionMapping mapping,
					   ActionForm formInstance,
					   HttpServletRequest request,
					   HttpServletResponse response)
		 throws ServletException {
	request.setAttribute("myException",ex);
	request.setAttribute("myForm",formInstance);
	request.setAttribute("myKey",ae.getKey());
	return new ActionForward(ae.getPath());
  }
}
