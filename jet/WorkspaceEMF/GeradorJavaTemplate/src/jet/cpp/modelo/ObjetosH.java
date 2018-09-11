package jet.cpp.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cpp.*;
import gerapp.modelo.*;

public class ObjetosH
{
  protected static String nl;
  public static synchronized ObjetosH create(String lineSeparator)
  {
    nl = lineSeparator;
    ObjetosH result = new ObjetosH();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#pragma once";
  protected final String TEXT_2 = NL + "\ttypedef struct _";
  protected final String TEXT_3 = " {" + NL + "\t\t//unsigned long IdAmbienteRegra;" + NL + "\t\t//char DiretrioGeracao[100];" + NL + "\t\tstruct _";
  protected final String TEXT_4 = "* pProximo; " + NL + "\t\tstruct _";
  protected final String TEXT_5 = "* pAnterior; " + NL + "\t} ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapperCpp corrente = (ClasseWrapperCpp) iterador.next();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( corrente.getNomeEstrutura() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( corrente.getNomeEstrutura() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( corrente.getNomeEstrutura() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( corrente.getNomeEstrutura() );
    stringBuffer.append(TEXT_6);
    
}

    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
