package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class DerivadaI
{
  protected static String nl;
  public static synchronized DerivadaI create(String lineSeparator)
  {
    nl = lineSeparator;
    DerivadaI result = new DerivadaI();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".DerivadaI;" + NL + "" + NL + "public interface ";
  protected final String TEXT_4 = " extends DerivadaI ";
  protected final String TEXT_5 = " , ";
  protected final String TEXT_6 = " ";
  protected final String TEXT_7 = "{" + NL + "" + NL + "} ";
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteDerivadaI() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteReferencias() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeDerivadaI() );
    stringBuffer.append(TEXT_4);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getSuperTipo().getNomeDerivadaI() );
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
