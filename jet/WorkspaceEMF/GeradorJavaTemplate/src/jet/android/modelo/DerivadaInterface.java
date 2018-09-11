package jet.android.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DerivadaInterface
{
  protected static String nl;
  public static synchronized DerivadaInterface create(String lineSeparator)
  {
    nl = lineSeparator;
    DerivadaInterface result = new DerivadaInterface();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo.derivada;" + NL + "" + NL + "import java.sql.Timestamp;" + NL + "import java.util.List;" + NL + "import br.com.digicom.modelo.*;" + NL + "" + NL + "public interface ";
  protected final String TEXT_3 = "DerivadaI { " + NL + " \t" + NL + " \t";
  protected final String TEXT_4 = NL + "\tpublic void set";
  protected final String TEXT_5 = "(";
  protected final String TEXT_6 = " valor);" + NL + "\tpublic ";
  protected final String TEXT_7 = " get";
  protected final String TEXT_8 = "();" + NL + "\t";
  protected final String TEXT_9 = NL + "\tpublic String get";
  protected final String TEXT_10 = "Tela();" + NL + "\t";
  protected final String TEXT_11 = "  " + NL + "\tpublic String getTituloTela();\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_3);
    
	ProcValorWrapper procValor = new ProcValorWrapperAndroid();
	Iterator<ProcValor> iterador = classe.getListaProcValor().iterator();
	while (iterador.hasNext()) {
		procValor.setProcValor(iterador.next());
	
    stringBuffer.append(TEXT_4);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( procValor.getTipo() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( procValor.getTipo() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_8);
     if (procValor.ehPercentual() || procValor.ehDecimal()) { 
    stringBuffer.append(TEXT_9);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_10);
     }
	}
	
    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}
