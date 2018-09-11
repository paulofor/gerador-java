package jet.java.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class DBB
{
  protected static String nl;
  public static synchronized DBB create(String lineSeparator)
  {
    nl = lineSeparator;
    DBB result = new DBB();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao;" + NL + "" + NL + "import  ";
  protected final String TEXT_3 = ".dao.*;" + NL + "" + NL + "// versao templates" + NL + "" + NL + "public  class DBB   {" + NL + "" + NL + "" + NL + "\tprivate static DBB _instancia =  null;" + NL + "\tpublic static DBB getInstancia() {" + NL + "\t\tif (_instancia==null) _instancia = new DBB();" + NL + "\t\treturn _instancia;" + NL + "\t}" + NL + "\tpublic DBB() {" + NL + "\t";
  protected final String TEXT_4 = NL + "\t\t_";
  protected final String TEXT_5 = "Dao = null;" + NL + "\t";
  protected final String TEXT_6 = NL + "\t}" + NL;
  protected final String TEXT_7 = NL + NL + "\tprivate  ";
  protected final String TEXT_8 = "Dao _";
  protected final String TEXT_9 = "Dao;" + NL + "\tpublic  ";
  protected final String TEXT_10 = "Dao get";
  protected final String TEXT_11 = "Dao() {" + NL + "\t\tif (_";
  protected final String TEXT_12 = "Dao==null) _";
  protected final String TEXT_13 = "Dao = new ";
  protected final String TEXT_14 = "DaoExtendida();" + NL + "\t\treturn _";
  protected final String TEXT_15 = "Dao;" + NL + "\t}";
  protected final String TEXT_16 = NL + NL + "}";

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
    
	Iterator<ClasseWrapper> iterador1 = classes.iterator();
	while (iterador1.hasNext()) {
		ClasseWrapper corrente = iterador1.next();
	
    stringBuffer.append(TEXT_4);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    
	}
	
    stringBuffer.append(TEXT_6);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();

    stringBuffer.append(TEXT_7);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    
}

    stringBuffer.append(TEXT_16);
    return stringBuffer.toString();
  }
}
