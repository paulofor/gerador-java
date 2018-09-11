package jet.csdn35;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class ProjetoVS2010
{
  protected static String nl;
  public static synchronized ProjetoVS2010 create(String lineSeparator)
  {
    nl = lineSeparator;
    ProjetoVS2010 result = new ProjetoVS2010();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<ItemGroup>";
  protected final String TEXT_2 = NL + "<Compile Include=\"dao\\basico\\";
  protected final String TEXT_3 = "DaoBase.cs\" />";
  protected final String TEXT_4 = NL + "</ItemGroup>" + NL;
  protected final String TEXT_5 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_3);
    
	}

    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
