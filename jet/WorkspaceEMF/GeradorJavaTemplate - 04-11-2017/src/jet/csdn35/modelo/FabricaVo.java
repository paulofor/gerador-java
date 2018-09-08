package jet.csdn35.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class FabricaVo
{
  protected static String nl;
  public static synchronized FabricaVo create(String lineSeparator)
  {
    nl = lineSeparator;
    FabricaVo result = new FabricaVo();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "namespace ";
  protected final String TEXT_2 = ".modelo {" + NL + "" + NL + "" + NL + "using ";
  protected final String TEXT_3 = ".modelo.vo;" + NL + "using ";
  protected final String TEXT_4 = ".modelo.mobilevo;" + NL + "" + NL + "public  class FabricaVo  {";
  protected final String TEXT_5 = NL + "\tpublic static ";
  protected final String TEXT_6 = " cria";
  protected final String TEXT_7 = "()  {" + NL + "          return new ";
  protected final String TEXT_8 = "MobileVo();" + NL + "\t}";
  protected final String TEXT_9 = NL + "}" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();

    stringBuffer.append(TEXT_5);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    
	}

    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}
