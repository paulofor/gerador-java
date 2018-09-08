package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class ModeloFacade
{
  protected static String nl;
  public static synchronized ModeloFacade create(String lineSeparator)
  {
    nl = lineSeparator;
    ModeloFacade result = new ModeloFacade();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = " ";
  protected final String TEXT_4 = " extends ";
  protected final String TEXT_5 = " ";
  protected final String TEXT_6 = " implements ";
  protected final String TEXT_7 = " {" + NL + "" + NL + "} ";
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteModeloVo() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeModeloVo() );
    stringBuffer.append(TEXT_3);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getSuperTipo().getNomeModeloVo() );
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
