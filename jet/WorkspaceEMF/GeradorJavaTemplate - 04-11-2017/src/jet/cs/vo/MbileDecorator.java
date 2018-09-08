package jet.cs.vo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class MbileDecorator
{
  protected static String nl;
  public static synchronized MbileDecorator create(String lineSeparator)
  {
    nl = lineSeparator;
    MbileDecorator result = new MbileDecorator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "" + NL + "using ctrlestoque.modelo;" + NL + "" + NL + "namespace ctrlestoque.modelo.mobile" + NL + "{" + NL + "\t/// <summary>" + NL + "\t/// Summary description for TipoFornecedorDecorator." + NL + "\t/// </summary>" + NL + "\tpublic class ";
  protected final String TEXT_2 = "Decorator: MobileDecoratorI" + NL + "\t{" + NL + "\t\tprivate ";
  protected final String TEXT_3 = " principal;" + NL + "\t\tpublic ";
  protected final String TEXT_4 = "Decorator(";
  protected final String TEXT_5 = " dado)" + NL + "\t\t{" + NL + "\t\t\tprincipal = dado;" + NL + "\t\t}" + NL + "\t\tpublic string Json " + NL + "\t\t{" + NL + "\t\t\tget " + NL + "\t\t\t{" + NL + "\t\t\t\treturn \"{\" +" + NL + "\t\t\t\t    \" \\\"id_tipo_fornecedor\\\":\\\"\" + principal.IdTipoFornecedor + \"\\\"\" +" + NL + "\t\t\t\t\t\" ,\\\"nome\\\":\\\"\" + principal.Nome + \"\\\"\" +" + NL + "\t\t\t\t\t\"}\";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
