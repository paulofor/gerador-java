package jet.cpp.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cpp.*;
import gerapp.modelo.*;

public class DaoBaseH
{
  protected static String nl;
  public static synchronized DaoBaseH create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoBaseH result = new DaoBaseH();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#pragma once" + NL + "#include \"..\\digicom\\DaoBase.h\"" + NL + "#include \"estruturaobjeto.h\"" + NL + "#include \"..\\digicom\\DaoConexao.h\"" + NL + "" + NL + "#include \"DaoAplicacao.h\"" + NL + "#include \"..\\digicom\\DataFonte.h\"" + NL + "" + NL + "class C";
  protected final String TEXT_2 = "DaoBase : public CDaoAplicacao" + NL + "{" + NL + "public:" + NL + "\tC";
  protected final String TEXT_3 = "DaoBase(CDataFonte* dataSource);" + NL + "\tC";
  protected final String TEXT_4 = "DaoBase(void);" + NL + "\t~C";
  protected final String TEXT_5 = "DaoBase(void);" + NL + "\tCDaoConexao* criaConexao();" + NL + "\t" + NL + "\tvoid setConexao(CDaoConexao* conexao);" + NL + "\tvoid liberaConexao(CDaoConexao* conexao);" + NL + "};";
  protected final String TEXT_6 = NL;

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
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
