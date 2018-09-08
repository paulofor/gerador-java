package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class Action
{
  protected static String nl;
  public static synchronized Action create(String lineSeparator)
  {
    nl = lineSeparator;
    Action result = new Action();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.util.List;" + NL + "import ";
  protected final String TEXT_3 = ".*;" + NL + "" + NL + "public interface ";
  protected final String TEXT_4 = " ";
  protected final String TEXT_5 = " extends ";
  protected final String TEXT_6 = " ";
  protected final String TEXT_7 = "{" + NL;
  protected final String TEXT_8 = NL + "    public ";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = "();" + NL + "    public void ";
  protected final String TEXT_11 = "(";
  protected final String TEXT_12 = " item);";
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = NL + "    public List ";
  protected final String TEXT_15 = "();" + NL + "    public void ";
  protected final String TEXT_16 = "(List item);" + NL + "    ";
  protected final String TEXT_17 = NL + "} ";
  protected final String TEXT_18 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    

    EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
ReferenceWrapper referencia = null;


    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteAssembledI() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteModeloI() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeAssembledI() );
    stringBuffer.append(TEXT_4);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getSuperTipo().getNomeAssembledI() );
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
    
Iterator iterador = classe.getReferenceWrappersUnico().iterator();
while (iterador.hasNext()) {
	referencia = (ReferenceWrapper) iterador.next();

    stringBuffer.append(TEXT_8);
    stringBuffer.append( referencia.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( referencia.getGetter() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( referencia.getSetter() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( referencia.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_12);
    }
    stringBuffer.append(TEXT_13);
    
iterador = classe.getReferenceWrappersMultiplo().iterator();
while (iterador.hasNext()) {
	referencia = (ReferenceWrapper) iterador.next();

    stringBuffer.append(TEXT_14);
    stringBuffer.append( referencia.getGetterMultiplo() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( referencia.getSetterMultiplo() );
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    stringBuffer.append(TEXT_18);
    return stringBuffer.toString();
  }
}
