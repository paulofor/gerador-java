package jet.csdn35.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class DerivadaI
{
  protected static String nl;
  public static synchronized DerivadaI create(String lineSeparator)
  {
    nl = lineSeparator;
    DerivadaI result = new DerivadaI();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "namespace ";
  protected final String TEXT_2 = ".modelo.derivadas {" + NL + "" + NL + "using System.Collections.Generic;" + NL + "using ";
  protected final String TEXT_3 = ".modelo;" + NL + "using System.Collections;" + NL + "" + NL + "public interface ";
  protected final String TEXT_4 = "DerivadaI{" + NL + "" + NL + "\t";
  protected final String TEXT_5 = NL + "\t";
  protected final String TEXT_6 = " ";
  protected final String TEXT_7 = " {get;set;} " + NL + "\t";
  protected final String TEXT_8 = NL + "\tstring ";
  protected final String TEXT_9 = "Tela {get;}" + NL + "\t";
  protected final String TEXT_10 = NL + NL + "}" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    
	ProcValorWrapper procValor = new ProcValorWrapperCs();
	Iterator<ProcValor> iterador = classe.getListaProcValor().iterator();
	while (iterador.hasNext()) {
		procValor.setProcValor(iterador.next());
	
    stringBuffer.append(TEXT_5);
    stringBuffer.append( procValor.getTipo() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_7);
     if (procValor.ehPercentual()) { 
    stringBuffer.append(TEXT_8);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_9);
     }
	}
	
    stringBuffer.append(TEXT_10);
    return stringBuffer.toString();
  }
}
