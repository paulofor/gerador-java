package jet.cpp.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cpp.*;
import gerapp.modelo.*;

public class ServicoCpp
{
  protected static String nl;
  public static synchronized ServicoCpp create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoCpp result = new ServicoCpp();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#include \"StdAfx.h\"" + NL + "#include \"";
  protected final String TEXT_2 = "Servico.h\"" + NL + "" + NL + "C";
  protected final String TEXT_3 = "Servico::C";
  protected final String TEXT_4 = "Servico(void)" + NL + "{" + NL + "}" + NL + "" + NL + "C";
  protected final String TEXT_5 = "Servico::~C";
  protected final String TEXT_6 = "Servico(void)" + NL + "{" + NL + "}" + NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = "*  C";
  protected final String TEXT_9 = "Servico::";
  protected final String TEXT_10 = "Impl(void)" + NL + "{" + NL + "\treturn nullptr;" + NL + "}";

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_10);
    
		} // if
	} // for

    return stringBuffer.toString();
  }
}
