package jet.java.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
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
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".modelo.agregado.*;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.derivadas.*;" + NL + "import br.com.digicom.lib.DCIObjetoDominio;" + NL + "" + NL + "// Gera??o autom?tica n?o alterar" + NL + "public interface ";
  protected final String TEXT_5 = " extends DCIObjetoDominio , ";
  protected final String TEXT_6 = "AgregadoI , ";
  protected final String TEXT_7 = "DerivadaI" + NL + "{" + NL + "" + NL + "\t";
  protected final String TEXT_8 = NL + "\tpublic ";
  protected final String TEXT_9 = " get";
  protected final String TEXT_10 = "();" + NL + "\tpublic void set";
  protected final String TEXT_11 = "(";
  protected final String TEXT_12 = " valor);" + NL + "\t";
  protected final String TEXT_13 = NL + "\tpublic String get";
  protected final String TEXT_14 = "Formatada();" + NL + "\t";
  protected final String TEXT_15 = NL + "\t";
  protected final String TEXT_16 = NL + "}" + NL;
  protected final String TEXT_17 = NL;

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
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_12);
     if (atributo.ehMoeda()) { 
    stringBuffer.append(TEXT_13);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_14);
     } 
    stringBuffer.append(TEXT_15);
     
	}

    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    return stringBuffer.toString();
  }
}
