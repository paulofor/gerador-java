package com.asprise.struts.plugin;

import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import org.apache.struts.action.ActionServlet;

public class MyPlugin implements PlugIn{
	public String proxy;
	public String port;
	
	public MyPlugin(){
	}
	
	public void init(ActionServlet servlet, ModuleConfig config){
		System.err.print("********* MyPlugin Starting *******");
		System.setProperty("https.proxyHost", getProxy());
		System.setProperty("https.proxyPort", getPort());
		servlet.getServletContext().setAttribute("proxy", getProxy());
		servlet.getServletContext().setAttribute("port", getPort());
	}
	public void destroy(){
		System.err.print("********* MyPlugin Stopping *******");
	}
	public void setProxy(String prox){
		proxy = prox;
	}
	public String getProxy(){
		return this.proxy;
	}
	public void setPort(String por){
		port = por;
	}
	public String getPort(){
		return this.port;
	}
}