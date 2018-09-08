package jet.cpp.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cpp.*;
import gerapp.modelo.*;

public class BaseH
{
  protected static String nl;
  public static synchronized BaseH create(String lineSeparator)
  {
    nl = lineSeparator;
    BaseH result = new BaseH();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#pragma once" + NL + "#include \"..\\digicom\\servicobase.h\"" + NL + "#include \"estruturaobjeto.h\"" + NL + "" + NL + "class C";
  protected final String TEXT_2 = "BaseServico : public CServicoBase" + NL + "{" + NL + "public:" + NL + "\tC";
  protected final String TEXT_3 = "BaseServico(void);" + NL + "\t~C";
  protected final String TEXT_4 = "BaseServico(void);";
  protected final String TEXT_5 = NL + "public: " + NL + "\t";
  protected final String TEXT_6 = "*  ";
  protected final String TEXT_7 = "(void);";
  protected final String TEXT_8 = NL + "};";
  protected final String TEXT_9 = NL;

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
    
	Iterator<RegraColecao> iteradorRegra2 = classe.getListaRegraColecao().iterator();
	for (RegraColecao regra : classe.getListaRegraColecao()) {
		if (regra.getAtivoCpp()) {

    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeEstrutura() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_7);
    
		} // if
	} // for

    stringBuffer.append(TEXT_8);
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}
