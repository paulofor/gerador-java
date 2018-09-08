package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class BuilderDaoImpl
{
  protected static String nl;
  public static synchronized BuilderDaoImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    BuilderDaoImpl result = new BuilderDaoImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.sql.ResultSet;" + NL + "import java.sql.SQLException;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".ObjetoI;" + NL + "import ";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = ";" + NL + "import ";
  protected final String TEXT_6 = ".";
  protected final String TEXT_7 = ";  " + NL + "" + NL + "public class ";
  protected final String TEXT_8 = " extends ";
  protected final String TEXT_9 = "  {" + NL + "" + NL + "}";
  protected final String TEXT_10 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;  
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;
OperationWrapper operacao = new OperationWrapper();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteBuilderDaoImpl() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteReferencias() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getPacoteModeloI() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getPacoteBuilderDao() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeBuilderDao() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeBuilderDaoImpl() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeBuilderDao() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    return stringBuffer.toString();
  }
}
