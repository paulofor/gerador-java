package jet.android2.framework.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DaoException
{
  protected static String nl;
  public static synchronized DaoException create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoException result = new DaoException();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".framework.dao;" + NL + "" + NL + "public class DaoException extends Exception {" + NL + "\tprivate Exception _original;" + NL + "\tprivate String _mensagemAdicional;" + NL + "" + NL + "\tpublic DaoException(Exception original) {" + NL + "\t\tthis._original = original;" + NL + "\t\tthis._mensagemAdicional = null;" + NL + "\t}" + NL + "" + NL + "\tpublic DaoException(Exception original, String mensagem) {" + NL + "\t\tthis._mensagemAdicional = mensagem;" + NL + "\t\tthis._original = original;" + NL + "\t}" + NL + "" + NL + "\tpublic String getMessage() {" + NL + "\t\treturn (this._mensagemAdicional == null ? \"\" : this._mensagemAdicional)" + NL + "\t\t\t\t+ this._original.getMessage();" + NL + "\t}" + NL + "" + NL + "\tpublic Exception getOriginal() {" + NL + "\t\treturn this._original;" + NL + "\t}" + NL + "" + NL + "\tpublic void printStackTrace() {" + NL + "\t\tthis._original.printStackTrace();" + NL + "\t}" + NL + "}";
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
