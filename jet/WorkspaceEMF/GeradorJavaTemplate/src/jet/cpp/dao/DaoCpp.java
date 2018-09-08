package jet.cpp.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cpp.*;
import gerapp.modelo.*;

public class DaoCpp
{
  protected static String nl;
  public static synchronized DaoCpp create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoCpp result = new DaoCpp();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#include \"StdAfx.h\"" + NL + "#include \"";
  protected final String TEXT_2 = "Dao.h\"" + NL + "" + NL + "C";
  protected final String TEXT_3 = "Dao::C";
  protected final String TEXT_4 = "Dao(void)" + NL + "{" + NL + "}" + NL + "" + NL + "C";
  protected final String TEXT_5 = "Dao::~C";
  protected final String TEXT_6 = "Dao(void)" + NL + "{" + NL + "}";
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
