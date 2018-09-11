package jet.cpp.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cpp.*;
import gerapp.modelo.*;

public class ServicoH
{
  protected static String nl;
  public static synchronized ServicoH create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoH result = new ServicoH();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#pragma once" + NL + "#include \"";
  protected final String TEXT_2 = "ServicoBase.h\"" + NL + "#include \"";
  protected final String TEXT_3 = "Dao.h\"" + NL + "#include \"estruturaobjeto.h\"" + NL + "" + NL + "class C";
  protected final String TEXT_4 = "Servico : public C";
  protected final String TEXT_5 = "ServicoBase" + NL + "{" + NL + "public:" + NL + "\tC";
  protected final String TEXT_6 = "Servico(void);" + NL + "\t~C";
  protected final String TEXT_7 = "Servico(void);" + NL + NL + NL;
  protected final String TEXT_8 = NL + "public: " + NL + "\t";
  protected final String TEXT_9 = "*  ";
  protected final String TEXT_10 = "Impl(void);";
  protected final String TEXT_11 = NL + "};";
  protected final String TEXT_12 = NL;

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
    
	Iterator<RegraColecao> iteradorRegra2 = classe.getListaRegraColecao().iterator();
	for (RegraColecao regra : classe.getListaRegraColecao()) {
		if (regra.getAtivoCpp()) {

    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeEstrutura() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_10);
    
		} // if
	} // for

    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}
