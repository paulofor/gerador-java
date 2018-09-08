package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class MySqlDao
{
  protected static String nl;
  public static synchronized MySqlDao create(String lineSeparator)
  {
    nl = lineSeparator;
    MySqlDao result = new MySqlDao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.sql.ResultSet;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".*;" + NL + "import ";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = ";" + NL + "import ";
  protected final String TEXT_6 = ".DaoFidelizacao;" + NL + "import ";
  protected final String TEXT_7 = ".BuilderI;" + NL + "import ";
  protected final String TEXT_8 = ".ObjetoI;" + NL + "import ";
  protected final String TEXT_9 = ".";
  protected final String TEXT_10 = ";" + NL + "import ";
  protected final String TEXT_11 = ".MetodoNaoImplementadoException;" + NL + "" + NL + "public class ";
  protected final String TEXT_12 = " extends DaoFidelizacao implements ";
  protected final String TEXT_13 = "{" + NL + "" + NL + "" + NL + "\tprotected ObjetoI criaObjeto(ResultSet rs) {" + NL + "\t\tthrow new MetodoNaoImplementadoException(\"";
  protected final String TEXT_14 = "\",\"criaObjeto(ResultSet rs)\");" + NL + "\t}" + NL + "\tprotected BuilderI criaBuilder(ResultSet rs) {" + NL + "\t\treturn new ";
  protected final String TEXT_15 = "();" + NL + "\t}" + NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;  
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteMySqlDao() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteModeloI() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getPacoteDaoI() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeDaoI() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getPacoteDaoI() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getPacoteReferencias() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getPacoteReferencias() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getPacoteBuilderDaoImpl() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeBuilderDaoImpl() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getPacoteUtil() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeMySqlDao() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeDaoI() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeMySqlDao() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeBuilderDaoImpl() );
    stringBuffer.append(TEXT_15);
    return stringBuffer.toString();
  }
}
