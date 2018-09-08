package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class DaoI
{
  protected static String nl;
  public static synchronized DaoI create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoI result = new DaoI();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "public interface ";
  protected final String TEXT_3 = " {" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;  
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteDaoI() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeDaoI() );
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
