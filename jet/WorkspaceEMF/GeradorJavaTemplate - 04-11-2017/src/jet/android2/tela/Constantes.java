package jet.android2.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class Constantes
{
  protected static String nl;
  public static synchronized Constantes create(String lineSeparator)
  {
    nl = lineSeparator;
    Constantes result = new Constantes();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".tela.base.activity;" + NL + "" + NL + "public class Constantes {" + NL + " \t";
  protected final String TEXT_4 = NL + "\tpublic static final String ";
  protected final String TEXT_5 = "_ID = \"";
  protected final String TEXT_6 = "Id\";" + NL + "\tpublic static final String ";
  protected final String TEXT_7 = "_POSICAO = \"";
  protected final String TEXT_8 = "Posicao\";" + NL + "\t";
  protected final String TEXT_9 = NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();
	
    stringBuffer.append(TEXT_4);
    stringBuffer.append( corrente.getNomeParaConstante() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( corrente.getNomeParaConstante() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    
	}
	
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}
