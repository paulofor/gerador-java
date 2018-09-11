package jet.cs.vo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class MobileDecorator
{
  protected static String nl;
  public static synchronized MobileDecorator create(String lineSeparator)
  {
    nl = lineSeparator;
    MobileDecorator result = new MobileDecorator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "" + NL + "using ";
  protected final String TEXT_2 = ".modelo;" + NL + "" + NL + "namespace ";
  protected final String TEXT_3 = ".modelo.mobile" + NL + "{" + NL + "\t/// <summary>" + NL + "\t/// Summary description for TipoFornecedorDecorator." + NL + "\t/// </summary>" + NL + "\tpublic class ";
  protected final String TEXT_4 = "Decorator: MobileDecoratorI" + NL + "\t{" + NL + "\t\tprivate ";
  protected final String TEXT_5 = " principal;" + NL + "\t\tpublic ";
  protected final String TEXT_6 = "Decorator(";
  protected final String TEXT_7 = " dado)" + NL + "\t\t{" + NL + "\t\t\tprincipal = dado;" + NL + "\t\t}" + NL + "\t\tpublic string Json " + NL + "\t\t{" + NL + "\t\t\tget " + NL + "\t\t\t{" + NL + "\t\t\t\treturn \"{\" +";
  protected final String TEXT_8 = NL + "\t\t\t\t\" ";
  protected final String TEXT_9 = "\\\"";
  protected final String TEXT_10 = "\\\":\\\"\" + principal.";
  protected final String TEXT_11 = " + \"\\\"\" +";
  protected final String TEXT_12 = NL + "\t\t\t\t\" ,\\\"";
  protected final String TEXT_13 = "\\\":\\\"\" + principal.";
  protected final String TEXT_14 = " + \"\\\"\" +" + NL + "\t";
  protected final String TEXT_15 = "\t\t\t\"}\";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t" + NL + "\t}" + NL + "}";

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    
	AtributoWrapper atributoW = new AtributoWrapperCs();
	Iterator<AtributoEntidade> iterador = classe.getListaAtributoEntidade().iterator();
	String virgula = "";
	while (iterador.hasNext()) {
		atributoW.setBase(iterador.next());

    stringBuffer.append(TEXT_8);
    stringBuffer.append( virgula );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( atributoW.getNomePropriedade() );
    stringBuffer.append(TEXT_11);
    
		if (virgula.equals("")) virgula = ",";
	}
	Iterator<RelacionamentoWrapper> iteradorRel = classe.obtemListaComChaveEstrangeira().iterator();
	while (iteradorRel.hasNext()) {
		RelacionamentoWrapper relCorrente = iteradorRel.next();
	
    stringBuffer.append(TEXT_12);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( relCorrente.getNomePropriedade() );
    stringBuffer.append(TEXT_14);
    
	}
	
    stringBuffer.append(TEXT_15);
    return stringBuffer.toString();
  }
}
