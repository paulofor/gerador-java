
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _menu extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _menu page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);

    }
    catch (Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch (Exception clearException) {
        }
        pageContext.handlePageException(e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext, true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[2][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd'>\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n<html>\r\n<head>\r\n<script type='text/javascript' language='javascript' src='http://cap17d:9080/AppPortal/prmPortalJS01.js'> </script>\r\n<link type='text/css' rel='stylesheet' href='http://cap17d:9080/AppPortal/prmPortal.css'></link>\r\n<meta http-equiv='Content-Type' content='text/html; charset=windows-1252'/>\r\n<title>menu</title>\r\n</head>\r\n<body>\r\n<br>\r\n<div id='processoDiv'>\r\n<IMG alt='processando' id='processo' src='http://cap17d:9080/AppPortal/imagens/processando.gif'>\r\n</div>\r\n<FORM action='consultarotinasct' name='Executor' target='negocio' method='post'>\r\n<input type='hidden' name='val2' value='0'>\r\n<input type='hidden' name='val1' value='2'>\r\n<input type='hidden' name='val5' value='nct'>\r\n<input type='hidden' name='val4' value='nct_cap'>\r\n<input type='hidden' name='prmUsuario' value='luizsilva'>\r\n<input type='hidden' name='prmServico' value='consultarotinas'>\r\n<input type='hidden' name='prmTipo' value='2'>\r\n<input type='hidden' name='prmGrupoBT' value='lista'>\r\n<input type='hidden' name='val9' value='ct'>\r\n<input type='text' name='metodo' value='getPaginaInicial'>\r\n<input type='submit' value='ok'>\r\n</form>\r\n<script type='text/javascript' language='javascript'>\r\nprocessando(0);\r\n</script>\r\n</body>\r\n</html>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
