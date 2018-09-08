package jet.java.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class DDB
{
  protected static String nl;
  public static synchronized DDB create(String lineSeparator)
  {
    nl = lineSeparator;
    DDB result = new DDB();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo;" + NL + "" + NL + "import  ";
  protected final String TEXT_3 = ".modelo.vo.*;" + NL + "" + NL + "// versao templates" + NL + "" + NL + "public  class FabricaVo   {";
  protected final String TEXT_4 = NL + "\tpublic static ";
  protected final String TEXT_5 = " cria";
  protected final String TEXT_6 = "()  {" + NL + "          return new ";
  protected final String TEXT_7 = "Vo();" + NL + "\t}";
  protected final String TEXT_8 = NL + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();

    stringBuffer.append(TEXT_4);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    
}

    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
