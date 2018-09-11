package jet.csdn35.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ServicoLocalImpl
{
  protected static String nl;
  public static synchronized ServicoLocalImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoLocalImpl result = new ServicoLocalImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "using System.Collections;" + NL + "using System.Collections.Generic;" + NL + "using br.com.digicom.lib.dao;" + NL + "using ";
  protected final String TEXT_2 = ".modelo;" + NL + "using ";
  protected final String TEXT_3 = ".dao;" + NL + "using ";
  protected final String TEXT_4 = ".servico.local.basico;" + NL + "using ";
  protected final String TEXT_5 = ".servico.filtro;" + NL + "" + NL + "namespace ";
  protected final String TEXT_6 = ".servico.local {" + NL + "" + NL + "\tpublic class ";
  protected final String TEXT_7 = "ServicoLocalImpl : ";
  protected final String TEXT_8 = "ServicoLocalBase {";
  protected final String TEXT_9 = NL + "\t\tpublic override ";
  protected final String TEXT_10 = " ";
  protected final String TEXT_11 = "(DaoConexao conexao) {" + NL + "\t\t\tthrow new Exception(\"Metodo nao implementado\");" + NL + "\t\t}";
  protected final String TEXT_12 = "\t" + NL + "\t" + NL + "\t}" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    
	Iterator<RegraColecao> iteradorRegra = classe.getListaRegraColecao().iterator();
	while (iteradorRegra.hasNext()) {
	RegraColecao regra = iteradorRegra.next();
	if (regra.getAtivoCs()) {
		String tipoRetorno = null;
		if (regra.getRetornaColecao()) tipoRetorno = "List<" + classe.getNomeParaClasse() + ">";
		else tipoRetorno = classe.getNomeParaClasse();
	

    stringBuffer.append(TEXT_9);
    stringBuffer.append( tipoRetorno );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_11);
    
	}
	}

    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}
