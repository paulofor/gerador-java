package jet.cpp.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cpp.*;
import gerapp.modelo.*;

public class ServicoBaseH
{
  protected static String nl;
  public static synchronized ServicoBaseH create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoBaseH result = new ServicoBaseH();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#pragma once" + NL + "#include \"..\\digicom\\ServicoBase.h\"" + NL + "#include \"..\\digicom\\DaoConexao.h\"" + NL + "#include \"";
  protected final String TEXT_2 = "Dao.h\"" + NL + "#include \"estruturaobjeto.h\"" + NL + "" + NL + "class C";
  protected final String TEXT_3 = "ServicoBase : public CServicoBase" + NL + "{" + NL + "public:" + NL + "\tC";
  protected final String TEXT_4 = "ServicoBase(void);" + NL + "\t~C";
  protected final String TEXT_5 = "ServicoBase(void);" + NL + "protected:" + NL + "\tC";
  protected final String TEXT_6 = "Dao* getDao();" + NL + "\t";
  protected final String TEXT_7 = NL + "public: " + NL + "\t";
  protected final String TEXT_8 = "*  ";
  protected final String TEXT_9 = "();" + NL + "\t";
  protected final String TEXT_10 = "*  ";
  protected final String TEXT_11 = "(CDaoConexao* conexao);" + NL + "\tvirtual ";
  protected final String TEXT_12 = "*  ";
  protected final String TEXT_13 = "Impl(CDaoConexao* conexao);";
  protected final String TEXT_14 = NL + "};";
  protected final String TEXT_15 = NL;

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
    
	Iterator<RegraColecao> iteradorRegra2 = classe.getListaRegraColecao().iterator();
	for (RegraColecao regra : classe.getListaRegraColecao()) {
		if (regra.getAtivoCpp()) {

    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeEstrutura() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeEstrutura() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeEstrutura() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_13);
    
		} // if
	} // for

    stringBuffer.append(TEXT_14);
    stringBuffer.append(TEXT_15);
    return stringBuffer.toString();
  }
}
