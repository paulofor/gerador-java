package compiledtemplates;

import java.util.*;
import br.com.probid.gerador.execucao.wrappers.*;

public class ServiceLocator
{
  protected static String nl;
  public static synchronized ServiceLocator create(String lineSeparator)
  {
    nl = lineSeparator;
    ServiceLocator result = new ServiceLocator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package ";
  protected final String TEXT_2 = ".business;" + NL + "" + NL + "" + NL + "public class ServiceLocator {" + NL + "\t";
  protected final String TEXT_3 = NL + "\t\t" + NL + "\tpublic static bus";
  protected final String TEXT_4 = " getBus";
  protected final String TEXT_5 = "() {" + NL + "\t\treturn new bus";
  protected final String TEXT_6 = "();" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_7 = NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
RecursosClasse recursos = (RecursosClasse) argument;  
List listaClasse = recursos.getListaClasseW();
ConfiguracaoWrapper conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNomePacoteModel() );
    stringBuffer.append(TEXT_2);
    
	Iterator iterador = listaClasse.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper classe = (ClasseWrapper) iterador.next(); 
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
