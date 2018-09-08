package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class AssemblerImpl
{
  protected static String nl;
  public static synchronized AssemblerImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    AssemblerImpl result = new AssemblerImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".";
  protected final String TEXT_4 = ";" + NL + "" + NL + "public class ";
  protected final String TEXT_5 = " extends ";
  protected final String TEXT_6 = "{" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;  
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteAssemblerImpl() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteAssembler() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeAssembler() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeAssemblerImpl() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeAssembler() );
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
