package jet.cs.web;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class PageAspx
{
  protected static String nl;
  public static synchronized PageAspx create(String lineSeparator)
  {
    nl = lineSeparator;
    PageAspx result = new PageAspx();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = " Page language=\"c#\" Codebehind=\"";
  protected final String TEXT_3 = "Page.aspx.cs\" AutoEventWireup=\"false\" Inherits=\"";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = "\" ";
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = " saida ";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( "" + (char) 60 );
    stringBuffer.append( "" + (char) 37 );
    stringBuffer.append( "" + (char) 64 );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNomePacoteAspxClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( "" + (char) 37 );
    stringBuffer.append( "" + (char) 62 );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( "" + (char) 60 );
    stringBuffer.append( "" + (char) 37 );
    stringBuffer.append( "" + (char) 61 );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( "" + (char) 37 );
    stringBuffer.append( "" + (char) 62 );
    return stringBuffer.toString();
  }
}
