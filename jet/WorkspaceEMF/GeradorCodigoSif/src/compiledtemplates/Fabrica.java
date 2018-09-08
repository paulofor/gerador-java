package compiledtemplates;

import java.util.*;
import br.com.probid.gerador.execucao.wrappers.*;

public class Fabrica
{
  protected static String nl;
  public static synchronized Fabrica create(String lineSeparator)
  {
    nl = lineSeparator;
    Fabrica result = new Fabrica();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package br.org.fplf.business;" + NL + "" + NL + "" + NL + "public class ServiceLocator {" + NL + "\t";
  protected final String TEXT_2 = NL + "\t\t" + NL + "\tpublic static bus";
  protected final String TEXT_3 = " getBus";
  protected final String TEXT_4 = "() {" + NL + "\t\treturn new bus";
  protected final String TEXT_5 = "();" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_6 = NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
RecursosClasse recursos = (RecursosClasse) argument;  
List listaClasse = recursos.getListaClasseW();
ConfiguracaoWrapper conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    
	Iterator iterador = listaClasse.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper classe = (ClasseWrapper) iterador.next(); 
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_5);
    }
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
