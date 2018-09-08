package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class Derivada
{
  protected static String nl;
  public static synchronized Derivada create(String lineSeparator)
  {
    nl = lineSeparator;
    Derivada result = new Derivada();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".";
  protected final String TEXT_4 = ";" + NL + "import ";
  protected final String TEXT_5 = ".";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL + "import ";
  protected final String TEXT_8 = ".";
  protected final String TEXT_9 = ";";
  protected final String TEXT_10 = NL + NL + "public class ";
  protected final String TEXT_11 = " ";
  protected final String TEXT_12 = " extends ";
  protected final String TEXT_13 = " ";
  protected final String TEXT_14 = " implements ";
  protected final String TEXT_15 = " {" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_16 = " principal;" + NL + "\tpublic ";
  protected final String TEXT_17 = "(";
  protected final String TEXT_18 = " principal) {" + NL + "\t\t";
  protected final String TEXT_19 = "super((";
  protected final String TEXT_20 = ")principal);";
  protected final String TEXT_21 = NL + "\t\tthis.principal = principal;" + NL + "\t}" + NL + "} ";
  protected final String TEXT_22 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteDerivada() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteModeloI() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getPacoteDerivadaI() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeDerivadaI() );
    stringBuffer.append(TEXT_6);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getSuperTipo().getPacoteModeloI() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getSuperTipo().getNomeModeloI() );
    stringBuffer.append(TEXT_9);
     } 
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeDerivada() );
    stringBuffer.append(TEXT_11);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getSuperTipo().getNomeDerivada() );
    stringBuffer.append(TEXT_13);
     } 
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeDerivadaI() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeDerivada() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_18);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getSuperTipo().getNomeModeloI() );
    stringBuffer.append(TEXT_20);
     } 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(TEXT_22);
    return stringBuffer.toString();
  }
}
