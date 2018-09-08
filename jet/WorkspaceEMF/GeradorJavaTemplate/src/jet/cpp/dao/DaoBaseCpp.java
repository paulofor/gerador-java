package jet.cpp.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cpp.*;
import gerapp.modelo.*;

public class DaoBaseCpp
{
  protected static String nl;
  public static synchronized DaoBaseCpp create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoBaseCpp result = new DaoBaseCpp();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#include \"StdAfx.h\"" + NL + "#include \"";
  protected final String TEXT_2 = "Dao.h\"" + NL + "" + NL + "C";
  protected final String TEXT_3 = "DaoBase::C";
  protected final String TEXT_4 = "DaoBase(void)" + NL + "{" + NL + "}" + NL + "" + NL + "C";
  protected final String TEXT_5 = "DaoBase::~C";
  protected final String TEXT_6 = "DaoBase(void)" + NL + "{" + NL + "}" + NL + "" + NL + "CDaoConexao* C";
  protected final String TEXT_7 = "DaoBase::criaConexao()" + NL + "{" + NL + "\treturn nullptr;" + NL + "}" + NL + "" + NL + "void C";
  protected final String TEXT_8 = "DaoBase::setConexao(CDaoConexao* conn) " + NL + "{" + NL + "}" + NL + "" + NL + "void C";
  protected final String TEXT_9 = "DaoBase::liberaConexao(CDaoConexao* conn) " + NL + "{" + NL + "}";

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}
