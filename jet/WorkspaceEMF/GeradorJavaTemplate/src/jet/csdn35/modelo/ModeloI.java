package jet.csdn35.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class ModeloI
{
  protected static String nl;
  public static synchronized ModeloI create(String lineSeparator)
  {
    nl = lineSeparator;
    ModeloI result = new ModeloI();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "using br.com.digicom.lib;" + NL + "using ";
  protected final String TEXT_2 = ".modelo.agregados;" + NL + "using ";
  protected final String TEXT_3 = ".modelo.derivadas;" + NL + "using System.Collections;" + NL + "" + NL + "namespace ";
  protected final String TEXT_4 = ".modelo" + NL + "{" + NL + "" + NL + "\tpublic interface ";
  protected final String TEXT_5 = " : DCIObjetoDominio, ";
  protected final String TEXT_6 = "AgregadoI , ";
  protected final String TEXT_7 = "DerivadaI" + NL + "\t{" + NL + "\t" + NL + "\t\tstring JSon\t{" + NL + "\t\t\tget;" + NL + "\t\t\tset;" + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_8 = NL + "\t\t";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = " " + NL + "    \t{" + NL + "        \tget;" + NL + "        \tset;" + NL + "    \t}" + NL + "\t\t";
  protected final String TEXT_11 = NL + "\t" + NL + "\t\t// No futuro (09/01/2013) podemos passar para uma outra interface -> WS" + NL + "\t\tstring toWS();" + NL + "\t\t" + NL + "\t}" + NL + "}";
  protected final String TEXT_12 = NL;

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    
		Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
		while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();
		
    stringBuffer.append(TEXT_8);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_10);
     
		}
	
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}
