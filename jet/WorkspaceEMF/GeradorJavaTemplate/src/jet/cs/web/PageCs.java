package jet.cs.web;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class PageCs
{
  protected static String nl;
  public static synchronized PageCs create(String lineSeparator)
  {
    nl = lineSeparator;
    PageCs result = new PageCs();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "using System.Collections;" + NL + "using System.ComponentModel;" + NL + "using System.Data;" + NL + "using System.Drawing;" + NL + "using System.Web;" + NL + "using System.Web.SessionState;" + NL + "using System.Web.UI;" + NL + "using System.Web.UI.WebControls;" + NL + "using System.Web.UI.HtmlControls;" + NL + "using ";
  protected final String TEXT_2 = ".regracolecao;" + NL + "using ";
  protected final String TEXT_3 = ".modelo.mobile;" + NL + "using ";
  protected final String TEXT_4 = ".web;" + NL + "using ";
  protected final String TEXT_5 = ".modelo;" + NL + "using System.Collections.Specialized;" + NL + "" + NL + "namespace ";
  protected final String TEXT_6 = NL + "{" + NL + "\t/// <summary>" + NL + "\t/// Summary description for MobileDados." + NL + "\t/// </summary>" + NL + "\tpublic class ";
  protected final String TEXT_7 = "Page : FormBase" + NL + "\t{" + NL + "" + NL + "\t\t" + NL + "" + NL + "\t\tprivate void montaSaida(ArrayList lista) " + NL + "\t\t{" + NL + "\t\t\tsaida = \"{\\\"";
  protected final String TEXT_8 = "\\\" : [\";" + NL + "\t\t\tfor (int i=0;i<lista.Count;i++) " + NL + "\t\t\t{" + NL + "\t\t\t\tMobileDecoratorI mobile = (MobileDecoratorI)lista[i];" + NL + "\t\t\t\tif (i>0) saida += \" , \";" + NL + "\t\t\t\tsaida += mobile.Json;" + NL + "\t\t\t\t" + NL + "\t\t\t}" + NL + "\t\t\tsaida += \"]}\";" + NL + "\t\t}" + NL + "\t\tprivate void montaSaida(";
  protected final String TEXT_9 = " item) " + NL + "\t\t{" + NL + "\t\t\tMobileDecoratorI mobile = (MobileDecoratorI) item;" + NL + "\t\t\tsaida = \"{\\\"";
  protected final String TEXT_10 = "\\\" : [\";" + NL + "\t\t\tsaida += mobile.Json;" + NL + "\t\t\tsaida += \"]}\";" + NL + "\t\t}" + NL + "\t\t" + NL + "" + NL + "\t\tprotected override void executaSaida(object sender, System.EventArgs e) " + NL + "\t\t{" + NL + "\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_11 = "RegraColecao regraColecao = FabricaRegra.getInstancia().get";
  protected final String TEXT_12 = "RegraColecao();" + NL + "\t\t\tNameValueCollection form = Request.QueryString;" + NL + "\t\t\tString op = form[\"op\"];";
  protected final String TEXT_13 = NL + "\t\t\tregraColecao.getFiltro().";
  protected final String TEXT_14 = "  = getForm";
  protected final String TEXT_15 = "(\"";
  protected final String TEXT_16 = "\");";
  protected final String TEXT_17 = NL + "\t\t\tif (op==\"ListaCorrente\")" + NL + "\t\t\t\tmontaSaida(regraColecao.ListaCorrente());" + NL + "\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_18 = NL + "\t\t\tif (op==\"";
  protected final String TEXT_19 = "\")" + NL + "\t\t\t\tmontaSaida(regraColecao.";
  protected final String TEXT_20 = "());";
  protected final String TEXT_21 = "\t" + NL + "\t\t\t" + NL + "\t\t}" + NL + "" + NL + "\t\t" + NL + "\t}" + NL + "}";
  protected final String TEXT_22 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNomePacoteAspxClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    
			Iterator<FiltroColecao> iterador = classe.getListaFiltroColecao().iterator();
			while (iterador.hasNext()) {
			FiltroColecao filtro = iterador.next();
			if (filtro.getIdEntidadeT()==0) {

    stringBuffer.append(TEXT_13);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( ConverteTipoCs.getTipoFiltro(filtro.getTipoCampoFiltro()) );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_16);
    
			}
			}

    stringBuffer.append(TEXT_17);
    
			Iterator<RegraColecao> iteradorRegra = classe.getListaRegraColecao().iterator();
			while (iteradorRegra.hasNext()) {
			RegraColecao regra = iteradorRegra.next();
			if (regra.getAtivoCs()) {

    stringBuffer.append(TEXT_18);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_20);
    
			}
			}

    stringBuffer.append(TEXT_21);
    stringBuffer.append(TEXT_22);
    return stringBuffer.toString();
  }
}
