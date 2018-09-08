package jet.csdn35.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class ProjetoVS
{
  protected static String nl;
  public static synchronized ProjetoVS create(String lineSeparator)
  {
    nl = lineSeparator;
    ProjetoVS result = new ProjetoVS();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using br.com.digicom.lib.dao;" + NL + "" + NL + "namespace ";
  protected final String TEXT_2 = ".dao.basico" + NL + "{" + NL + "public class FabricaDao {" + NL + "" + NL + "\tstatic FabricaDao fabrica = new FabricaDao();" + NL + "\t" + NL + "\tpublic static FabricaDao getInstancia() {" + NL + "\t\treturn fabrica;" + NL + "\t}" + NL;
  protected final String TEXT_3 = NL + NL + "\tprivate ";
  protected final String TEXT_4 = "Dao ";
  protected final String TEXT_5 = "Dao = null;" + NL + "\t" + NL + "\tprivate ";
  protected final String TEXT_6 = "Dao get";
  protected final String TEXT_7 = "Dao() {" + NL + "\t\tif (";
  protected final String TEXT_8 = "Dao==null) {" + NL + "\t\t\t";
  protected final String TEXT_9 = "Dao = new ";
  protected final String TEXT_10 = "Dao();" + NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_11 = "Dao;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_12 = NL + "}" + NL + "}" + NL;
  protected final String TEXT_13 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();

    stringBuffer.append(TEXT_3);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_11);
    
	}

    stringBuffer.append(TEXT_12);
    stringBuffer.append(TEXT_13);
    return stringBuffer.toString();
  }
}
