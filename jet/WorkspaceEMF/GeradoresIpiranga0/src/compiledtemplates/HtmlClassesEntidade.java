package compiledtemplates;

import java.util.*;
import util.*;
import util.wrappers.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class HtmlClassesEntidade
{
  protected static String nl;
  public static synchronized HtmlClassesEntidade create(String lineSeparator)
  {
    nl = lineSeparator;
    HtmlClassesEntidade result = new HtmlClassesEntidade();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<html>" + NL + "<table>";
  protected final String TEXT_2 = NL + "\t\t<tr>" + NL + "\t\t<td><b>";
  protected final String TEXT_3 = "</b>";
  protected final String TEXT_4 = " : ";
  protected final String TEXT_5 = " ";
  protected final String TEXT_6 = "</td>" + NL + "\t\t\t";
  protected final String TEXT_7 = NL + "\t\t\t\t<tr>" + NL + "\t\t\t\t<td>" + NL + "\t\t    \t<i>";
  protected final String TEXT_8 = "</i> ";
  protected final String TEXT_9 = "  [";
  protected final String TEXT_10 = "]" + NL + "\t\t    \t</td>" + NL + "\t\t    \t</tr>" + NL + "\t\t    ";
  protected final String TEXT_11 = "\t" + NL + "  \t\t</tr>";
  protected final String TEXT_12 = NL + "</table>" + NL + "</html>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EPackage pacote = (EPackage) argument; 
ClassWrapper classe = new ClassWrapper();
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;
EClass eClass = null;
Iterator<EClassifier> iterador = pacote.getEClassifiers().iterator();

    stringBuffer.append(TEXT_1);
    
	while (iterador.hasNext()) {
		eClass = (EClass) iterador.next();
		classe.setClasse(eClass); 
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeSimples() );
    stringBuffer.append(TEXT_3);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getSuperTipo().getNomeSimples() );
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
     for (EAttribute item : eClass.getEAttributes()) {
				atributo.setAtributo(item); 
    stringBuffer.append(TEXT_7);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( item.getName() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( item.getEAttributeType().getName() );
    stringBuffer.append(TEXT_10);
     } 
    stringBuffer.append(TEXT_11);
    	} 
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}
