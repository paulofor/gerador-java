package jet.android2.data;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class OperacaoBaseEntidade
{
  protected static String nl;
  public static synchronized OperacaoBaseEntidade create(String lineSeparator)
  {
    nl = lineSeparator;
    OperacaoBaseEntidade result = new OperacaoBaseEntidade();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".data.contract;" + NL + "" + NL + "import android.net.Uri;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_4 = "OperacaoBase {" + NL + "\t" + NL + "\t";
  protected final String TEXT_5 = NL + " \tpublic final Uri build";
  protected final String TEXT_6 = "(";
  protected final String TEXT_7 = "Filtro filtro) {" + NL + "\t\tString uriStr = ";
  protected final String TEXT_8 = "Contract.getContentUri().toString() + \"/";
  protected final String TEXT_9 = "/param?\" + filtro.getParam();" + NL + "\t\treturn Uri.parse(uriStr);" + NL + "    }";
  protected final String TEXT_10 = NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    
 	for (RegraColecao regra : classe.getListaRegraColecao()) {
 	if (regra.getAtivoFlex()) {

    stringBuffer.append(TEXT_5);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_9);
    
 	}
 	}

    stringBuffer.append(TEXT_10);
    return stringBuffer.toString();
  }
}
