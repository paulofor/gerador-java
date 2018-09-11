package jet.cpp.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cpp.*;
import gerapp.modelo.*;

public class ServicoBaseCpp
{
  protected static String nl;
  public static synchronized ServicoBaseCpp create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoBaseCpp result = new ServicoBaseCpp();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#include \"StdAfx.h\"" + NL + "#include \"";
  protected final String TEXT_2 = "ServicoBase.h\"" + NL + "" + NL + "C";
  protected final String TEXT_3 = "ServicoBase::C";
  protected final String TEXT_4 = "ServicoBase(void)" + NL + "{" + NL + "}" + NL + "" + NL + "C";
  protected final String TEXT_5 = "ServicoBase::~C";
  protected final String TEXT_6 = "ServicoBase(void)" + NL + "{" + NL + "}" + NL + "C";
  protected final String TEXT_7 = "Dao* C";
  protected final String TEXT_8 = "ServicoBase::getDao() " + NL + "{" + NL + "\treturn new C";
  protected final String TEXT_9 = "Dao();" + NL + "}" + NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = "*  C";
  protected final String TEXT_12 = "ServicoBase::";
  protected final String TEXT_13 = "()" + NL + "{" + NL + "  C";
  protected final String TEXT_14 = "Dao* dao = getDao();" + NL + "  CDaoConexao* conexao = dao->criaConexao();" + NL + "  dao->setConexao(conexao);";
  protected final String TEXT_15 = NL + "  ";
  protected final String TEXT_16 = "* saida = ";
  protected final String TEXT_17 = "(conexao);" + NL + "  dao->liberaConexao(conexao);" + NL + "  return saida;" + NL + "}";
  protected final String TEXT_18 = NL;
  protected final String TEXT_19 = "*  C";
  protected final String TEXT_20 = "ServicoBase::";
  protected final String TEXT_21 = "(CDaoConexao* conexao)" + NL + "{" + NL + "\treturn ";
  protected final String TEXT_22 = "Impl(conexao);" + NL + "}" + NL;
  protected final String TEXT_23 = NL;
  protected final String TEXT_24 = "*  C";
  protected final String TEXT_25 = "ServicoBase::";
  protected final String TEXT_26 = "Impl(CDaoConexao* conexao)" + NL + "{" + NL + "\treturn nullptr;" + NL + "}" + NL;

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
    
	Iterator<RegraColecao> iteradorRegra2 = classe.getListaRegraColecao().iterator();
	for (RegraColecao regra : classe.getListaRegraColecao()) {
		if (regra.getAtivoCpp()) {

    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeEstrutura() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeEstrutura() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeEstrutura() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeEstrutura() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_26);
    
		} // if
	} // for

    return stringBuffer.toString();
  }
}
