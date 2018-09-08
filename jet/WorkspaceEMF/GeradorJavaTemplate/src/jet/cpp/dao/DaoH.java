package jet.cpp.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cpp.*;
import gerapp.modelo.*;

public class DaoH
{
  protected static String nl;
  public static synchronized DaoH create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoH result = new DaoH();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#pragma once" + NL + "#include \"";
  protected final String TEXT_2 = "DaoBase.h\"" + NL + "#include \"estruturaobjeto.h\"" + NL + "" + NL + "class C";
  protected final String TEXT_3 = "Dao : public C";
  protected final String TEXT_4 = "DaoBase" + NL + "{" + NL + "public:" + NL + "\tC";
  protected final String TEXT_5 = "Dao(void);" + NL + "\t~C";
  protected final String TEXT_6 = "Dao(void);" + NL + "" + NL + "};";
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapperCpp classe = (ClasseWrapperCpp) recursos.getClasse();
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
