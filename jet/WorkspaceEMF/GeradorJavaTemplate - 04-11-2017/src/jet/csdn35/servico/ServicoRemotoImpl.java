package jet.csdn35.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class ServicoRemotoImpl
{
  protected static String nl;
  public static synchronized ServicoRemotoImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoRemotoImpl result = new ServicoRemotoImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "using System.Collections;" + NL + "using System.Collections.Generic;" + NL + "using ";
  protected final String TEXT_2 = ".modelo;" + NL + "" + NL + "using ";
  protected final String TEXT_3 = ".servico.remoto.basico;" + NL + "" + NL + "namespace ";
  protected final String TEXT_4 = ".servico.remoto {" + NL + "" + NL + "\tpublic class ";
  protected final String TEXT_5 = "ServicoRemotoImpl : ";
  protected final String TEXT_6 = "ServicoRemotoBase {";
  protected final String TEXT_7 = NL + "\t\tpublic override ";
  protected final String TEXT_8 = " ";
  protected final String TEXT_9 = "() {" + NL + "\t\t\tthrow new Exception(\"Metodo nao implementado\");" + NL + "\t\t}";
  protected final String TEXT_10 = NL + "\t" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    
	Iterator<RegraColecao> iteradorRegra = classe.getListaRegraColecao().iterator();
	while (iteradorRegra.hasNext()) {
	RegraColecao regra = iteradorRegra.next();
	if (regra.getAtivoCs()) {
		String tipoRetorno = null;
		if (regra.getRetornaColecao()) tipoRetorno = "List<" + classe.getNomeParaClasse() + ">";
		else tipoRetorno = classe.getNomeParaClasse();
	

    stringBuffer.append(TEXT_7);
    stringBuffer.append( tipoRetorno );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_9);
    
	}
	}

    stringBuffer.append(TEXT_10);
    return stringBuffer.toString();
  }
}
