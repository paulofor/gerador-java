package jet.android.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class FabricaDao
{
  protected static String nl;
  public static synchronized FabricaDao create(String lineSeparator)
  {
    nl = lineSeparator;
    FabricaDao result = new FabricaDao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao;" + NL + "" + NL + "import android.content.Context;" + NL + "" + NL + "public class FabricaDao {" + NL + "" + NL + "\tstatic FabricaDao fabrica = new FabricaDao();" + NL + "\t" + NL + "\tpublic static FabricaDao getInstancia() {" + NL + "\t\treturn fabrica;" + NL + "\t}" + NL;
  protected final String TEXT_3 = NL + NL + "\tprivate ";
  protected final String TEXT_4 = "DBHelper ";
  protected final String TEXT_5 = "DBHelper = null;" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_6 = "DBHelper get";
  protected final String TEXT_7 = "DBHelper() {" + NL + "\t\tif (";
  protected final String TEXT_8 = "DBHelper==null) {" + NL + "\t\t\t";
  protected final String TEXT_9 = "DBHelper = new ";
  protected final String TEXT_10 = "DBHelper();" + NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_11 = "DBHelper;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_12 = NL + "}" + NL;
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
